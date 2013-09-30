package tn.edu.esprit.erpBi.hrmProject.domain.manyToManyWhithoutData;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
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

}
