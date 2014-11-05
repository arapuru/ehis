/**
 * 
 */
package com.cluster.ehis.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.cluster.ehis.beans.DepartmentBean;
import com.cluster.ehis.service.DepartmentService;
import com.cluster.ehis.serviceimpl.DepartmentServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author aravind rapuru
 *
 */
public class DepartmentAction extends ActionSupport
implements ModelDriven<DepartmentBean>,ServletRequestAware{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	DepartmentService departmentService  = new DepartmentServiceImpl();
	
	public static  List<DepartmentBean> departmentList = new ArrayList<DepartmentBean>();
	 
	DepartmentBean departmentBean = null;
	HttpServletRequest request;
	
	/**
	 * @return
	 */
	public String getAll(){
		
		departmentList = departmentService.getAll();
		
		return SUCCESS;
		
	}


	public String addDept(){
		
	 DepartmentBean departmentBean2= departmentService.addDepartment(departmentBean);
		return SUCCESS;
	}
	
	public String editDept(){
		Integer deptId = Integer.parseInt(request.getParameter("Id"));
		departmentBean = departmentService.getDepartmentById(deptId);
		return SUCCESS;
		
	}
	

	
	public List<DepartmentBean> getDepartmentList() {
		return departmentList;
	}




	public void setDepartmentList(List<DepartmentBean> departmentList) {
		DepartmentAction.departmentList = departmentList;
	}


	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
	}
 
	public HttpServletRequest getServletRequest() {
		return this.request;
	}


	@Override
	public DepartmentBean getModel() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
