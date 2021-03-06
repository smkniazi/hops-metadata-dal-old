package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface BlockInfoTableDef {

  public static final String TABLE_NAME = "block_infos";
  public static final String BLOCK_ID = "block_id";
  public static final String BLOCK_INDEX = "block_index";
  public static final String INODE_ID = "inode_id";
  public static final String NUM_BYTES = "num_bytes";
  public static final String GENERATION_STAMP = "generation_stamp";
  public static final String BLOCK_UNDER_CONSTRUCTION_STATE = "block_under_construction_state";
  public static final String TIME_STAMP = "time_stamp";
  public static final String PRIMARY_NODE_INDEX = "primary_node_index";
  public static final String BLOCK_RECOVERY_ID = "block_recovery_id";
}
