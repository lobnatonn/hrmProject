package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithData;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Guest
 *
 */
@Entity
@Table(name="T_Guest")
public class Guest implements Serializable {

	
	private int idGuest;
	private String nameGuest;
	private static final long serialVersionUID = 1L;
	
	private List<GuestInfo> guestInfos;

	public Guest() {
		super();
	}   
	@Id    
	public int getIdGuest() {
		return this.idGuest;
	}

	public void setIdGuest(int idGuest) {
		this.idGuest = idGuest;
	}   
	public String getNameGuest() {
		return this.nameGuest;
	}

	public void setNameGuest(String nameGuest) {
		this.nameGuest = nameGuest;
	}
	@OneToMany(mappedBy="guest")
	public List<GuestInfo> getGuestInfos() {
		return guestInfos;
	}
	public void setGuestInfos(List<GuestInfo> guestInfos) {
		this.guestInfos = guestInfos;
	}
   
}
