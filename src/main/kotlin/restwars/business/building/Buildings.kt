package restwars.business.building

import restwars.business.BuildingFormula
import restwars.business.UUIDFactory
import restwars.business.clock.RoundService
import restwars.business.planet.Planet
import java.util.*

enum class BuildingType {
    COMMAND_CENTER,
    CRYSTAL_MINE,
    GAS_REFINERY,
    SOLAR_PANELS;

    companion object {
        fun parse(value: String): BuildingType {
            return valueOf(value)
        }
    }
}

data class Building(val id: UUID, val planetId: UUID, val type: BuildingType, val level: Int)

data class ConstructionSite(val id: UUID, val planetId: UUID, val type: BuildingType, val level: Int, val done: Long)

interface BuildingService {
    fun createStarterBuildings(planet: Planet): List<Building>

    fun findByPlanet(planet: Planet): List<Building>

    fun build(planet: Planet, type: BuildingType): ConstructionSite
}

interface BuildingRepository {
    fun insert(building: Building)

    fun findByPlanetId(planetId: UUID): List<Building>

    fun findByPlanetIdAndType(planetId: UUID, type: BuildingType): Building?
}

interface ConstructionSiteRepository {
    fun insert(constructionSite: ConstructionSite)
}

class BuildingServiceImpl(
        val uuidFactory: UUIDFactory,
        val buildingRepository: BuildingRepository,
        val constructionSiteRepository: ConstructionSiteRepository,
        val buildingFormula: BuildingFormula,
        val roundService: RoundService
) : BuildingService {
    override fun build(planet: Planet, type: BuildingType): ConstructionSite {
        val building = buildingRepository.findByPlanetIdAndType(planet.id, type)
        // TODO: Check resources
        // TODO: Check build queues
        // TODO: Check if building type already in queue
        val level = if (building == null) {
            1
        } else {
            building.level + 1
        }

        val id = uuidFactory.create()
        val buildTime = buildingFormula.calculateBuildTime(type, level)
        val done = roundService.currentRound() + buildTime

        val constructionSite = ConstructionSite(id, planet.id, type, level, done)
        constructionSiteRepository.insert(constructionSite)
        return constructionSite
    }

    override fun findByPlanet(planet: Planet): List<Building> {
        return buildingRepository.findByPlanetId(planet.id)
    }

    override fun createStarterBuildings(planet: Planet): List<Building> {
        val buildings = listOf(
                Building(uuidFactory.create(), planet.id, BuildingType.COMMAND_CENTER, 1),
                Building(uuidFactory.create(), planet.id, BuildingType.CRYSTAL_MINE, 1),
                Building(uuidFactory.create(), planet.id, BuildingType.GAS_REFINERY, 1),
                Building(uuidFactory.create(), planet.id, BuildingType.SOLAR_PANELS, 1)
        )

        buildings.forEach { buildingRepository.insert(it) }
        return buildings
    }
}