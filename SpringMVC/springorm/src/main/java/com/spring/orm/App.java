package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDao;
import com.spring.orm.entities.Employee; 

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao employeeDao = con.getBean("EmployeeDao", EmployeeDao.class);
        
        Employee emp = new Employee(5,"Rana", 30000);
        int r = employeeDao.insert(emp);
        System.out.println("done"+r);
    }
}
