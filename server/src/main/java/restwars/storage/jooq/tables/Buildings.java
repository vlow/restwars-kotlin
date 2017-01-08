/*
 * This file is generated by jOOQ.
*/
package restwars.storage.jooq.tables;


import org.jooq.*;
import org.jooq.impl.TableImpl;
import restwars.storage.jooq.Keys;
import restwars.storage.jooq.Public;
import restwars.storage.jooq.tables.records.BuildingsRecord;

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
public class Buildings extends TableImpl<BuildingsRecord> {

    private static final long serialVersionUID = -151512985;

    /**
     * The reference instance of <code>PUBLIC.BUILDINGS</code>
     */
    public static final Buildings BUILDINGS = new Buildings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BuildingsRecord> getRecordType() {
        return BuildingsRecord.class;
    }

    /**
     * The column <code>PUBLIC.BUILDINGS.ID</code>.
     */
    public final TableField<BuildingsRecord, UUID> ID = createField("ID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BUILDINGS.PLANET_ID</code>.
     */
    public final TableField<BuildingsRecord, UUID> PLANET_ID = createField("PLANET_ID", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BUILDINGS.TYPE</code>.
     */
    public final TableField<BuildingsRecord, String> TYPE = createField("TYPE", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BUILDINGS.LEVEL</code>.
     */
    public final TableField<BuildingsRecord, Integer> LEVEL = createField("LEVEL", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>PUBLIC.BUILDINGS</code> table reference
     */
    public Buildings() {
        this("BUILDINGS", null);
    }

    /**
     * Create an aliased <code>PUBLIC.BUILDINGS</code> table reference
     */
    public Buildings(String alias) {
        this(alias, BUILDINGS);
    }

    private Buildings(String alias, Table<BuildingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Buildings(String alias, Table<BuildingsRecord> aliased, Field<?>[] parameters) {
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
    public UniqueKey<BuildingsRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_5;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BuildingsRecord>> getKeys() {
        return Arrays.<UniqueKey<BuildingsRecord>>asList(Keys.CONSTRAINT_5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BuildingsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BuildingsRecord, ?>>asList(Keys.CONSTRAINT_52);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Buildings as(String alias) {
        return new Buildings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Buildings rename(String name) {
        return new Buildings(name, null);
    }
}
