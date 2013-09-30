package tn.edu.esprit.erpBi.hrmProject.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.domain.Project;
import tn.edu.esprit.erpBi.hrmProject.domain.identification.User;

@Remote
public interface RealPlatformeServicesRemote {
	public void addEmployee(Employee employee);

	public void addProject(Project project);

	public Project findProjectByIdProject(int idProject);

	public List<Employee> findAllEmployesByProjectId(int idProject);

	public void addEmployeeToProject(Employee employee, int idProject);

	public void addUser(User user);

	public List<User> findAllUsers();

	public User authenticate(String login, String password);

	public void addGuestInfo(int idwedding, int idguest, String intiMnin);

}
