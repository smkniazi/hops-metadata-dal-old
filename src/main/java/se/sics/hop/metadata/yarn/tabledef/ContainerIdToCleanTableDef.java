package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerIdToCleanTableDef {

    public static final String TABLE_NAME = "ha_containerid_toclean";
    public static final String CONTAINERID = "containerid";
    public static final String HOSTNAME = "hostname";
    public static final String COMMANDPORT = "commandport";
}
