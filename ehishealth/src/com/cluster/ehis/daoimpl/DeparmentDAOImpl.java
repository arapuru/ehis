/**
 * 
 */
package com.cluster.ehis.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

import com.cluster.ehis.dao.DeparmentDAO;
import com.cluster.ehis.pojos.Department;

/**
 * @author aravind
 *
 */
public class DeparmentDAOImpl extends BaseDAOImpl<Department, Integer> implements DeparmentDAO {

	@Override
	public List<Department> getALL() {
		
		List<Department> results  = null;
		String loginsql = " from Department";
		
		Transaction tx  =null;
		try {
			tx = getSession().beginTransaction();
					          
			Query loginQuery = getSession().createQuery(loginsql);
			
			results = loginQuery.list();
			
			tx.commit();
			
		}
		 catch (HibernateException e) {
				tx.rollback();
				e.printStackTrace();
			}
		return results;
	}

	@Override
	public Department saveDepartment(Department department) {

		
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	


}
