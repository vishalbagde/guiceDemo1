package Employee;
import java.util.List;

public interface EmployeeDao {
	public void save(Employee employee);
	public Employee findEmployeeById(long id);
	public List<Employee> findEmployee(String name);
}
