/**
 * 
 */
package com.cluster.ehis.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import com.cluster.ehis.beans.PatientBean;
import com.cluster.ehis.dao.PatientDAO;
import com.cluster.ehis.daoimpl.PatientDAOImpl;
import com.cluster.ehis.pojos.Patient;
import com.cluster.ehis.service.PatientService;
import com.cluster.ehis.utils.FormConvertor;

/**
 * @author aravind
 *
 */
public class PatientServiceImpl implements PatientService {

	/* (non-Javadoc)
	 * @see com.cluster.ehis.service.PatientService#getAll()
	 */
	PatientDAO patientDAO = new PatientDAOImpl();
	
	@Override
	public List<PatientBean> getAll() {

		List<PatientBean> patientList = new ArrayList<PatientBean>();
			
	    List<Patient> patients = 	patientDAO.findAll();
	    for (Patient patient : patients) {
	    	PatientBean patientBean = FormConvertor.convertPatientPojotoBean(patient);
	    	patientList.add(patientBean);
		}
	    
		
		return patientList;
	}

	/* (non-Javadoc)
	 * @see com.cluster.ehis.service.PatientService#addPatient(com.cluster.ehis.beans.PatientBean)
	 */
	@Override
	public PatientBean addPatient(PatientBean patientBean) {
		PatientBean insertPatientBean =null;
		Patient patient = FormConvertor.convertPatientBeantoPojo(patientBean);
		
		patient = patientDAO.saveorUpdate(patient);
		
		if(patient!=null){
			insertPatientBean = patientBean; 
		}
		return insertPatientBean;
	}

	/* (non-Javadoc)
	 * @see com.cluster.ehis.service.PatientService#updatePatient(com.cluster.ehis.beans.PatientBean)
	 */
	@Override
	public PatientBean updatePatient(PatientBean patientBean) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cluster.ehis.service.PatientService#deletePatient(com.cluster.ehis.beans.PatientBean)
	 */
	@Override
	public Integer deletePatient(PatientBean patientBean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatientBean getPatient(Integer id) {
		PatientBean patientBean = new PatientBean();

		Patient 	patient = patientDAO.findById(id, false);
		
		patientBean = FormConvertor.convertPatientPojotoBean(patient);
		return patientBean;
	}

}
