package restwars.business.fight

import org.slf4j.LoggerFactory
import restwars.business.RandomNumberGenerator
import restwars.business.ShipFormulas
import restwars.business.UUIDFactory
import restwars.business.planet.Planet
import restwars.business.player.Player
import restwars.business.ship.ShipType
import restwars.business.ship.Ships
import java.util.*

data class Fight(val id: UUID, val attackerId: UUID, val defenderId: UUID, val planetId: UUID,
                 val attackerShips: Ships, val defenderShips: Ships, val remainingAttackerShips: Ships,
                 val remainingDefenderShips: Ships, val round: Long
)

interface FightCalculator {
    fun attack(attacker: Player, defender: Player, planet: Planet, attackerShips: Ships, defenderShips: Ships, round: Long): Fight
}

class FightCalculatorImpl(
        private val uuidFactory: UUIDFactory,
        private val shipFormulas: ShipFormulas,
        private val randomNumberGenerator: RandomNumberGenerator
) : FightCalculator {
    private val logger = LoggerFactory.getLogger(javaClass)

    override fun attack(attacker: Player, defender: Player, planet: Planet, attackerShips: Ships, defenderShips: Ships, round: Long): Fight {
        logger.debug("Fight between {} and {}", attackerShips, defenderShips)

        val remainingDefenderShips = fight(attackerShips, defenderShips)
        val remainingAttackerShips = fight(defenderShips, attackerShips)

        return Fight(uuidFactory.create(), attacker.id, defender.id, planet.id, attackerShips, defenderShips, remainingAttackerShips, remainingDefenderShips, round)
    }

    private fun fight(attackerShips: Ships, defenderShips: Ships): Ships {
        var attackerAttackPoints = attackerShips.ships.sumBy { shipFormulas.calculateAttackPoints(it.type) * it.amount }
        logger.debug("Attacker attack points: $attackerAttackPoints")

        var remainingDefendingShips = defenderShips
        while (attackerAttackPoints > 0) {
            val destroyableShips = findDestroyableShips(remainingDefendingShips, attackerAttackPoints);
            if (destroyableShips.isEmpty()) {
                break;
            }

            val shipToDestroy = randomNumberGenerator.nextElement(destroyableShips)
            logger.trace("Destroying $shipToDestroy")
            remainingDefendingShips -= Ships.of(shipToDestroy, 1)

            attackerAttackPoints -= shipFormulas.calculateDefendPoints(shipToDestroy)
            logger.trace("Attacker attack points: $attackerAttackPoints")
        }

        logger.debug("Remaining defending ships: $remainingDefendingShips")
        return remainingDefendingShips
    }

    /**
     * Returns a list of ship types which can be destroyed with the given [attackPoints].
     */
    private fun findDestroyableShips(ships: Ships, attackPoints: Int): List<ShipType> {
        return ships.ships.filter { shipFormulas.calculateDefendPoints(it.type) <= attackPoints }.map { it.type }
    }
}