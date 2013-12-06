package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import java.util.List;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author kamal hakimzadeh
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface ReplicaUnderConstructionDataAccess<T> extends EntityDataAccess {

  List<T> findReplicaUnderConstructionByBlockId(long blockId) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}