package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/Stereoconfig.xml");
		Student stu = con.getBean("per",Student.class);
		
		System.out.println(stu);
	
	}
}
