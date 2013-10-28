package tn.edu.esprit.erpBi.hrmProjectClient.dp.businessDelegate;

import tn.edu.esprit.erpBi.hrmProject.domain.MyMessage;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote;
import tn.edu.esprit.erpBi.hrmProjectClient.dp.serviceLocator.ServiceLocator;

public class BusinessDelegate {
	private static String jndiName = "ejb:/tn.edu.esprit.erpBi.hrmProject/RealPlatformeServices!"
			+ RealPlatformeServicesRemote.class.getCanonicalName();
	private RealPlatformeServicesRemote proxy;

	public static RealPlatformeServicesRemote hetProxy() {
		return (RealPlatformeServicesRemote) ServiceLocator.getInstanceOf()
				.hetyProxy(jndiName);
	}

	public static boolean doSendMessage(MyMessage myMessage) {
		return hetProxy().sendMessage(myMessage);

	}

}
