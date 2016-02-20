package restwars.storage

import org.slf4j.LoggerFactory
import restwars.business.ship.*
import java.nio.file.Path
import java.util.*
import java.util.concurrent.CopyOnWriteArrayList

object InMemoryShipInConstructionRepository : ShipInConstructionRepository, PersistentRepository {
    private val logger = LoggerFactory.getLogger(javaClass)
    private var shipsInConstruction: MutableList<ShipInConstruction> = CopyOnWriteArrayList()

    override fun insert(shipInConstruction: ShipInConstruction) {
        logger.debug("Inserting {}", shipInConstruction)
        shipsInConstruction.add(shipInConstruction)
    }

    override fun delete(id: UUID) {
        logger.debug("Deleting ship in construction with id {}", id)
        shipsInConstruction.removeAll { it.id == id }
    }

    override fun findByDone(done: Long): List<ShipInConstruction> {
        return shipsInConstruction.filter { it.done == done }
    }

    override fun findByPlanetId(planetId: UUID): List<ShipInConstruction> {
        return shipsInConstruction.filter { it.planetId == planetId }
    }

    override fun countByPlanetId(planetId: UUID): Int {
        return shipsInConstruction.count { it.planetId == planetId }
    }

    override fun persist(path: Path) {
        Persister.saveData(path, shipsInConstruction)
    }

    @Suppress("UNCHECKED_CAST")
    override fun load(path: Path) {
        shipsInConstruction = Persister.loadData(path) as MutableList<ShipInConstruction>
    }
}

object InMemoryHangarRepository : HangarRepository, PersistentRepository {
    private val logger = LoggerFactory.getLogger(javaClass)
    private var hangars: MutableList<Hangar> = CopyOnWriteArrayList()

    override fun findByPlanetId(planetId: UUID): Hangar? {
        return hangars.find { it.planetId == planetId }
    }

    override fun insert(hangar: Hangar) {
        logger.debug("Inserting {}", hangar)
        hangars.add(hangar)
    }

    override fun updateShips(hangarId: UUID, type: ShipType, newAmount: Int) {
        logger.debug("Updating ships in hangar with id {}: type {}, new amount: {}", hangarId, type, newAmount)

        val index = hangars.indexOfFirst { it.id == hangarId }
        if (index == -1) throw IllegalStateException("No hangar with id $hangarId found")

        val hangar = hangars[index]
        hangars[index] = hangar.copy(ships = hangar.ships.with(type, newAmount))
    }

    override fun persist(path: Path) {
        Persister.saveData(path, hangars)
    }

    @Suppress("UNCHECKED_CAST")
    override fun load(path: Path) {
        hangars = Persister.loadData(path) as MutableList<Hangar>
    }
}