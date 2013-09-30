package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithData;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class GuestInfoPk implements Serializable {
	private int idWed;
	private int idGues;

	public int getIdWed() {
		return idWed;
	}

	public void setIdWed(int idWed) {
		this.idWed = idWed;
	}

	public int getIdGues() {
		return idGues;
	}

	public void setIdGues(int idGues) {
		this.idGues = idGues;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idGues;
		result = prime * result + idWed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuestInfoPk other = (GuestInfoPk) obj;
		if (idGues != other.idGues)
			return false;
		if (idWed != other.idWed)
			return false;
		return true;
	}

	public GuestInfoPk() {
		// TODO Auto-generated constructor stub
	}

	public GuestInfoPk(int idWed, int idGues) {
		super();
		this.idWed = idWed;
		this.idGues = idGues;
	}
	
}
