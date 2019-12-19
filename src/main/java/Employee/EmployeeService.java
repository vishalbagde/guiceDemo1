package Employee;

import java.util.Collection;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
	Collection<Employee> searchEmployeeByName(String name);
	Employee searchEmployeeById(Long id);
}
