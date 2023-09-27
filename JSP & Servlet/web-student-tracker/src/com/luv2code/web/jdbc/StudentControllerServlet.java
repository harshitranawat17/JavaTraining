package com.luv2code.web.jdbc;

import jakarta.annotation.Resource;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import javax.sql.DataSource;

/**
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServlet")
public class StudentControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private StudentDbUtil studentDbUtil;
	
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	@Override
	public void init() throws ServletException {
		super.init();
		
		// create our student db util ... and pass in the conn pool / datasource
		try {
			studentDbUtil = new StudentDbUtil(dataSource);
		}
		catch (Exception exc) {
			throw new ServletException(exc);
		}
	}
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			//read the command parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing,then default to listing students
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			//route to the appropraite method\
			switch(theCommand) {
			
				case "LIST":
					listStudents(request, response);
					break;
				case "ADD":
					addStudent(request,response);
					break;
				case "LOAD":
					loadStudent(request, response);
					break;
				case "UPDATE":
					updateStudent(request, response);
					break;
				case "DELETE":
					deleteStudent(request, response);
					break;
				default:
					listStudents(request, response);
			}
			
			
			
			
			//list the student in MVc fashion
			listStudents(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException(e);
		}
	}


	private void deleteStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//read the student info from form data
		String theStudentId = request.getParameter("studentId");
		
		// delete student from db
		studentDbUtil.deleteStudents(theStudentId);
		
		//send them back to jsp
		listStudents(request, response);
		
	}


	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//read the student info from form data
		int id = Integer.parseInt(request.getParameter("studentId"));
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		//create new object
		Student theStudent = new Student(id,firstName, lastName, email);
		
		//perform update on db
		studentDbUtil.updateStudent(theStudent);
		
		//send back to the "list_student" page
		listStudents(request, response);
		
		
	}


	private void loadStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//read student id from form data
		String theStudentId = request.getParameter("studentId");
		
		//get student from db
		Student theStudent = studentDbUtil.getStudents(theStudentId);
		
		//place student in the request attribute
		request.setAttribute("THE_STUDENT", theStudent);
		
		//send to the JSP: update-form
		RequestDispatcher dispatcher = request.getRequestDispatcher("/update-student-form.jsp");
		dispatcher.forward(request, response);
		
		
		
		
	}


	private void addStudent(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		//read the student info from form data
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		//create new object
		
		Student theStudent = new Student(firstName, lastName, email);
		
		//add the student data to database
		studentDbUtil.addStudent(theStudent);
		
		//send back to  main page
		listStudents(request, response);
		
		
	}


	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		//get students from db util
		List<Student> students = studentDbUtil.getStudents();
		
		//add students to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send the JSP
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-students.jsp");
		dispatcher.forward(request, response);
		
		
	}

	

}
