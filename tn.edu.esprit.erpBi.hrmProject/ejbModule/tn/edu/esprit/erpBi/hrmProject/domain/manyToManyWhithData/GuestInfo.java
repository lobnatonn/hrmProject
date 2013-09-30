package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithData;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: GuestInfo
 * 
 */
@Entity
public class GuestInfo implements Serializable {

	private GuestInfoPk guestInfoPk;
	private String intiMnin;
	private static final long serialVersionUID = 1L;

	private Wedding wedding;
	private Guest guest;

	public GuestInfo() {
		super();
	}

	public String getIntiMnin() {
		return this.intiMnin;
	}

	public void setIntiMnin(String intiMnin) {
		this.intiMnin = intiMnin;
	}

	@EmbeddedId
	public GuestInfoPk getGuestInfoPk() {
		return guestInfoPk;
	}

	public void setGuestInfoPk(GuestInfoPk guestInfoPk) {
		this.guestInfoPk = guestInfoPk;
	}

	@ManyToOne
	@JoinColumn(name = "idWed", referencedColumnName = "idWedding", insertable = false, updatable = false)
	public Wedding getWedding() {
		return wedding;
	}

	public void setWedding(Wedding wedding) {
		this.wedding = wedding;
	}

	@ManyToOne
	@JoinColumn(name = "idGues", referencedColumnName = "idGuest", insertable = false, updatable = false)
	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public GuestInfo(String intiMnin, Wedding wedding, Guest guest) {
		super();
		this.guestInfoPk = new GuestInfoPk(wedding.getIdWedding(),
				guest.getIdGuest());
		this.intiMnin = intiMnin;
		this.wedding = wedding;
		this.guest = guest;
	}

}
