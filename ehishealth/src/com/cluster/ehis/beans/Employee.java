/**
 * 
 */
package com.cluster.ehis.beans;

/**
 * @author aravind
 *
 */
public class Employee {
	 
	 private String employeeCode;
	 private String employeeName;
	 private String department;
	 private int salary;
	 
	  
	 public  Employee(String empcode,String name,String department,int salary){
	  
	  this.employeeCode=empcode;
	  this.employeeName=name;
	  this.department=department;
	  this.salary=salary;
	 
	 }
	  
	 public String getEmployeeCode() {
	  return employeeCode;
	 }
	 
	 public void setEmployeeCode(String employeeCode) {
	  this.employeeCode = employeeCode;
	 }
	 
	 public String getEmployeeName() {
	  return employeeName;
	 }
	 
	 public void setEmployeeName(String employeeName) {
	  this.employeeName = employeeName;
	 }
	 
	 public String getDepartment() {
	  return department;
	 }
	 
	 public void setDepartment(String department) {
	  this.department = department;
	 }
	 
	 public int getSalary() {
	  return salary;
	 }
	 
	 public void setSalary(int salary) {
	  this.salary = salary;
	 }
	 
	}