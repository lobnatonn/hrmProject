package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Wedding
 * 
 */
@Entity
@Table(name = "T_WEDDING")
public class Wedding implements Serializable {

	private int idWedding;
	private String placeWedding;
	private static final long serialVersionUID = 1L;

	private List<GuestInfo> guestInfos;

	public Wedding() {
		super();
	}

	@Id
	public int getIdWedding() {
		return this.idWedding;
	}

	public void setIdWedding(int idWedding) {
		this.idWedding = idWedding;
	}

	public String getPlaceWedding() {
		return this.placeWedding;
	}

	public void setPlaceWedding(String placeWedding) {
		this.placeWedding = placeWedding;
	}

	@OneToMany(mappedBy = "wedding")
	public List<GuestInfo> getGuestInfos() {
		return guestInfos;
	}

	public void setGuestInfos(List<GuestInfo> guestInfos) {
		this.guestInfos = guestInfos;
	}

}
