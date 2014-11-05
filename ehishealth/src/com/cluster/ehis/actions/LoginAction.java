package com.cluster.ehis.actions;

import java.util.ArrayList;

import org.apache.log4j.Logger;

import com.cluster.ehis.beans.LoginBean;
import com.cluster.ehis.service.LoginService;
import com.cluster.ehis.serviceimpl.LoginServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven<LoginBean> {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(LoginAction.class);
	
	LoginBean loginBean = new LoginBean();
	
	LoginService loginService = new LoginServiceImpl();
	
	ArrayList  userroleList = null; 

	public String execute() {
		
		logger.info("Executing Login Action" +loginBean);
		
		String userrole  = loginService.getValidUserRole(loginBean);
		
		String resultname = null;
		
		
		if(userrole!=null){
			
			if(userrole.equalsIgnoreCase("Admin")){
				
				resultname =  "admin";
			}
			
			if(userrole.equalsIgnoreCase("reception")){
				
				resultname =  "reception";
			}
			
			if(userrole.equalsIgnoreCase("pharmacist")){
				
				resultname =  "pharmacist";
			}
			
			if(userrole.equalsIgnoreCase("nurse")){
				
				resultname = "nurse";
			}
			
			
		}
		else{
			addActionError("Invalid Username and password");
			logger.info("Login unsuccessul with Login Details "+loginBean);
			resultname = ERROR;
		}

		return resultname;
		
	}

	

	@Override
	public LoginBean getModel() {
		// TODO Auto-generated method stub
		return loginBean;
	}



	public ArrayList getUserroleList() {
		return userroleList;
	}



	public void setUserroleList(ArrayList userroleList) {
		this.userroleList = userroleList;
	}
}
