package com.javahongkong.bootcamp.exercise;

public class Person extends AccountHolder{
	private String firstName;
	private String lastName;

	public Person(int idNumber) {
		// complete the function
		super(idNumber);
	}

	public Person(String firstName, String lastName, int idNumber) {
		// complete the function
		this(idNumber);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		// complete the function
		return this.firstName;
	}

	public String getLastName() {
		// complete the function
		return this.lastName;
	}

	
}
