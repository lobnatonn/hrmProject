package tn.edu.esprit.erpBi.hrmProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MyMessage implements Serializable {

	private int idMessage;
	private String subjectMessage;
	private static final long serialVersionUID = 1799415207252027335L;

	public MyMessage() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}

	public String getSubjectMessage() {
		return subjectMessage;
	}

	public void setSubjectMessage(String subjectMessage) {
		this.subjectMessage = subjectMessage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public MyMessage(String subjectMessage) {
		super();
		this.subjectMessage = subjectMessage;
	}
	

}
