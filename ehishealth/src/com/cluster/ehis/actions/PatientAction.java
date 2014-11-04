/**
 * 
 */
package com.cluster.ehis.actions;

import java.util.List;

import com.cluster.ehis.beans.PatientBean;
import com.cluster.ehis.service.PatientService;
import com.cluster.ehis.serviceimpl.PatientServiceImpl;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * @author aravind
 *
 */
public class PatientAction extends ActionSupport implements	ModelDriven<PatientBean> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	PatientBean patientBean =null;
	PatientService patientService = new PatientServiceImpl();
	List<PatientBean> patientList = null;
	
	public String getAll(){
		
		patientList =	 patientService.getAll();
	 
	 return SUCCESS;
	}
	
	public String addPatient(){
	 PatientBean insertpatientBean = patientService.addPatient(patientBean);
	 if(insertpatientBean!=null){
		 return SUCCESS;
	 }
	 else{
		 return ERROR;
	 }
	}
	
	public String viewPatient(Integer id){
		String resultname =ERROR;
		patientBean = patientService.getPatient(id);
		
		if(patientBean!=null){
			resultname = SUCCESS;
		}
		else{
			getAll();
		}
		return resultname;
	}
	
	

	@Override
	public PatientBean getModel() {
		patientBean = new PatientBean();
		return patientBean;
	}



	/**
	 * @return the patientList
	 */
	public List<PatientBean> getPatientList() {
		return patientList;
	}



	/**
	 * @param patientList the patientList to set
	 */
	public void setPatientList(List<PatientBean> patientList) {
		this.patientList = patientList;
	}

}
