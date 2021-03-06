package com.person.service;

import java.util.List;

import com.person.entity.Person;

public interface PersonService {
	
	public void insertPerson(Person person);
	public void updatePerson(Person person);
	public void deletePerson(Person person);
	public void displayPerson(int  person_id);
	public Person findPerson(int person_id);
	public List<Person> getAllPerson();
	

}
