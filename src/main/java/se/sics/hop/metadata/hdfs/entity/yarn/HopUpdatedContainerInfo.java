package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopUpdatedContainerInfo {

    private final int id;
    private final String hostname;
    private final int commandport;

    public HopUpdatedContainerInfo(int id, String hostname, int commandport) {
        this.id = id;
        this.hostname = hostname;
        this.commandport = commandport;
    }

    public int getId() {
        return id;
    }

    public String getHostname() {
        return hostname;
    }

    public int getCommandport() {
        return commandport;
    }
}
