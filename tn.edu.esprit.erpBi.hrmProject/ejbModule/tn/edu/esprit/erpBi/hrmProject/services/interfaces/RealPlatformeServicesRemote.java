package tn.edu.esprit.erpBi.hrmProject.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.domain.Project;

@Remote
public interface RealPlatformeServicesRemote {
	public void addEmployee(Employee employee);

	public void addProject(Project project);

	public Project findProjectByIdProject(int idProject);

	public List<Employee> findAllEmployesByProjectId(int idProject);

	public void addEmployeeToProject(Employee employee, int idProject);

}
