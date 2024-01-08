package com.springboot.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.security.entity.Employee;

@Repository
public interface EmpRepository extends JpaRepository<Employee, String> {
	public Optional<Employee> findByUsername(String Username);
}
