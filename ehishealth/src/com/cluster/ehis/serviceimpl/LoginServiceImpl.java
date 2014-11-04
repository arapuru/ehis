/**
 * 
 */
package com.cluster.ehis.serviceimpl;

import java.util.ArrayList;

import com.cluster.ehis.beans.LoginBean;
import com.cluster.ehis.dao.LoginDAO;
import com.cluster.ehis.daoimpl.LoginDAOImpl;
import com.cluster.ehis.service.LoginService;

/**
 * @author aravind rapuru
 *
 */
public class LoginServiceImpl implements LoginService {
	
	LoginDAO loginDAO = new LoginDAOImpl();

	@Override
	public boolean loginValidate(LoginBean loginBean) {
		
		boolean loginstatus = false;
		
		try {
			loginstatus = loginDAO.loginValidate(loginBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return loginstatus;
	}

	@Override
	public String getValidUserRole(LoginBean loginBean) {
		String userrole = loginDAO.getValidUserRole(loginBean);
		return userrole;
	}

	@Override
	public ArrayList getValidUserRoleMenus(LoginBean loginBean) {
		
		ArrayList userMenus = null;
		
		String userrole = loginDAO.getValidUserRole(loginBean);
		
		
		
		
		return null;
	}


}
