/**
 * 
 */
package com.cluster.ehis.serviceimpl;

import com.cluster.ehis.beans.EmployeeBean;
import com.cluster.ehis.dao.EmployeeDAO;
import com.cluster.ehis.daoimpl.EmployeeDAOImpl;
import com.cluster.ehis.pojos.Employee;
import com.cluster.ehis.service.EmployeeService;
import com.cluster.ehis.utils.FormConvertor;

/**
 * @author ASUS
 *
 */
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDAO  employeeDAO  = new EmployeeDAOImpl();
	
	@Override
	public boolean saveEmployee(EmployeeBean employeeBean) {
	boolean status = false;
	
	Employee employee =  FormConvertor.convertEmployBeanToPojo(employeeBean);
	  
	  employee =  employeeDAO.saveorUpdate(employee);
	  
	  if(employee!=null){
		  status = true;
	  }
	  else{
		  status = false;
	  }
		
		return status;
	}

}
