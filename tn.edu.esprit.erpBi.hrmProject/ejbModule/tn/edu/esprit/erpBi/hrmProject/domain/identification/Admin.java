package tn.edu.esprit.erpBi.hrmProject.domain.identification;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.User;

/**
 * Entity implementation class for Entity: Admin
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="T_Admin")
public class Admin extends User implements Serializable {

	
	private String role;
	private static final long serialVersionUID = 1L;

	public Admin() {
		super();
	}   
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}
   
}
