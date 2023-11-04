package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entities.Employee;

public interface EmployeeDao {
	public int insert(Employee employee);
	public int change(Employee employee);
	public int delete(int EmployeeId);
	public Employee getEmployee(int EmployeeId);
	public List<Employee> getAllEmployees();
	
}
