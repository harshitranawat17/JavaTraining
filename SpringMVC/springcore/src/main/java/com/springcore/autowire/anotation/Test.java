package com.springcore.autowire.anotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/autowire/anotation/autoconfig.xml");
		Emp emp1 = context.getBean("Emp1", Emp.class);
		
		System.out.println(emp1);
	}
}
