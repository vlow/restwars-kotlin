/*
 * This file is generated by jOOQ.
*/
package restwars.storage.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;
import restwars.storage.jooq.tables.FightShips;

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
public class FightShipsRecord extends TableRecordImpl<FightShipsRecord> implements Record4<UUID, String, String, Integer> {

    private static final long serialVersionUID = -1513433411;

    /**
     * Setter for <code>PUBLIC.FIGHT_SHIPS.FIGHT_ID</code>.
     */
    public void setFightId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.FIGHT_SHIPS.FIGHT_ID</code>.
     */
    public UUID getFightId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>PUBLIC.FIGHT_SHIPS.SHIP_TYPE</code>.
     */
    public void setShipType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.FIGHT_SHIPS.SHIP_TYPE</code>.
     */
    public String getShipType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.FIGHT_SHIPS.TYPE</code>.
     */
    public void setType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>PUBLIC.FIGHT_SHIPS.TYPE</code>.
     */
    public String getType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.FIGHT_SHIPS.AMOUNT</code>.
     */
    public void setAmount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>PUBLIC.FIGHT_SHIPS.AMOUNT</code>.
     */
    public Integer getAmount() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, String, String, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, String, String, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return FightShips.FIGHT_SHIPS.FIGHT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FightShips.FIGHT_SHIPS.SHIP_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FightShips.FIGHT_SHIPS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return FightShips.FIGHT_SHIPS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getFightId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getShipType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FightShipsRecord value1(UUID value) {
        setFightId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FightShipsRecord value2(String value) {
        setShipType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FightShipsRecord value3(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FightShipsRecord value4(Integer value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FightShipsRecord values(UUID value1, String value2, String value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FightShipsRecord
     */
    public FightShipsRecord() {
        super(FightShips.FIGHT_SHIPS);
    }

    /**
     * Create a detached, initialised FightShipsRecord
     */
    public FightShipsRecord(UUID fightId, String shipType, String type, Integer amount) {
        super(FightShips.FIGHT_SHIPS);

        set(0, fightId);
        set(1, shipType);
        set(2, type);
        set(3, amount);
    }
}
