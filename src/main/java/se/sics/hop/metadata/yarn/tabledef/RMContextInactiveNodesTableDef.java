package se.sics.hop.metadata.yarn.tabledef;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMContextInactiveNodesTableDef {

    public static final String TABLE_NAME = "ha_rmctx_inactivenodes";
    public static final String RMCONTEXT_ID = "rmcontext_id";
    public static final String HOST = "host";
    public static final String RMNODE_ID = "rmnode_id";
}
