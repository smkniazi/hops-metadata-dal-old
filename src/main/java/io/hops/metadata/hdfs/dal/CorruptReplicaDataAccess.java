package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface CorruptReplicaDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  int countAllUniqueBlk() throws StorageException;

  T findByPk(long blockId, int storageId, int inodeId) throws StorageException;

  List<T> findAll() throws StorageException;

  List<T> findByBlockId(long blockId, int inodeId) throws StorageException;
  
  List<T> findByINodeId(int inodeId) throws StorageException;
  
  List<T> findByINodeIds(int[] inodeIds) throws StorageException;
  
  void prepare(Collection<T> removed, Collection<T> newed,
      Collection<T> modified) throws StorageException;
}