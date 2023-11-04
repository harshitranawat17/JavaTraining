package com.spring.jdbc.entities;

public class Employee {
	private int id;
	private String full_name;
	private int salary;
	
	public Employee(int id, String full_name, int salary) {
		super();
		this.id = id;
		this.full_name = full_name;
		this.salary = salary;
	}

	public Employee() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", full_name=" + full_name + ", salary=" + salary + "]";
	}

	public String getName() {
		return full_name;
	}

	public void setName(String full_name) {
		this.full_name = full_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
