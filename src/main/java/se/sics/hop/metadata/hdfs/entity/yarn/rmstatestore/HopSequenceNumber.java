

package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

public class HopSequenceNumber {
    private final int id;
    private final int sequencenumber;

    public HopSequenceNumber(int id, int sequencenumber) {
        this.id = id;
        this.sequencenumber = sequencenumber;
    }

    public int getId() {
        return id;
    }

    public int getSequencenumber() {
        return sequencenumber;
    }
}
