package Employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;

import com.google.inject.Inject;
import com.google.inject.Provider;

public class EmployeeDaoImpl  implements EmployeeDao{
	
	@Inject private Provider<EntityManager> emp;
	
	@Override
	public List<Employee> findEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Employee findEmployeeById(long id) {
		/*Criteria criteria = getSession().createCriteria(Employee.class);
		criteria.add(Restrictions.eq("name", name));
		return (List<Employee>) criteria.list();*/
		/*
		CriteriaQuery<Employee> createQuery = emp.get().getCriteriaBuilder().createQuery(Employee.class);
		Root<Employee> root = createQuery.from(Employee.class);
		createQuery.where(root.get("name").in(name));
		return emp.get().createQuery(createQuery).getResultList();
		*/
		return null;
	}
	
	@Override
	public void save(Employee employee) {
		System.out.println(employee.getName());
		emp.get().persist(employee);
		
	}
	
	
	private Session getSession() {
		return emp.get().unwrap(Session.class);
	}
	

}
