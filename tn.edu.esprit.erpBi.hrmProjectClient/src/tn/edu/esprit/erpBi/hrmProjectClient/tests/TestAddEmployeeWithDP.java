package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote;
import tn.edu.esprit.erpBi.hrmProjectClient.dp.businessDelegate.HrmCrudServicesDelegate;

public class TestAddEmployeeWithDP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
			Employee employee = new Employee();
			employee.setNameEmployee("Taha");

			Employee employee2 = new Employee();
			employee2.setNameEmployee("sala7");

			Employee employee3 = new Employee();
			employee3.setNameEmployee("lobnaTonn");
			
			HrmCrudServicesDelegate.doAddEmployee(employee);

			

		

	}

}
