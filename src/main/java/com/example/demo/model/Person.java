package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {
	@Id
	String id ;
	String firstName; 
	String lastName; 
	int age ;
	
	public Person( String firstName, String lastName, int age) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return lastName;
	}

	public void setSecondName(String secondName) {
		this.lastName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 

	public String toString() {
		return "Person First Name:"+firstName+" Last Name:"+lastName+" age:"+age;
	}
	

}
