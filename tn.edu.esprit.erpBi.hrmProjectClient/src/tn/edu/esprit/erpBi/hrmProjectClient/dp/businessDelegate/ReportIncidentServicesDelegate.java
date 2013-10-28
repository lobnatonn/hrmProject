package tn.edu.esprit.erpBi.hrmProjectClient.dp.businessDelegate;

import tn.edu.esprit.erpBi.hrmProject.domain.Incident;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.ReportIncidentServicesRemote;
import tn.edu.esprit.erpBi.hrmProjectClient.dp.serviceLocator.ServiceLocator;

public class ReportIncidentServicesDelegate {

	private static String jndiName = "ejb:/tn.edu.esprit.erpBi.hrmProject/ReportIncidentServices!"
			+ ReportIncidentServicesRemote.class.getCanonicalName();

	private static ReportIncidentServicesRemote hetProxy() {
		return (ReportIncidentServicesRemote) ServiceLocator.getInstanceOf()
				.hetyProxy(jndiName);

	}

	public static boolean doReportIncident(Incident incident) {

		return hetProxy().reportIncident(incident);
	}

	public static Incident doFindIncidentById(int id) {
		return hetProxy().findIncidentById(id);
	}

	public static boolean doDeleteIncidentById(int i) {

		return hetProxy().deleteIncidentById(i);
	}

}
