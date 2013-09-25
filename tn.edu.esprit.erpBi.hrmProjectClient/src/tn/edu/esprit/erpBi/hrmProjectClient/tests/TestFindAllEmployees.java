package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote;

public class TestFindAllEmployees {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			HrmCrudServicesRemote proxy = (HrmCrudServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/HrmCrudServices!tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote");

			List<Employee> employees = proxy.findAllEmployees();
			for (Employee e : employees) {
				System.out.println("the name of the employee is :"
						+ e.getNameEmployee());
			}

		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
