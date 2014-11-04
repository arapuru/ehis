/**
 * 
 */
package com.cluster.ehis.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cluster.ehis.beans.DepartmentBean;
import com.cluster.ehis.dao.DeparmentDAO;
import com.cluster.ehis.daoimpl.DeparmentDAOImpl;
import com.cluster.ehis.pojos.Department;
import com.cluster.ehis.service.DepartmentService;
import com.cluster.ehis.utils.FormConvertor;

/**
 * @author aravind
 *
 */
public class DepartmentServiceImpl implements DepartmentService {

	DeparmentDAO deparmentDAO = new DeparmentDAOImpl();
	
	
	@Override
	public List<DepartmentBean> getAll() {
		
	List<DepartmentBean> departmentBeans = new ArrayList<DepartmentBean>();
		
	List<Department> departments =	deparmentDAO.findAll();
	for (Department department : departments) {
		DepartmentBean departmentBean = null;
		
		departmentBean = FormConvertor.convertDepartmentPojoToBean(department);
		
		departmentBeans.add(departmentBean);
		
	}
	
		return departmentBeans;
	}


	@Override
	public DepartmentBean addDepartment(DepartmentBean departmentBean) {
		
		Department department = FormConvertor.convertDeparmentBeantoPojo(departmentBean);
		department =	deparmentDAO.saveorUpdate(department);
		
		
		return departmentBean;
	}

}
