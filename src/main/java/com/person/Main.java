package com.person;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.person.entity.Person;
import com.person.module.PersonModule;
import com.person.service.PersonService;

import Employee.PersistenceInitializer;
public class Main {
	public static void main(String[] args) {
		
		Injector injector =Guice.createInjector(new PersonModule());
		PersistenceInitializer ps = injector.getInstance(PersistenceInitializer.class);
		PersonService pservice = injector.getInstance(PersonService.class);
		Person p = new Person("vishal", "govind", "bagde", "vishal@gmail.com", "75678565856");
		pservice.insertPerson(p);
		p.setFname("akash");
		pservice.updatePerson(p);
	
		pservice.displayPerson(2);
		
		Person p1 =pservice.findPerson(4);
		p1.setFname("nutanfutan");
		pservice.updatePerson(p1);
	}
}
