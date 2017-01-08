/*
 * This file is generated by jOOQ.
*/
package restwars.storage.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;
import restwars.storage.jooq.tables.Flights;

import javax.annotation.Generated;
import java.util.UUID;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.0"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class FlightsRecord extends UpdatableRecordImpl<FlightsRecord> implements Record16<UUID, UUID, Integer, Integer, Integer, Integer, Integer, Integer, Long, Long, String, String, Integer, Integer, Boolean, Double> {

    private static final long serialVersionUID = -22728329;

    /**
     * Setter for <code>PUBLIC.FLIGHTS.ID</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.ID</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.PLAYER_ID</code>.
     */
    public void setPlayerId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.PLAYER_ID</code>.
     */
    public UUID getPlayerId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.START_GALAXY</code>.
     */
    public void setStartGalaxy(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.START_GALAXY</code>.
     */
    public Integer getStartGalaxy() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.START_SYSTEM</code>.
     */
    public void setStartSystem(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.START_SYSTEM</code>.
     */
    public Integer getStartSystem() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.START_PLANET</code>.
     */
    public void setStartPlanet(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.START_PLANET</code>.
     */
    public Integer getStartPlanet() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.DESTINATION_GALAXY</code>.
     */
    public void setDestinationGalaxy(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.DESTINATION_GALAXY</code>.
     */
    public Integer getDestinationGalaxy() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.DESTINATION_SYSTEM</code>.
     */
    public void setDestinationSystem(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.DESTINATION_SYSTEM</code>.
     */
    public Integer getDestinationSystem() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.DESTINATION_PLANET</code>.
     */
    public void setDestinationPlanet(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.DESTINATION_PLANET</code>.
     */
    public Integer getDestinationPlanet() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.STARTED_IN_ROUND</code>.
     */
    public void setStartedInRound(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.STARTED_IN_ROUND</code>.
     */
    public Long getStartedInRound() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.ARRIVAL_IN_ROUND</code>.
     */
    public void setArrivalInRound(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.ARRIVAL_IN_ROUND</code>.
     */
    public Long getArrivalInRound() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.DIRECTION</code>.
     */
    public void setDirection(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.DIRECTION</code>.
     */
    public String getDirection() {
        return (String) get(10);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.TYPE</code>.
     */
    public void setType(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.TYPE</code>.
     */
    public String getType() {
        return (String) get(11);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.CARGO_CRYSTAL</code>.
     */
    public void setCargoCrystal(Integer value) {
        set(12, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.CARGO_CRYSTAL</code>.
     */
    public Integer getCargoCrystal() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.CARGO_GAS</code>.
     */
    public void setCargoGas(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.CARGO_GAS</code>.
     */
    public Integer getCargoGas() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.DETECTED</code>.
     */
    public void setDetected(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.DETECTED</code>.
     */
    public Boolean getDetected() {
        return (Boolean) get(14);
    }

    /**
     * Setter for <code>PUBLIC.FLIGHTS.SPEED</code>.
     */
    public void setSpeed(Double value) {
        set(15, value);
    }

    /**
     * Getter for <code>PUBLIC.FLIGHTS.SPEED</code>.
     */
    public Double getSpeed() {
        return (Double) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UUID, UUID, Integer, Integer, Integer, Integer, Integer, Integer, Long, Long, String, String, Integer, Integer, Boolean, Double> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UUID, UUID, Integer, Integer, Integer, Integer, Integer, Integer, Long, Long, String, String, Integer, Integer, Boolean, Double> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Flights.FLIGHTS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field2() {
        return Flights.FLIGHTS.PLAYER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Flights.FLIGHTS.START_GALAXY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Flights.FLIGHTS.START_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Flights.FLIGHTS.START_PLANET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Flights.FLIGHTS.DESTINATION_GALAXY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Flights.FLIGHTS.DESTINATION_SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Flights.FLIGHTS.DESTINATION_PLANET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Flights.FLIGHTS.STARTED_IN_ROUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return Flights.FLIGHTS.ARRIVAL_IN_ROUND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Flights.FLIGHTS.DIRECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return Flights.FLIGHTS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return Flights.FLIGHTS.CARGO_CRYSTAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return Flights.FLIGHTS.CARGO_GAS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field15() {
        return Flights.FLIGHTS.DETECTED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Double> field16() {
        return Flights.FLIGHTS.SPEED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value2() {
        return getPlayerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getStartGalaxy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getStartSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStartPlanet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getDestinationGalaxy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDestinationSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getDestinationPlanet();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getStartedInRound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getArrivalInRound();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getDirection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getCargoCrystal();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getCargoGas();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value15() {
        return getDetected();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Double value16() {
        return getSpeed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value2(UUID value) {
        setPlayerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value3(Integer value) {
        setStartGalaxy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value4(Integer value) {
        setStartSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value5(Integer value) {
        setStartPlanet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value6(Integer value) {
        setDestinationGalaxy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value7(Integer value) {
        setDestinationSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value8(Integer value) {
        setDestinationPlanet(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value9(Long value) {
        setStartedInRound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value10(Long value) {
        setArrivalInRound(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value11(String value) {
        setDirection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value12(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value13(Integer value) {
        setCargoCrystal(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value14(Integer value) {
        setCargoGas(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value15(Boolean value) {
        setDetected(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord value16(Double value) {
        setSpeed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightsRecord values(UUID value1, UUID value2, Integer value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Long value9, Long value10, String value11, String value12, Integer value13, Integer value14, Boolean value15, Double value16) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FlightsRecord
     */
    public FlightsRecord() {
        super(Flights.FLIGHTS);
    }

    /**
     * Create a detached, initialised FlightsRecord
     */
    public FlightsRecord(UUID id, UUID playerId, Integer startGalaxy, Integer startSystem, Integer startPlanet, Integer destinationGalaxy, Integer destinationSystem, Integer destinationPlanet, Long startedInRound, Long arrivalInRound, String direction, String type, Integer cargoCrystal, Integer cargoGas, Boolean detected, Double speed) {
        super(Flights.FLIGHTS);

        set(0, id);
        set(1, playerId);
        set(2, startGalaxy);
        set(3, startSystem);
        set(4, startPlanet);
        set(5, destinationGalaxy);
        set(6, destinationSystem);
        set(7, destinationPlanet);
        set(8, startedInRound);
        set(9, arrivalInRound);
        set(10, direction);
        set(11, type);
        set(12, cargoCrystal);
        set(13, cargoGas);
        set(14, detected);
        set(15, speed);
    }
}
