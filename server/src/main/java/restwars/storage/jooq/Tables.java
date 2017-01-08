/*
 * This file is generated by jOOQ.
*/
package restwars.storage.jooq;


import restwars.storage.jooq.tables.*;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Tables {

    /**
     * The table <code>PUBLIC.PLAYERS</code>.
     */
    public static final Players PLAYERS = restwars.storage.jooq.tables.Players.PLAYERS;

    /**
     * The table <code>PUBLIC.PLANETS</code>.
     */
    public static final Planets PLANETS = restwars.storage.jooq.tables.Planets.PLANETS;

    /**
     * The table <code>PUBLIC.BUILDINGS</code>.
     */
    public static final Buildings BUILDINGS = restwars.storage.jooq.tables.Buildings.BUILDINGS;

    /**
     * The table <code>PUBLIC.CONSTRUCTION_SITES</code>.
     */
    public static final ConstructionSites CONSTRUCTION_SITES = restwars.storage.jooq.tables.ConstructionSites.CONSTRUCTION_SITES;

    /**
     * The table <code>PUBLIC.ROUND</code>.
     */
    public static final Round ROUND = restwars.storage.jooq.tables.Round.ROUND;

    /**
     * The table <code>PUBLIC.SHIPS_IN_CONSTRUCTION</code>.
     */
    public static final ShipsInConstruction SHIPS_IN_CONSTRUCTION = restwars.storage.jooq.tables.ShipsInConstruction.SHIPS_IN_CONSTRUCTION;

    /**
     * The table <code>PUBLIC.POINTS</code>.
     */
    public static final Points POINTS = restwars.storage.jooq.tables.Points.POINTS;

    /**
     * The table <code>PUBLIC.EVENTS</code>.
     */
    public static final Events EVENTS = restwars.storage.jooq.tables.Events.EVENTS;

    /**
     * The table <code>PUBLIC.HANGAR</code>.
     */
    public static final Hangar HANGAR = restwars.storage.jooq.tables.Hangar.HANGAR;

    /**
     * The table <code>PUBLIC.HANGAR_SHIPS</code>.
     */
    public static final HangarShips HANGAR_SHIPS = restwars.storage.jooq.tables.HangarShips.HANGAR_SHIPS;

    /**
     * The table <code>PUBLIC.FLIGHTS</code>.
     */
    public static final Flights FLIGHTS = restwars.storage.jooq.tables.Flights.FLIGHTS;

    /**
     * The table <code>PUBLIC.FLIGHT_SHIPS</code>.
     */
    public static final FlightShips FLIGHT_SHIPS = restwars.storage.jooq.tables.FlightShips.FLIGHT_SHIPS;

    /**
     * The table <code>PUBLIC.FIGHTS</code>.
     */
    public static final Fights FIGHTS = restwars.storage.jooq.tables.Fights.FIGHTS;

    /**
     * The table <code>PUBLIC.FIGHT_SHIPS</code>.
     */
    public static final FightShips FIGHT_SHIPS = restwars.storage.jooq.tables.FightShips.FIGHT_SHIPS;

    /**
     * The table <code>PUBLIC.DETECTED_FLIGHTS</code>.
     */
    public static final DetectedFlights DETECTED_FLIGHTS = restwars.storage.jooq.tables.DetectedFlights.DETECTED_FLIGHTS;
}
