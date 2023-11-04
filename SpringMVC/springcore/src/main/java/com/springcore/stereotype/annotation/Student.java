package com.springcore.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("per")
public class Student {
	
	@Value("HArshit")
	private String name;
	@Value("Jhabua")
	private String Address;
	
	@Value("#{LL}")
	private List<String> course;
	
	@Value("#{ new java.lang.String('Govind Singh')}")
	private String fathersName;
	
	@Value("#{T(java.lang.Math).sqrt(4)}")
	private int n;
	
	
	public String getFathersName() {
		return fathersName;
	}
	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", Address=" + Address + ", course=" + course + ", fathersName=" + fathersName
				+ ", n=" + n + "]";
	}
	
	
	
	
	
}
