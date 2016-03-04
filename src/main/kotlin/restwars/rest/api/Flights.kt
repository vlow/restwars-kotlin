package restwars.rest.api

import restwars.business.flight.Flight
import restwars.business.planet.Resources
import restwars.business.ship.Ship
import restwars.business.ship.ShipType
import restwars.business.ship.Ships

fun ShipsRequest.toShips(): Ships {
    val ships = ships.entries.map { Ship(ShipType.parse(it.key), it.value) }
    return Ships(ships)
}

fun CargoRequest.toResources(): Resources = Resources(crystal, gas, 0)

fun FlightsResponse.Companion.from(flights: List<Flight>) = FlightsResponse(flights.map { FlightResponse.fromFlight(it) })

fun FlightResponse.Companion.fromFlight(flight: Flight) = FlightResponse(
        LocationResponse.fromLocation(flight.start), LocationResponse.fromLocation(flight.destination),
        flight.arrivalInRound, ShipsResponse.fromShips(flight.ships)
)
