package tn.edu.esprit.erpBi.hrmProject.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Employee
 * 
 */
@Entity
@Table(name = "T_EMPLOYEE")
public class Employee implements Serializable {

	private int idEmployee;
	private String nameEmployee;
	private static final long serialVersionUID = 1L;

	private List<Employee> employeesAmlouAmla;
	private Employee sahebElAmla;

	private Project project;

	public Employee() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIdEmployee() {
		return this.idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getNameEmployee() {
		return this.nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	/**
	 * @return the employeesAmlouAmla
	 */
	@OneToMany
	public List<Employee> getEmployeesAmlouAmla() {
		return employeesAmlouAmla;
	}

	/**
	 * @param employeesAmlouAmla
	 *            the employeesAmlouAmla to set
	 */
	public void setEmployeesAmlouAmla(List<Employee> employeesAmlouAmla) {
		this.employeesAmlouAmla = employeesAmlouAmla;
	}

	/**
	 * @return the sahebElAmla
	 */
	@OneToOne
	public Employee getSahebElAmla() {
		return sahebElAmla;
	}

	/**
	 * @param sahebElAmla the sahebElAmla to set
	 */
	public void setSahebElAmla(Employee sahebElAmla) {
		this.sahebElAmla = sahebElAmla;
	}

}
