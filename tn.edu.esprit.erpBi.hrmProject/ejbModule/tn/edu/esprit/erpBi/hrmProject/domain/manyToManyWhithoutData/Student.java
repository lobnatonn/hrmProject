package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithoutData;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Student
 * 
 */
@Entity
@Table(name = "T_STUDENT")
public class Student implements Serializable {

	private int idStudent;
	private String nameStudent;
	private static final long serialVersionUID = 1L;

	private List<Module> modules;

	public Student() {
		super();
	}

	@Id
	public int getIdStudent() {
		return this.idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getNameStudent() {
		return this.nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	@ManyToMany(mappedBy = "students")
	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

}
