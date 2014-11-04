/**
 * 
 */
package com.cluster.ehis.utils;

import com.cluster.ehis.beans.DepartmentBean;
import com.cluster.ehis.beans.EmployeeBean;
import com.cluster.ehis.beans.PatientBean;
import com.cluster.ehis.pojos.Department;
import com.cluster.ehis.pojos.Employee;
import com.cluster.ehis.pojos.Patient;

/**
 * @author Aravind Rapuru
 *
 */
public class FormConvertor {

	public static Employee convertEmployBeanToPojo(EmployeeBean employeeBean){
		Employee employee = new Employee();
		
		employee.setFirstname(employeeBean.getFirstname());
		employee.setLastname(employeeBean.getLastname());
		employee.setCellphone(employeeBean.getCellphone());
		employee.setBirthDate(employee.getBirthDate());

		return employee;
		
	}

	public static DepartmentBean convertDepartmentPojoToBean(Department department) {
		
		DepartmentBean departmentBean = new DepartmentBean();
		
		departmentBean.setName(department.getName());
		departmentBean.setDesc(department.getDescp());
		departmentBean.setId(department.getId());
		
		
		return departmentBean;
	}

	public static Department convertDeparmentBeantoPojo(DepartmentBean departmentBean) {
		Department department = new Department();
		department.setId(departmentBean.getId());
		department.setName(departmentBean.getName());
		department.setDescp(departmentBean.getDesc());
		
		return department;
	}

	public static PatientBean convertPatientPojotoBean(Patient patient) {
		PatientBean patientBean = new PatientBean();
		patientBean.setId(patient.getId());
		patientBean.setFirstname(patient.getFirstname());
		patientBean.setLastname(patient.getLastname());
		patientBean.setAddress(patient.getAddress());
		patientBean.setAge(patient.getAge());
		patientBean.setBirthdate(patient.getBirthdate());
		patientBean.setBloodgroup(patient.getBloodgroup());
		patientBean.setSex(patient.getSex());
		
		return patientBean;
	}

	public static Patient convertPatientBeantoPojo(PatientBean patientBean) {
		Patient patient = new Patient();
		patient.setFirstname(patientBean.getFirstname());
		patient.setLastname(patientBean.getLastname());
		patient.setAddress(patientBean.getAddress());
		patient.setAge(patientBean.getAge());
		patient.setBloodgroup(patientBean.getBloodgroup());
		patient.setSex(patientBean.getSex());
		return patient;
	}
	
}
