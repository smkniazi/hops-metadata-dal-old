package se.sics.hop.metadata.hdfs.entity.hop;

public class HopEncodingStatus {

  public static final int ENCODING_REQUESTED = 0;
  public static final int ENCODING_ACTIVE = 1;
  public static final int ENCODED = 2;
  public static final int REPAIR_ACTIVE = 3;
  public static final int REPAIR_FAILED = 4;
  public static final int ENCODING_FAILED = 5;
  public static final int ENCODING_CANCELED = 6;
  public static final int REPAIR_CANCELED = 7;
  public static final int REPAIR_REQUESTED = 8;
  public static final int POTENTIALLY_FIXED = 9;

  private long inodeId;
  private int status;
  private String codec;
  private int targetReplication;
  private long modification_time;

  public HopEncodingStatus() {

  }

  public HopEncodingStatus(long inodeId, int status, String codec, int targetReplication, long modification_time) {
    this.inodeId = inodeId;
    this.status = status;
    this.codec = codec;
    this.targetReplication = targetReplication;
    this.modification_time = modification_time;
  }

  public void setInodeId(long inodeId) {
    this.inodeId = inodeId;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public void setCodec(String codec) {
    this.codec = codec;
  }

  public void setTargetReplication(int targetReplication) {
    this.targetReplication = targetReplication;
  }

  public void setModification_time(long modification_time) {
    this.modification_time = modification_time;
  }

  public long getInodeId() {
    return inodeId;
  }

  public int getStatus() {
    return status;
  }

  public String getCodec() {
    return codec;
  }

  public int getTargetReplication() {
    return targetReplication;
  }

  public long getModificationTime() {
    return modification_time;
  }
}
