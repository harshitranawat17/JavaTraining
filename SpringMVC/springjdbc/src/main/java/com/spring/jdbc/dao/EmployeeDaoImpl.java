package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insert(Employee employee) {
		
		//insert query
        String query = "insert into employee(id, full_name, salary) values(?,?,?)";
		int result = this.jdbcTemplate.update(query,employee.getId(),employee.getName(),employee.getSalary());
		
		
		return result;
	}

	@Override
	public int change(Employee employee) {
		
		//update query
		String query = "update employee set full_name=? , salary=? where id=?";
		int result = this.jdbcTemplate.update(query,employee.getName(),employee.getSalary(),employee.getId());
		return result;
	}

	@Override
	public int delete(int EmployeeId) {
		
		String query = "delete from employee where id=?";
		int result = this.jdbcTemplate.update(query,EmployeeId);
		return result;
	}

	@Override
	public Employee getEmployee(int EmployeeId) {
		// select single employee data
		String query = "select * from employee where id=?";
		RowMapper<Employee> rowMapper =  new RowMapperImpl();
		Employee emp = this.jdbcTemplate.queryForObject(query, rowMapper, EmployeeId);
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		String query = "select * from employee";
		List<Employee> emp = this.jdbcTemplate.query(query, new RowMapperImpl());
		return emp;
	}
	
}
