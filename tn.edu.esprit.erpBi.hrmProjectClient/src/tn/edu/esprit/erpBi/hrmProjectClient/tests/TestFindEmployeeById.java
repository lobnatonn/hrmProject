package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote;

public class TestFindEmployeeById {
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			HrmCrudServicesRemote proxy = (HrmCrudServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/HrmCrudServices!tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote");

		Employee employeeFound=proxy.findEmployeeById(1);
		System.out.println(employeeFound.getNameEmployee());
		
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
