

package se.sics.hop.metadata.hdfs.entity.yarn.appmasterrpc;

public class HopAppMasterRPC {
    private final int id;
    private final Type type;
//    private final String type;
    private final byte[] rpc;
    private final String userId;

  public HopAppMasterRPC(int id) {
    this(id, null, null, null);
  }
    
    
    public HopAppMasterRPC(int id, Type type, byte[] rpc, String userId) {
        this.id = id;
        this.type = type;
        this.rpc = rpc;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public Type getType() {
        return type;
    }

    public byte[] getRpc() {
        return rpc;
    }

  public String getUserId() {
    return userId;
  }
    
    public enum Type{
      RegisterApplicationMaster,
      FinishApplicationMaster,
      Allocate,
      SubmitApplication,
      ForceKillApplication,
      RegisterNM,
      NodeHeartbeat;
    }
}

    
