package com.person.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	int person_id;
	String fname;
	String lname;
	String mname;
	String email;
	String contact_no;
	
	
	public Person() {
		super();
	}

	
	
	public Person(String fname, String lname, String mname, String email, String contact_no) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.email = email;
		this.contact_no = contact_no;
	}



	public Person(int person_id, String fname, String lname, String mname, String email, String contact_no) {
		super();
		this.person_id = person_id;
		this.fname = fname;
		this.lname = lname;
		this.mname = mname;
		this.email = email;
		this.contact_no = contact_no;
	}


	public int getPerson_id() {
		return person_id;
	}


	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getMname() {
		return mname;
	}


	public void setMname(String mname) {
		this.mname = mname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContact_no() {
		return contact_no;
	}


	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}



	@Override
	public String toString() {
		return "Person [person_id=" + person_id + ", fname=" + fname + ", lname=" + lname + ", mname=" + mname
				+ ", email=" + email + ", contact_no=" + contact_no + "]";
	}
	
	
	
	
	
	
	
	

}
