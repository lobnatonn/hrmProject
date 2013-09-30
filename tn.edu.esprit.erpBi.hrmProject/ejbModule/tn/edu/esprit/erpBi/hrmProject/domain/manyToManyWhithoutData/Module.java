package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithoutData;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Module
 *
 */
@Entity
@Table(name="T_MODULE")
public class Module implements Serializable {

	
	private int idModule;
	private String descriptionModule;
	private static final long serialVersionUID = 1L;

	public Module() {
		super();
	}   
	@Id    
	public int getIdModule() {
		return this.idModule;
	}

	public void setIdModule(int idModule) {
		this.idModule = idModule;
	}   
	public String getDescriptionModule() {
		return this.descriptionModule;
	}

	public void setDescriptionModule(String descriptionModule) {
		this.descriptionModule = descriptionModule;
	}
   
}
