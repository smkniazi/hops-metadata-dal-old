package se.sics.hop.metadata.tabledef;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface INodeTableDef {

  public static final String TABLE_NAME = "inodes";
  public static final String ID = "id";
  public static final String NAME = "name";
  public static final String PARENT_ID = "parent_id";
  public static final String IS_DIR = "is_dir";
  public static final String MODIFICATION_TIME = "modification_time";
  public static final String ACCESS_TIME = "access_time";
  public static final String PERMISSION = "permission";
  public static final String IS_UNDER_CONSTRUCTION = "is_under_construction";
  public static final String CLIENT_NAME = "client_name";
  public static final String CLIENT_MACHINE = "client_machine";
  public static final String CLIENT_NODE = "client_node";
  public static final String IS_CLOSED_FILE = "is_closed_file";
  public static final String HEADER = "header";
  public static final String IS_DIR_WITH_QUOTA = "is_dir_with_quota";
  public static final String SYMLINK = "symlink";
}