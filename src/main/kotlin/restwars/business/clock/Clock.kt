package restwars.business.clock

import org.slf4j.LoggerFactory
import restwars.business.building.Building
import restwars.business.building.BuildingService
import restwars.business.planet.Planet
import restwars.business.planet.PlanetService
import restwars.business.planet.Resources
import restwars.business.resource.ResourceService

interface Clock {
    fun tick()
}

class ClockImpl(val planetService: PlanetService, val resourceService: ResourceService, val buildingService: BuildingService) : Clock {
    private val logger = LoggerFactory.getLogger(ClockImpl::class.java)

    override fun tick() {
        logger.debug("Tick")

        for (planet in planetService.findAllInhabitated()) {
            var updatedPlanet = planet
            val buildings = buildingService.findByPlanet(updatedPlanet)
            updatedPlanet = gatherResources(buildings, updatedPlanet)
        }
    }

    private fun gatherResources(buildings: List<Building>, planet: Planet): Planet {
        logger.debug("Gathering resources on {}", planet.location)

        val gatheredResources = calculateGatheredResources(buildings)
        return planetService.addResources(planet, gatheredResources)
    }

    private fun calculateGatheredResources(buildings: List<Building>): Resources {
        var gatheredTotal = Resources.none()

        for (building in buildings) {
            val gatheredFromBuilding = resourceService.calculateGatheredResources(building.type, building.level)
            gatheredTotal += gatheredFromBuilding
        }

        return gatheredTotal
    }
}