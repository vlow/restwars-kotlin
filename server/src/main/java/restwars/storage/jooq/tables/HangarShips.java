/*
 * This file is generated by jOOQ.
*/
package restwars.storage.jooq.tables;


import org.jooq.*;
import org.jooq.impl.TableImpl;
import restwars.storage.jooq.Keys;
import restwars.storage.jooq.Public;
import restwars.storage.jooq.tables.records.HangarShipsRecord;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;
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
public class HangarShips extends TableImpl<HangarShipsRecord> {

    private static final long serialVersionUID = 1492166024;

    /**
     * The reference instance of <code>PUBLIC.HANGAR_SHIPS</code>
     */
    public static final HangarShips HANGAR_SHIPS = new HangarShips();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HangarShipsRecord> getRecordType() {
        return HangarShipsRecord.class;
    }

    /**
     * The column <code>PUBLIC.HANGAR_SHIPS.HANGAR_ID</code>.
     */
    public final TableField<HangarShipsRecord, UUID> HANGAR_ID = createField("HANGAR_ID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.HANGAR_SHIPS.TYPE</code>.
     */
    public final TableField<HangarShipsRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.HANGAR_SHIPS.AMOUNT</code>.
     */
    public final TableField<HangarShipsRecord, Integer> AMOUNT = createField("AMOUNT", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.HANGAR_SHIPS</code> table reference
     */
    public HangarShips() {
        this("HANGAR_SHIPS", null);
    }

    /**
     * Create an aliased <code>PUBLIC.HANGAR_SHIPS</code> table reference
     */
    public HangarShips(String alias) {
        this(alias, HANGAR_SHIPS);
    }

    private HangarShips(String alias, Table<HangarShipsRecord> aliased) {
        this(alias, aliased, null);
    }

    private HangarShips(String alias, Table<HangarShipsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<HangarShipsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HangarShipsRecord, ?>>asList(Keys.CONSTRAINT_7E1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HangarShips as(String alias) {
        return new HangarShips(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HangarShips rename(String name) {
        return new HangarShips(name, null);
    }
}
