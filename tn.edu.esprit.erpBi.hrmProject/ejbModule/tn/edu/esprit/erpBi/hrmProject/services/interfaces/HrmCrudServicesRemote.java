package tn.edu.esprit.erpBi.hrmProject.services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;

@Remote
public interface HrmCrudServicesRemote {
	public void addEmployee(Employee employee);

	public Employee findEmployeeById(int idEmployee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(int idEmployee);

	public List<Employee> findAllEmployees();

	public List<Employee> findAllEmployeeByName(String nameEmployee);
}
