package se.sics.hop.metadata.hdfs.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface LeaseTableDef {

  public static final String TABLE_NAME = "leases";
  public static final String HOLDER = "holder";
  public static final String LAST_UPDATE = "last_update";
  public static final String HOLDER_ID = "holder_id";
  public static final String PART_KEY = "part_key";
  public static final int PART_KEY_VAL = 0;
}
