package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.identification.Admin;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.User;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote;

public class TestIdentification {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			RealPlatformeServicesRemote proxy = (RealPlatformeServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/RealPlatformeServices!tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote");

			User user = proxy.authenticate("admin", "admin");
			System.out.println(user.getLogin());
			if (user instanceof Admin) {
				System.out.println("barra rabbi m3ak ...");
			} else {
				System.out.println("barra rawa7 mamstek ...");
			}

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
