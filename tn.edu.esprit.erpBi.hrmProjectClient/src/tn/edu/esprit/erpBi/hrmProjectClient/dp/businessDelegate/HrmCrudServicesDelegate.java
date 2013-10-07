package tn.edu.esprit.erpBi.hrmProjectClient.dp.businessDelegate;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote;
import tn.edu.esprit.erpBi.hrmProjectClient.dp.serviceLocator.ServiceLocator;

public class HrmCrudServicesDelegate {
	private static String jndiName = "ejb:/tn.edu.esprit.erpBi.hrmProject/HrmCrudServices!"
			+ HrmCrudServicesRemote.class.getCanonicalName();

	public static void doAddEmployee(Employee employee) {

		getProxy().addEmployee(employee);
	}

	public static HrmCrudServicesRemote getProxy() {

		return (HrmCrudServicesRemote) ServiceLocator.getInstanceOf()
				.hetyProxy(jndiName);
	}

}
