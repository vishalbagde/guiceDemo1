package com.person;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import com.person.module.PersonModule;
import com.person.service.PersonService;

import Employee.PersistenceInitializer;
@Singleton
public class PersonServiceProvider {
	
	public static PersonService getPersonService()
	{
		Injector injector =Guice.createInjector(new PersonModule());
		PersistenceInitializer ps = injector.getInstance(PersistenceInitializer.class);
		PersonService pservice = injector.getInstance(PersonService.class);
		return pservice;
		
	}

}
