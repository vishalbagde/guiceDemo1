package com.person.module;

import com.google.inject.AbstractModule;
import com.google.inject.persist.jpa.JpaPersistModule;

import com.person.entity.Person;
import com.person.service.PersonService;
import com.person.service.PersonServiceImpl;

import Employee.EmployeeService;
import Employee.EmployeeServiceImpl;
public class PersonModule extends AbstractModule {
	
	@Override
	protected void configure() {
		install(new JpaPersistModule("pu"));
		bind(PersonService.class).to(PersonServiceImpl.class);
	}

}
