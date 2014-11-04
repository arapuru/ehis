/**
 * 
 */
package com.cluster.ehis.utils;

import com.cluster.ehis.beans.EmployeeBean;
import com.cluster.ehis.dao.EmployeeDAO;
import com.cluster.ehis.daoimpl.EmployeeDAOImpl;
import com.cluster.ehis.service.EmployeeService;
import com.cluster.ehis.serviceimpl.EmployeeServiceImpl;

/**
 * @author ASUS
 *
 */
public class Testclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		HibernateUtil.getSessionFactory();
		
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		EmployeeBean employeeBean = new EmployeeBean();
		
		employeeBean.setFirstname("aravind");
		employeeBean.setLastname("rapuru");
		employeeBean.setCellphone("1231445345");
		
		
		employeeService.saveEmployee(employeeBean); 

		
		
		//employeeDAO.delete(entity);
		
	}

}
