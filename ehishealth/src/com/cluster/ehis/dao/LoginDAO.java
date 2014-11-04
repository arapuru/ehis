/**
 * 
 */
package com.cluster.ehis.dao;

import com.cluster.ehis.beans.LoginBean;

/**
 * @author Aravind Rapuru
 *
 */
public interface LoginDAO {

	public boolean loginValidate(LoginBean loginBean);

	public LoginBean getValidUser(LoginBean loginBean);

	public String getValidUserRole(LoginBean loginBean);
}
