package tn.edu.esprit.erpBi.hrmProjectClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote;

public class TestAddEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			HrmCrudServicesRemote proxy = (HrmCrudServicesRemote) context
					.lookup("ejb:/tn.edu.esprit.erpBi.hrmProject/HrmCrudServices!tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote");

			/*
			 *  for this class the generation of the primary key is identity 
			 */
			Employee employee=new Employee();
			employee.setNameEmployee("Taha");
		
			Employee employee2=new Employee();
			employee2.setNameEmployee("sala7");
			
			Employee employee3=new Employee();
			employee3.setNameEmployee("lobnaTonn");
			
			
			
			proxy.addEmployee(employee);
			proxy.addEmployee(employee2);
			proxy.addEmployee(employee3);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
