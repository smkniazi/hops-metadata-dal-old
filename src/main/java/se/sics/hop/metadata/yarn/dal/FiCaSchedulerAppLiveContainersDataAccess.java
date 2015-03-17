

package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.HopFiCaSchedulerAppLiveContainers;

public interface FiCaSchedulerAppLiveContainersDataAccess<T> extends EntityDataAccess {
    List<T> findById(String ficaId) throws StorageException;
    
    Map<String, List<HopFiCaSchedulerAppLiveContainers>> getAll()throws StorageException;
    
    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
