/**
 * 
 */
package com.cluster.ehis.daoimpl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;

import com.cluster.ehis.dao.BaseDAO;
import com.cluster.ehis.utils.HibernateUtil;

/**
 * @author Aravind Rapuru
 * @param <T>
 *
 */
public class BaseDAOImpl<T, ID extends Serializable> implements BaseDAO<T, ID> {
	
	 private Class<T> persistentClass;
	    private Session session;

	    @SuppressWarnings("unchecked")
		public BaseDAOImpl() {
	        this.persistentClass = (Class<T>) ((ParameterizedType) getClass()
	                .getGenericSuperclass()).getActualTypeArguments()[0];
	    }

	    public void setSession(Session s) {
	        this.session = s;
	    }

	    protected Session getSession() {
	        session = HibernateUtil.getSession();
	        if (session == null)
	            throw new IllegalStateException(
	                    "Session has not been set on DAO...");
	        return session;
	    }

	    public Class<T> getPersistentClass() {
	        return persistentClass;
	    }

	    @SuppressWarnings({ "unchecked", "deprecation" })
	    public T findById(ID id, boolean lock) {
	        T entity;
	        if (lock)
	            entity = (T) getSession().load(getPersistentClass(), id, LockMode.UPGRADE);
	        else
	            entity = (T) getSession().load(getPersistentClass(), id);

	        return entity;
	    }

	    public List<T> findAll() {
	        return findByCriteria();
	    }

	    public T saveorUpdate(T entity) {
	    	session = getSession();
	    	
	    	Transaction tx  = session.beginTransaction();
	    	
	        
	        session.save(entity);
	        tx.commit();
	       // session.close();
	        return entity;
	    }

	    public void delete(T entity) {
	        getSession().delete(entity);
	    }

	    public void flush() {
	        getSession().flush();
	    }

	    public void clear() {
	        getSession().clear();
	    }

	    /**
	     * Use this inside subclasses as a convenience method.
	     */
	    @SuppressWarnings("unchecked")
	    protected List<T> findByCriteria(Criterion... criterion) {
	    	Transaction tx = getSession().beginTransaction();
	        Criteria crit = getSession().createCriteria(getPersistentClass());
	        for (Criterion c : criterion) {
	            crit.add(c);
	        }
	        tx.commit();
	        return crit.list();
	    }

		
}
