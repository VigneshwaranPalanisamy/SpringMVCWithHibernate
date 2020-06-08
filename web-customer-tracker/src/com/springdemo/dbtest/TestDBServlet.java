package com.springdemo.dbtest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public TestDBServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String username = "springstudent";
		String password = "springstudent";
		String jdbcURL = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		try {
			PrintWriter writer = response.getWriter();
			
			writer.println("Connecting to a database.. " + jdbcURL);
			
			Class.forName(driver);
			
			Connection myConn = DriverManager.getConnection(jdbcURL, username, password);
			
			writer.println("SUCCESS!!!");
			
			myConn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
