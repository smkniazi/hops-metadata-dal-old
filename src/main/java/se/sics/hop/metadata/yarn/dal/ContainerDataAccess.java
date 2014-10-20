package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerDataAccess<T> extends EntityDataAccess {

    T findById(String id) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createContainer(T container) throws StorageException;
}