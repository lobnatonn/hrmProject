package tn.edu.esprit.erpBi.hrmProject.services.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import tn.edu.esprit.erpBi.hrmProject.domain.Incident;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.ReportIncidentServicesRemote;

/**
 * Session Bean implementation class ReportIncidentServices
 */
@Stateless
public class ReportIncidentServices implements ReportIncidentServicesRemote {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */

	public ReportIncidentServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean reportIncident(Incident incident) {
		boolean b = false;
		try {
			entityManager.persist(incident);
			b = true;

		} catch (Exception e) {
			System.err.println("yezzi mel 9weda");
		}
		return b;
	}

	@Override
	public Incident findIncidentById(int id) {

		return entityManager.find(Incident.class, id);
	}

	@Override
	public boolean deleteIncidentById(int i) {
		boolean b = false;
		try {
			entityManager.remove(findIncidentById(i));
			b = true;
		} catch (Exception e) {
			System.err.println("delete failed");
		}
		return b;
	}

}
