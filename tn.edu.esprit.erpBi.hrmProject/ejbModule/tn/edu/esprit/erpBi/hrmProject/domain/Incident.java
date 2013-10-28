package tn.edu.esprit.erpBi.hrmProject.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incident implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6462291463243579189L;
	private int idIncident;
	private String description;

	public Incident() {

	}

	public Incident(String desc) {
		this.description = desc;
	}

	/**
	 * @return the idIncident
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdIncident() {
		return idIncident;
	}

	/**
	 * @param idIncident
	 *            the idIncident to set
	 */
	public void setIdIncident(int idIncident) {
		this.idIncident = idIncident;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
