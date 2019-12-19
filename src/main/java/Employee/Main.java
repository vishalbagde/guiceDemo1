package Employee;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	 
	
	public static void main(String str[])
	{
		EmployeeService employeeService;
		Injector injector = Guice.createInjector(new EmployeeAppInjector());        
		PersistenceInitializer ps = injector.getInstance(PersistenceInitializer.class);
		employeeService = injector.getInstance(EmployeeService.class);
		
		
		Employee employee = new Employee();
		employee.setId(101l);
		employee.setName("Souvik Majumder");
		employee.setSalary(1234.0d);
		employeeService.addEmployee(employee);
		
		
		
	}

}
