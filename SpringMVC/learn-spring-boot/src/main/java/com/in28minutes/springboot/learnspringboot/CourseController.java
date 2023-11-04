package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<course> retrieveAllCourses(){
		return Arrays.asList(
				new course(1,"Learn AWS", "in28min"),
				new course(2,"Learn Devops", "in28min")
				);
	}
}
