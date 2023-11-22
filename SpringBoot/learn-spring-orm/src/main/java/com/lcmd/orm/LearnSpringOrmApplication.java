package com.lcmd.orm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lcmd.orm.entities.Address;
import com.lcmd.orm.entities.Category;
import com.lcmd.orm.entities.Laptop;
import com.lcmd.orm.entities.Product;
import com.lcmd.orm.entities.Student;
import com.lcmd.orm.repositories.CategoryRepo;
import com.lcmd.orm.repositories.ProductRepo;
import com.lcmd.orm.repositories.StudentRepository;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}
	


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//one to one
//		
//		Student student =  new Student();
//		student.setStudentId(25);
//		student.setAbout("Software engineer");
//		student.setStudentName("harsh5 ranawat");
//		
//		Laptop laptop = new Laptop();
//		laptop.setLaptopId(125);
//		laptop.setBrand("DEll");
//		laptop.setModelNumber("2324");
//		laptop.setStudent(student);
		
		
		//one to many
		
//		Student student =  new Student();
//		student.setStudentId(30);
//		student.setAbout("data engineer");
//		student.setStudentName("roshan");
//		
//		
//		Address a1 = new Address();
//		a1.setAddressId(1);
//		a1.setCity("indore");
//		a1.setCountry("india");
//		a1.setStreet("vijaynager");
//		a1.setStudent(student);
//		
//		Address a2 = new Address();
//		a2.setAddressId(2);
//		a2.setCity("jhbaua");
//		a2.setCountry("india");
//		a2.setStreet("sukhdev bihar");
//		a2.setStudent(student);
//		
//		List<Address> addresslist = new ArrayList<>();
//		addresslist.add(a1);
//		addresslist.add(a2);
//		
//		student.setAddresslist(addresslist);
		
		
		//manytomany
		
		Product p1 = new Product();
		p1.setPId(23);
		p1.setProductName("iphone");
		
		Product p2 = new Product();
		p2.setPId(24);
		p2.setProductName("one plus");
		
		Product p3 = new Product();
		p3.setPId(25);
		p3.setProductName("samsung");
		
		Category c1 = new Category();
		c1.setCId(31);
		c1.setTitle("Electronics");
		
		Category c2 = new Category();
		c2.setCId(33);
		c2.setTitle("mobiles");
		
		List<Product> c1Products = c1.getProductlist();
		c1Products.add(p1);
		c1Products.add(p2);
		c1Products.add(p3);
		
		List<Product> c2Products = c2.getProductlist();
		c2Products.add(p1);
		c2Products.add(p2);
		
		categoryRepo.save(c1);
		categoryRepo.save(c2);
		
		
		
//	    Student save = studentRepository.save(student);
//		
//		System.out.println(save);
	}
	
}
