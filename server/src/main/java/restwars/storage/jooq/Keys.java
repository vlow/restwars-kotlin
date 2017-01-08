/*
 * This file is generated by jOOQ.
*/
package restwars.storage.jooq;


import org.jooq.ForeignKey;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import restwars.storage.jooq.tables.*;
import restwars.storage.jooq.tables.records.*;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships between tables of the <code>PUBLIC</code> 
 * schema
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<PlayersRecord> CONSTRAINT_D = UniqueKeys0.CONSTRAINT_D;
    public static final UniqueKey<PlayersRecord> CONSTRAINT_D6 = UniqueKeys0.CONSTRAINT_D6;
    public static final UniqueKey<PlanetsRecord> CONSTRAINT_D5 = UniqueKeys0.CONSTRAINT_D5;
    public static final UniqueKey<BuildingsRecord> CONSTRAINT_5 = UniqueKeys0.CONSTRAINT_5;
    public static final UniqueKey<ConstructionSitesRecord> CONSTRAINT_7 = UniqueKeys0.CONSTRAINT_7;
    public static final UniqueKey<ShipsInConstructionRecord> CONSTRAINT_3 = UniqueKeys0.CONSTRAINT_3;
    public static final UniqueKey<PointsRecord> CONSTRAINT_8 = UniqueKeys0.CONSTRAINT_8;
    public static final UniqueKey<EventsRecord> CONSTRAINT_7A = UniqueKeys0.CONSTRAINT_7A;
    public static final UniqueKey<HangarRecord> CONSTRAINT_7E9 = UniqueKeys0.CONSTRAINT_7E9;
    public static final UniqueKey<HangarRecord> CONSTRAINT_7E95 = UniqueKeys0.CONSTRAINT_7E95;
    public static final UniqueKey<FlightsRecord> CONSTRAINT_F = UniqueKeys0.CONSTRAINT_F;
    public static final UniqueKey<FightsRecord> CONSTRAINT_7B = UniqueKeys0.CONSTRAINT_7B;
    public static final UniqueKey<DetectedFlightsRecord> CONSTRAINT_2 = UniqueKeys0.CONSTRAINT_2;
    public static final UniqueKey<DetectedFlightsRecord> CONSTRAINT_2A = UniqueKeys0.CONSTRAINT_2A;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<PlanetsRecord, PlayersRecord> CONSTRAINT_D5B = ForeignKeys0.CONSTRAINT_D5B;
    public static final ForeignKey<BuildingsRecord, PlanetsRecord> CONSTRAINT_52 = ForeignKeys0.CONSTRAINT_52;
    public static final ForeignKey<ConstructionSitesRecord, PlanetsRecord> CONSTRAINT_7E = ForeignKeys0.CONSTRAINT_7E;
    public static final ForeignKey<ShipsInConstructionRecord, PlanetsRecord> CONSTRAINT_31 = ForeignKeys0.CONSTRAINT_31;
    public static final ForeignKey<PointsRecord, PlayersRecord> CONSTRAINT_8C = ForeignKeys0.CONSTRAINT_8C;
    public static final ForeignKey<EventsRecord, PlayersRecord> CONSTRAINT_7A9 = ForeignKeys0.CONSTRAINT_7A9;
    public static final ForeignKey<EventsRecord, PlanetsRecord> CONSTRAINT_7A9A = ForeignKeys0.CONSTRAINT_7A9A;
    public static final ForeignKey<HangarRecord, PlanetsRecord> CONSTRAINT_7E956 = ForeignKeys0.CONSTRAINT_7E956;
    public static final ForeignKey<HangarShipsRecord, HangarRecord> CONSTRAINT_7E1 = ForeignKeys0.CONSTRAINT_7E1;
    public static final ForeignKey<FlightsRecord, PlayersRecord> CONSTRAINT_FC = ForeignKeys0.CONSTRAINT_FC;
    public static final ForeignKey<FlightShipsRecord, FlightsRecord> CONSTRAINT_50 = ForeignKeys0.CONSTRAINT_50;
    public static final ForeignKey<FightsRecord, PlayersRecord> CONSTRAINT_7B9 = ForeignKeys0.CONSTRAINT_7B9;
    public static final ForeignKey<FightsRecord, PlayersRecord> CONSTRAINT_7B99 = ForeignKeys0.CONSTRAINT_7B99;
    public static final ForeignKey<FightsRecord, PlanetsRecord> CONSTRAINT_7B994 = ForeignKeys0.CONSTRAINT_7B994;
    public static final ForeignKey<FightShipsRecord, FightsRecord> CONSTRAINT_B = ForeignKeys0.CONSTRAINT_B;
    public static final ForeignKey<DetectedFlightsRecord, FlightsRecord> CONSTRAINT_2AD = ForeignKeys0.CONSTRAINT_2AD;
    public static final ForeignKey<DetectedFlightsRecord, PlayersRecord> CONSTRAINT_2AD5 = ForeignKeys0.CONSTRAINT_2AD5;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<PlayersRecord> CONSTRAINT_D = createUniqueKey(Players.PLAYERS, "CONSTRAINT_D", Players.PLAYERS.ID);
        public static final UniqueKey<PlayersRecord> CONSTRAINT_D6 = createUniqueKey(Players.PLAYERS, "CONSTRAINT_D6", Players.PLAYERS.USERNAME);
        public static final UniqueKey<PlanetsRecord> CONSTRAINT_D5 = createUniqueKey(Planets.PLANETS, "CONSTRAINT_D5", Planets.PLANETS.ID);
        public static final UniqueKey<BuildingsRecord> CONSTRAINT_5 = createUniqueKey(Buildings.BUILDINGS, "CONSTRAINT_5", Buildings.BUILDINGS.ID);
        public static final UniqueKey<ConstructionSitesRecord> CONSTRAINT_7 = createUniqueKey(ConstructionSites.CONSTRUCTION_SITES, "CONSTRAINT_7", ConstructionSites.CONSTRUCTION_SITES.ID);
        public static final UniqueKey<ShipsInConstructionRecord> CONSTRAINT_3 = createUniqueKey(ShipsInConstruction.SHIPS_IN_CONSTRUCTION, "CONSTRAINT_3", ShipsInConstruction.SHIPS_IN_CONSTRUCTION.ID);
        public static final UniqueKey<PointsRecord> CONSTRAINT_8 = createUniqueKey(Points.POINTS, "CONSTRAINT_8", Points.POINTS.ID);
        public static final UniqueKey<EventsRecord> CONSTRAINT_7A = createUniqueKey(Events.EVENTS, "CONSTRAINT_7A", Events.EVENTS.ID);
        public static final UniqueKey<HangarRecord> CONSTRAINT_7E9 = createUniqueKey(Hangar.HANGAR, "CONSTRAINT_7E9", Hangar.HANGAR.ID);
        public static final UniqueKey<HangarRecord> CONSTRAINT_7E95 = createUniqueKey(Hangar.HANGAR, "CONSTRAINT_7E95", Hangar.HANGAR.PLANET_ID);
        public static final UniqueKey<FlightsRecord> CONSTRAINT_F = createUniqueKey(Flights.FLIGHTS, "CONSTRAINT_F", Flights.FLIGHTS.ID);
        public static final UniqueKey<FightsRecord> CONSTRAINT_7B = createUniqueKey(Fights.FIGHTS, "CONSTRAINT_7B", Fights.FIGHTS.ID);
        public static final UniqueKey<DetectedFlightsRecord> CONSTRAINT_2 = createUniqueKey(DetectedFlights.DETECTED_FLIGHTS, "CONSTRAINT_2", DetectedFlights.DETECTED_FLIGHTS.ID);
        public static final UniqueKey<DetectedFlightsRecord> CONSTRAINT_2A = createUniqueKey(DetectedFlights.DETECTED_FLIGHTS, "CONSTRAINT_2A", DetectedFlights.DETECTED_FLIGHTS.FLIGHT_ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<PlanetsRecord, PlayersRecord> CONSTRAINT_D5B = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, Planets.PLANETS, "CONSTRAINT_D5B", Planets.PLANETS.OWNER_ID);
        public static final ForeignKey<BuildingsRecord, PlanetsRecord> CONSTRAINT_52 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D5, Buildings.BUILDINGS, "CONSTRAINT_52", Buildings.BUILDINGS.PLANET_ID);
        public static final ForeignKey<ConstructionSitesRecord, PlanetsRecord> CONSTRAINT_7E = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D5, ConstructionSites.CONSTRUCTION_SITES, "CONSTRAINT_7E", ConstructionSites.CONSTRUCTION_SITES.PLANET_ID);
        public static final ForeignKey<ShipsInConstructionRecord, PlanetsRecord> CONSTRAINT_31 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D5, ShipsInConstruction.SHIPS_IN_CONSTRUCTION, "CONSTRAINT_31", ShipsInConstruction.SHIPS_IN_CONSTRUCTION.PLANET_ID);
        public static final ForeignKey<PointsRecord, PlayersRecord> CONSTRAINT_8C = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, Points.POINTS, "CONSTRAINT_8C", Points.POINTS.PLAYER_ID);
        public static final ForeignKey<EventsRecord, PlayersRecord> CONSTRAINT_7A9 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, Events.EVENTS, "CONSTRAINT_7A9", Events.EVENTS.PLAYER_ID);
        public static final ForeignKey<EventsRecord, PlanetsRecord> CONSTRAINT_7A9A = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D5, Events.EVENTS, "CONSTRAINT_7A9A", Events.EVENTS.PLANET_ID);
        public static final ForeignKey<HangarRecord, PlanetsRecord> CONSTRAINT_7E956 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D5, Hangar.HANGAR, "CONSTRAINT_7E956", Hangar.HANGAR.PLANET_ID);
        public static final ForeignKey<HangarShipsRecord, HangarRecord> CONSTRAINT_7E1 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_7E9, HangarShips.HANGAR_SHIPS, "CONSTRAINT_7E1", HangarShips.HANGAR_SHIPS.HANGAR_ID);
        public static final ForeignKey<FlightsRecord, PlayersRecord> CONSTRAINT_FC = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, Flights.FLIGHTS, "CONSTRAINT_FC", Flights.FLIGHTS.PLAYER_ID);
        public static final ForeignKey<FlightShipsRecord, FlightsRecord> CONSTRAINT_50 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_F, FlightShips.FLIGHT_SHIPS, "CONSTRAINT_50", FlightShips.FLIGHT_SHIPS.FLIGHT_ID);
        public static final ForeignKey<FightsRecord, PlayersRecord> CONSTRAINT_7B9 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, Fights.FIGHTS, "CONSTRAINT_7B9", Fights.FIGHTS.ATTACKER_ID);
        public static final ForeignKey<FightsRecord, PlayersRecord> CONSTRAINT_7B99 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, Fights.FIGHTS, "CONSTRAINT_7B99", Fights.FIGHTS.DEFENDER_ID);
        public static final ForeignKey<FightsRecord, PlanetsRecord> CONSTRAINT_7B994 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D5, Fights.FIGHTS, "CONSTRAINT_7B994", Fights.FIGHTS.PLANET_ID);
        public static final ForeignKey<FightShipsRecord, FightsRecord> CONSTRAINT_B = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_7B, FightShips.FIGHT_SHIPS, "CONSTRAINT_B", FightShips.FIGHT_SHIPS.FIGHT_ID);
        public static final ForeignKey<DetectedFlightsRecord, FlightsRecord> CONSTRAINT_2AD = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_F, DetectedFlights.DETECTED_FLIGHTS, "CONSTRAINT_2AD", DetectedFlights.DETECTED_FLIGHTS.FLIGHT_ID);
        public static final ForeignKey<DetectedFlightsRecord, PlayersRecord> CONSTRAINT_2AD5 = createForeignKey(restwars.storage.jooq.Keys.CONSTRAINT_D, DetectedFlights.DETECTED_FLIGHTS, "CONSTRAINT_2AD5", DetectedFlights.DETECTED_FLIGHTS.PLAYER_ID);
    }
}
