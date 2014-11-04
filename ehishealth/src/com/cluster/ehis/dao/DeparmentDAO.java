/**
 * 
 */
package com.cluster.ehis.dao;

import java.util.List;

import com.cluster.ehis.pojos.Department;

/**
 * @author aravind
 *
 */
public interface DeparmentDAO extends BaseDAO<Department, Integer> {

	List<Department> getALL();
	
	public Department saveDepartment(Department department);


}
