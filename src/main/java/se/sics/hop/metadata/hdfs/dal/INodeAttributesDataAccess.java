package se.sics.hop.metadata.hdfs.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;

/**
 *
 * @author salman
 * @author Mahmoud Ismail <maism@sics.se>
 */
public interface INodeAttributesDataAccess<T> extends EntityDataAccess {

  T findAttributesByPk(Integer inodeId) throws StorageException;
  
  Collection<T> findAttributesByPkList(Collection<Integer> inodeIds) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}
