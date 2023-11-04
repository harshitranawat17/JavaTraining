package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person per =  con.getBean("Person1", Person.class);
		
		//Person per1 = con.getBean("Person2", Person.class);
	
		System.out.println(per);
		//System.out.println(per1);
	}
}
