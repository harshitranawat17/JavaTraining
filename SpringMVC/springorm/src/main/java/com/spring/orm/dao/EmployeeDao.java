package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;

	@Transactional
	public int insert(Employee emp) {
		//insert
		
		Integer i = (Integer)this.hibernateTemplate.save(emp);
		return i;
	}
	
	//get single data
	public Employee getEmployee(int EmployeeId) {
		Employee emp = this.hibernateTemplate.get(Employee.class, EmployeeId);
		return emp;
	}
	
	//get multiple data
	public List<Employee> getAllEmployees(){
		List<Employee> emp = this.hibernateTemplate.loadAll(Employee.class);
		return emp;
	}
	
	//delete the employee
	@Transactional
	public void delete(int EmployeeId) {
		Employee emp = this.hibernateTemplate.get(Employee.class, EmployeeId);
		this.hibernateTemplate.delete(emp);
	}
	
	//update 
	@Transactional
	public void updateEmployee(Employee emp) {
		this.hibernateTemplate.update(emp);
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
