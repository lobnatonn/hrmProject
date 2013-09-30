package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithoutData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Module
 * 
 */
@Entity
@Table(name = "T_MODULE")
public class Module implements Serializable {

	private int idModule;
	private String descriptionModule;
	private static final long serialVersionUID = 1L;

	private List<Student> students;

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

	@ManyToMany
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

}
