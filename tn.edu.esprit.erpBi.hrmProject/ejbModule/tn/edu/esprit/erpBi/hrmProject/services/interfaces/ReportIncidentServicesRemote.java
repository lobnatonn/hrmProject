package tn.edu.esprit.erpBi.hrmProject.services.interfaces;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.hrmProject.domain.Incident;

@Remote
public interface ReportIncidentServicesRemote {

	boolean reportIncident(Incident incident);

	Incident findIncidentById(int id);

	boolean deleteIncidentById(int i);
	

}
