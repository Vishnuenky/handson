package com.program.Java8;

import java.util.Objects;

public class Employee {
	String name;
	String city;
	int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//	@Override
//	public String toString() {
//		return "Employee [name=" + name + ", city=" + city + ", id=" + id + "]";
//	}
	public Employee(String name, String city, int id) {
		super();
		this.name = name;
		this.city = city;
		this.id = id;
	}
	public Employee() {
		
	}
	
	
	public String toString() {
		return getName()+" "+getCity()+" "+getId();
	}
}
