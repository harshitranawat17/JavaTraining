package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents(){
		
				// create an empty list
				List<Student> students = new ArrayList<>();
				
				// add sample data
				students.add(new Student("Harshit", "Rana", "har@luv2code.com"));
				students.add(new Student("Roshan", "Patidar", "ro@luv2code.com"));
				students.add(new Student("Abhi", "Rao", "abhi@luv2code.com"));
				
				// return the list
				return students;
		
	}
}
