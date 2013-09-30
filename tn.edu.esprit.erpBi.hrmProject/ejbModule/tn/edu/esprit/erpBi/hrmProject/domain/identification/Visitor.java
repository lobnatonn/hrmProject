package tn.edu.esprit.erpBi.hrmProject.domain.identification;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

import tn.edu.esprit.erpBi.hrmProject.domain.identification.User;

/**
 * Entity implementation class for Entity: Guest
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="T_VISITOR")
public class Visitor extends User implements Serializable {

	
	private String state;
	private static final long serialVersionUID = 1L;

	public Visitor() {
		super();
	}   
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}
   
}
