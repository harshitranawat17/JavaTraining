package com.jpa.test;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.EmployeeRepositiry;
import com.jpa.test.entities.Employee;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		EmployeeRepositiry employeeRepositiry = context.getBean(EmployeeRepositiry.class);
		
//		Employee employee = new Employee();
//		employee.setName("Harshit");
//		employee.setCity("Jhabua");
//		employee.setStatus("Softwrare engineer");
//		
//		Employee employee2 = employeeRepositiry.save(employee);
//		
//		System.out.println(employee2);
		
		
		//create object of user
//		Employee employee1 = new Employee();
//		employee1.setName("Roshan");
//		employee1.setCity("indore");
//		employee1.setStatus("Softwrare engineer");
//	
//		Employee employee2 = new Employee();
//		employee2.setName("jaggiu");
//		employee2.setCity("Ahm");
//		employee2.setStatus("Softwrare engineer");
//		
//		//saving all employee
//		List<Employee> empList = List.of(employee1,employee2);
//		Iterable<Employee> result = employeeRepositiry.saveAll(empList);
//		
//		result.forEach(emp ->{
//			System.out.println(emp);
//		});
		
		//update user by ID
//		Optional<Employee> optional = employeeRepositiry.findById(2);
//		Employee employee = optional.get();
//		
//		employee.setName("harsh");
//		Employee result = employeeRepositiry.save(employee);
//		System.out.println(result);
		
		//delete the employee
//		employeeRepositiry.deleteById(3);
//		System.out.println("deleted");
		
		//derived method
//		List<Employee> emp = employeeRepositiry.findByName("Harsh");
//		
//		emp.forEach(e->System.out.println(e));
		
		//JPQL method
		List<Employee> emp = employeeRepositiry.getAllEmp();
		emp.forEach(e->{ 
			System.out.println(e);
		});
		
		List<Employee> empn = employeeRepositiry.getEmpByName("Harsh");
		empn.forEach(e->{
			System.out.println(e);
		});
		
		//native
		employeeRepositiry.getEmployees().forEach(e->System.out.println(e));
		
	}
 
}
