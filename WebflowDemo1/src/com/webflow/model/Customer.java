package com.webflow.model;

import java.io.Serializable;

public class Customer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2985716356774223320L;
	private Name name = new Name();
	private Hobbies hobbies = new Hobbies();
	private PersonalInfo personalInfo = new PersonalInfo();
	private Address address = new Address();
	
	
	public Hobbies getHobbies() {
		return hobbies;
	}
	public void setHobbies(Hobbies hobbies) {
		this.hobbies = hobbies;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
