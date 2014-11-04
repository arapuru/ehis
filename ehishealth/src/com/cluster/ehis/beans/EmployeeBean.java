/**
 * 
 */
package com.cluster.ehis.beans;

import java.sql.Date;

/**
 * @author aravind rapuru
 *
 */
public class EmployeeBean {
	
	private String firstname;
	private String lastname;
	private Date birthDate;
	private String cellphone;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

}
