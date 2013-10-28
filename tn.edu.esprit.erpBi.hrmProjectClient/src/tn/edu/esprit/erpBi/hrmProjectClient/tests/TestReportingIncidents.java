package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import tn.edu.esprit.erpBi.hrmProject.domain.Incident;
import tn.edu.esprit.erpBi.hrmProjectClient.dp.businessDelegate.ReportIncidentServicesDelegate;

public class TestReportingIncidents {

	@Test
	public void testReportIncident() {
		Incident incident = new Incident("mounakba pointure 45");
		assertTrue(ReportIncidentServicesDelegate.doReportIncident(incident));

	}

	@Test
	public void testFindIncidentById() {
		Incident incidentFound = ReportIncidentServicesDelegate
				.doFindIncidentById(1);
		Assert.assertEquals("mounakba pointure 46",
				incidentFound.getDescription());
	}

	@Test
	public void testDeleteIncidentById() {
		Incident incidentFound = ReportIncidentServicesDelegate
				.doFindIncidentById(1);
		assertTrue(ReportIncidentServicesDelegate.doDeleteIncidentById(1));
	}
}
