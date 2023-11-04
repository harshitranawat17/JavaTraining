package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.EmployeeDao;
import com.spring.jdbc.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started....." );
        
        ApplicationContext con = new ClassPathXmlApplicationContext("com/spring/jdbc/Configjdbc.xml");
        
        EmployeeDao empDao = con.getBean("employeeDao", EmployeeDao.class);
        
          //Insert
//        Employee emp = new Employee();
//        emp.setId(4);
//        emp.setName("HArshit");
//        emp.setSalary(30000);
//        
//        int result = empDao.insert(emp);
//        
//        System.out.println("Record added "+result);
        
          //Update
//          Employee emp = new Employee();
//          emp.setId(4);
//          emp.setName("HArshit Ranawat");
//          emp.setSalary(25000);
//          
//          int result = empDao.change(emp);
//          System.out.println("Record changed "+result);
        
            //Delete
        	//int result = empDao.delete(1);
        	//System.out.println("Record Deleted "+result);
        
        	//to get single employee data
        	//Employee emp = empDao.getEmployee(4);
        	//System.out.println(emp);
 
        	//to get all employee data
        	List<Employee> emp = empDao.getAllEmployees();
        	for(Employee e : emp) {
        		System.out.println(e);
        	}
    }
}
