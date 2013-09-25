package tn.edu.esprit.erpBi.hrmProject.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesLocal;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.HrmCrudServicesRemote;

/**
 * Session Bean implementation class HrmCrudServices
 */
@Stateless
public class HrmCrudServices implements HrmCrudServicesRemote,
		HrmCrudServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public HrmCrudServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);

	}

	@Override
	public Employee findEmployeeById(int idEmployee) {

		return entityManager.find(Employee.class, idEmployee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		entityManager.merge(employee);
		
	}

	@Override
	public void deleteEmployee(int idEmployee) {
		entityManager.remove(findEmployeeById(idEmployee));
		
	}

	@Override
	public List<Employee> findAllEmployees() {
	String jpql="select e from Employee e";
	Query query=entityManager.createQuery(jpql);
		return query.getResultList();
	}

}
