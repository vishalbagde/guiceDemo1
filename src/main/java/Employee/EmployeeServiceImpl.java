package Employee;

import java.util.Collection;

import com.google.inject.Inject;

public class EmployeeServiceImpl  implements EmployeeService{
	
	@Inject private EmployeeDao employeeDao;
	
	@Override
	public void addEmployee(Employee employee) {
		
		employeeDao.save(employee);
	}
	
	@Override
	public Employee searchEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	@Override
	public Collection<Employee> searchEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
