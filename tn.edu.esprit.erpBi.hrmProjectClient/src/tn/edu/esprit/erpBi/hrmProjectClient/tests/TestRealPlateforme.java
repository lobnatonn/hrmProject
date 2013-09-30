package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote;

public class TestRealPlateforme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			RealPlatformeServicesRemote proxy = (RealPlatformeServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/RealPlatformeServices!tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote");

			Employee employee = new Employee();
			employee.setNameEmployee("taher");

			proxy.addEmployeeToProject(employee, 1);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
