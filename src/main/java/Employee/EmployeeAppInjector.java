package Employee;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.persist.jpa.JpaPersistModule;

public class EmployeeAppInjector extends AbstractModule {
	
	@Override
	protected void configure() {
		
		install(new JpaPersistModule("pu"));
		bind(EmployeeService.class).to(EmployeeServiceImpl.class);
		bind(EmployeeDao.class).to(EmployeeDaoImpl.class);

	
	}
	
}
