package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.domain.Project;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.Admin;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.Visitor;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote;

public class TestInitPlateforme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			RealPlatformeServicesRemote proxy = (RealPlatformeServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/RealPlatformeServices!tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote");

			Employee employee = new Employee();
			employee.setNameEmployee("lobna");

			Employee employee2 = new Employee();
			employee2.setNameEmployee("aziz");

			Project project = new Project();
			project.setDescriptionProject("piDev");

			employee.setProject(project);
			employee2.setProject(project);

			Admin admin = new Admin();
			admin.setLogin("admin");
			admin.setPwd("admin");
			admin.setRole("superUser");
			
			Visitor visitor=new Visitor();
			visitor.setLogin("visitor");
			visitor.setPwd("visitor");
			visitor.setState("regular");

			proxy.addEmployee(employee);
			proxy.addEmployee(employee2);
			proxy.addUser(admin);
			proxy.addUser(visitor);

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
