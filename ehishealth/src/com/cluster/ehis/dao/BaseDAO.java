/**
 * 
 */
package com.cluster.ehis.dao;

import java.io.Serializable;
import java.util.List;

/**
 * @author aravind rapuru
 *
 */
public interface BaseDAO <T,ID extends Serializable>{
	
	T findById(ID id, boolean lock);

    List<T> findAll();

    T saveorUpdate(T entity);

    void delete(T entity);
}
