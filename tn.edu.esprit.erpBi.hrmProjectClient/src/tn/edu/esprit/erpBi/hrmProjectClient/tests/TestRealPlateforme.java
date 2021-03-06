package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.identification.Admin;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.User;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.Visitor;
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

			List<User> users = proxy.findAllUsers();
			for (User u : users) {
				if (u instanceof Admin) {
					System.out
							.println("i am an administrator and this is my role :"
									+ ((Admin) u).getRole());
				} else {
					System.out.println("i am a visitor and this is my state : "
							+ ((Visitor) u).getState());
				}

			}
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
