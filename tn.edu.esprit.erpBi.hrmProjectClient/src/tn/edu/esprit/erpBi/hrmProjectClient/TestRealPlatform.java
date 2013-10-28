package tn.edu.esprit.erpBi.hrmProjectClient;

import static org.junit.Assert.*;

import org.junit.Test;

import tn.edu.esprit.erpBi.hrmProject.domain.MyMessage;
import tn.edu.esprit.erpBi.hrmProjectClient.dp.businessDelegate.BusinessDelegate;

public class TestRealPlatform {
	
	@Test
	public void testSendMessage(){	
		MyMessage myMessage =new MyMessage("kol chay kif kif ...");		
		assertTrue(BusinessDelegate.doSendMessage(myMessage));
	}
	
}
