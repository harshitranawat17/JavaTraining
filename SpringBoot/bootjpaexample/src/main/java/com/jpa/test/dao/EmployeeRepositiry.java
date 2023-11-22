package com.jpa.test.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.jpa.test.entities.Employee;

public interface EmployeeRepositiry extends CrudRepository<Employee, Integer> {

	public List<Employee> findByName(String name);
	
	//JPQL
	@Query("select e FROM Employee e")
	public List<Employee> getAllEmp();
	
	@Query("select e From Employee e WHERE e.name=:n")
	public List<Employee> getEmpByName(@Param("n") String name);
	
	//native query
	@Query(value = "select * from employee", nativeQuery = true)
	public List<Employee> getEmployees();
}
