/**
 * 
 */
package com.cluster.ehis.service;

import java.util.List;

import com.cluster.ehis.beans.PatientBean;

/**
 * @author aravind
 *
 */
public interface PatientService {
	
	public List<PatientBean> getAll();
	
	public PatientBean addPatient(PatientBean patientBean);
	
	public PatientBean updatePatient(PatientBean patientBean);
	
	public Integer deletePatient(PatientBean patientBean);

	public PatientBean getPatient(Integer id);

}
