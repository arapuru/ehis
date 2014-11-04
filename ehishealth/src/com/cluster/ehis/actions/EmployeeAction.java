/**
 * 
 */
package com.cluster.ehis.actions;

import java.util.ArrayList;
import java.util.List;

import com.cluster.ehis.beans.Employee;
import com.opensymphony.xwork2.ActionSupport;
 
public class EmployeeAction extends ActionSupport {
 
 /**
  * 
  */
 private static final long serialVersionUID = 1L;
 
 private List<Employee> employees = new ArrayList<Employee>();
 
 public String fetchEmployeeList() {
 
  employees.add(new Employee("001", "Arun", "java", 5000));
  employees.add(new Employee("002", "Anu", "java", 6000));
  employees.add(new Employee("003", "Aryan", "java", 8000));
  employees.add(new Employee("004", "Alex", "php", 1000));
  employees.add(new Employee("005", "Jass", ".net", 10000));
  employees.add(new Employee("006", "Jassica", "java-script", 15000));
  employees.add(new Employee("007", "Akon", "sql", 5050));
  employees.add(new Employee("008", "Himesh", "oracle", 4000));
  employees.add(new Employee("009", "Sonu", "perl", 8000));
  employees.add(new Employee("010", "Jon", "apple-script", 4000));
  employees.add(new Employee("011", "Andrew", "Html", 8000));
  employees.add(new Employee("012", "Raj", "Design", 9000));
  employees.add(new Employee("013", "Nikoles", "java", 4500));
  return SUCCESS;
 }
 
 public List<Employee> getEmployees() {
  return employees;
 }
 
 public void setEmployees(List<Employee> employees) {
  this.employees = employees;
 }
 
}