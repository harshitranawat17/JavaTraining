package com.luv2code.web.jdbc;

import jakarta.annotation.Resource;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mysql.cj.xdevapi.Result;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@Resource(name = "jdbc/web_student_tracker")
	private DataSource dataSource;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//1. setup print writer
		PrintWriter out = response.getWriter();
		response.setContentType("text/plain");
		
		//2. get connection to the database
		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;
		
		try {
			myConn = dataSource.getConnection();
			
			//3. Create SQL statement
			String sql = "Select * from student";
			myStmt = myConn.createStatement();
			
			//4. Execute query
			myRs = myStmt.executeQuery(sql);
			
			//5. Process the result set
			while(myRs.next()) {
				String email = myRs.getString("email");
				out.println(email);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
