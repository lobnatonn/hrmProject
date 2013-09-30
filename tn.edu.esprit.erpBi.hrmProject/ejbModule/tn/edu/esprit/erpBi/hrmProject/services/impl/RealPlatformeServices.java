package tn.edu.esprit.erpBi.hrmProject.services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tn.edu.esprit.erpBi.hrmProject.domain.Employee;
import tn.edu.esprit.erpBi.hrmProject.domain.Project;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesLocal;
import tn.edu.esprit.erpBi.hrmProject.services.interfaces.RealPlatformeServicesRemote;

/**
 * Session Bean implementation class RealPlatformeServices
 */
@Stateless
public class RealPlatformeServices implements RealPlatformeServicesRemote,
		RealPlatformeServicesLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public RealPlatformeServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addEmployee(Employee employee) {
		entityManager.persist(employee);

	}

	@Override
	public void addProject(Project project) {
		entityManager.persist(project);

	}

	@Override
	public Project findProjectByIdProject(int idProject) {
		return entityManager.find(Project.class, idProject);
	}

	@Override
	public List<Employee> findAllEmployesByProjectId(int idProject) {
		String jpql = "select e from Employee e where e.project.idProject=:param";
		Query query = entityManager.createQuery(jpql);
		query.setParameter("param", idProject);
		return query.getResultList();
	}

	@Override
	public void addEmployeeToProject(Employee employee, int idProject) {
		List<Employee> employeesProject = findAllEmployesByProjectId(idProject);
		employeesProject.add(employee);
		Project projectFound = findProjectByIdProject(idProject);
		projectFound.linkEmployeesToThisProject(employeesProject);

		entityManager.merge(projectFound);

	}

}
