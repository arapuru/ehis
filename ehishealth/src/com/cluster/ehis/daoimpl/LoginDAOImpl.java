/**
 * 
 */
package com.cluster.ehis.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Transaction;

import com.cluster.ehis.beans.LoginBean;
import com.cluster.ehis.dao.LoginDAO;
import com.cluster.ehis.pojos.Employee;
import com.cluster.ehis.pojos.Login;

/**
 * @author Aravind Rapuru
 *
 */
public class LoginDAOImpl extends BaseDAOImpl<Login, Integer> implements LoginDAO  {

	@Override
	public boolean loginValidate(LoginBean loginBean) {
		
		boolean loginstatus = false;
		
		String loginsql = " from Login where username=:username and password =:password";
		
		Transaction tx  =null;
		try {
			tx = getSession().beginTransaction();
					          
			Query loginQuery = getSession().createQuery(loginsql);
			
			loginQuery.setParameter("username", loginBean.getUsername());
			loginQuery.setParameter("password", loginBean.getPassword());
			
			List<Employee> results = loginQuery.list();
			
			tx.commit();
			
			if(results.get(0)!=null){
				loginstatus = true;
			}
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		
		
		return loginstatus;
	}

	@Override
	public LoginBean getValidUser(LoginBean loginBean) {
		
		LoginBean validLoginBean = null;
		
		String loginsql = " from Login where username=:username and password =:password";
		
		Transaction tx  =null;
		try {
			tx = getSession().beginTransaction();
					          
			Query loginQuery = getSession().createQuery(loginsql);
			
			loginQuery.setParameter("username", loginBean.getUsername());
			loginQuery.setParameter("password", loginBean.getPassword());
			
			List<LoginBean> results = loginQuery.list();
			
			tx.commit();
			
			if(results.get(0)!=null){
				validLoginBean = results.get(0);
			}
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		return validLoginBean;
	}

	@Override
	public String getValidUserRole(LoginBean loginBean) {
		Login loginPojo =new Login();
		
		String loginsql = " from Login where username=:username and password =:password";
		
		Transaction tx  =null;
		try {
			tx = getSession().beginTransaction();
					          
			Query loginQuery = getSession().createQuery(loginsql);
			
			loginQuery.setParameter("username", loginBean.getUsername());
			loginQuery.setParameter("password", loginBean.getPassword());
			
			List<Login> results = loginQuery.list();
			
			tx.commit();
			
			if(results.size()>0 && results.get(0)!=null){
				loginPojo = results.get(0);
			}
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}
		return loginPojo.getRole();
	}

}
