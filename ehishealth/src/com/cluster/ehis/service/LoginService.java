/**
 * 
 */
package com.cluster.ehis.service;

import java.util.ArrayList;

import com.cluster.ehis.beans.LoginBean;

/**
 * @author aravind rapuru
 *
 */
public interface LoginService {
	
	public boolean loginValidate(LoginBean  loginBean);

	public String getValidUserRole(LoginBean loginBean);

	public ArrayList getValidUserRoleMenus(LoginBean loginBean);

}
