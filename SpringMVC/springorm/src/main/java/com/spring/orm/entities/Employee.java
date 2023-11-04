package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "full_name")
	private String full_name;
	@Column(name = "salary")
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

	public String getFull_name() {
		return full_name;
	}

	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", full_name=" + full_name + ", salary=" + salary + "]";
	}
	
	
	
	
}
