package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author nickstanogias
 */
public interface SequenceNumberDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;
}