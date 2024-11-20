package com.developer.expression.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Student {
	

	public Student(String firstName, String lastName, int rollNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNumber = rollNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getRollNumber() {
		return rollNumber;
	}


	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}


	String firstName;
	
	String lastName;
	
	int rollNumber;
	
	
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", rollNumber=" + rollNumber + "]";
	}
	
	
}
