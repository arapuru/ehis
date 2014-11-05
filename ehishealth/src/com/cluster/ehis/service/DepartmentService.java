/**
 * 
 */
package com.cluster.ehis.service;

import java.util.List;

import com.cluster.ehis.beans.DepartmentBean;

/**
 * @author aravind
 *
 */
public interface DepartmentService {

	public List<DepartmentBean> getAll();

	public DepartmentBean addDepartment(DepartmentBean departmentBean);

	public DepartmentBean getDepartmentById(Integer deptId);

}
