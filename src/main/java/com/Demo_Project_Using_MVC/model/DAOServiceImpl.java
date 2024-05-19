package com.Demo_Project_Using_MVC.model;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOServiceImpl implements DAOService{
	private Connection con;
	private Statement stmt;
	
	@Override
	public void connectDB() {
		//JDBC code
		try {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DemoProjectMVC","root","test");
			 stmt = con.createStatement();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void signUp(String studentName, String studentUserName, String studentPassword) {
		// TODO Auto-generated method stub
		
		try {
			stmt.executeUpdate("insert into logincredentials values('"+studentName+"','"+studentUserName+"','"+studentPassword+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean verifyLogin(String studentUserName, int studentPassword) {
		
		 
		try {
			ResultSet	result = stmt.executeQuery("select * from logincredentials where studentUserName='"+studentUserName+"' and studentPassword='"+studentPassword+"'");
			return result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	

	

	@Override
	public ResultSet studentReadRegistration() {
		// TODO Auto-generated method stub
		
		try {
		ResultSet res = stmt.executeQuery("select * from registration");
		    return res;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	

	
	
	@Override
	public void studentDeleteRegistration(String studentEmail) {
		// TODO Auto-generated method stub
		try {
			stmt.executeUpdate("delete from  registration where studentEmail='"+studentEmail+"'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void closeDB() {
		// TODO Auto-generated method stub
		
	}

	
		
	
	

	@Override
	public void studentNewRegistration(int studentEnrollmentNo, String studentName, String studentEmail,
			String studentMobileNo, String studentCity, String studentCourse, double studentFee) {
		// TODO Auto-generated method stub
		try {
			stmt.executeUpdate("insert into registration values('"+studentEnrollmentNo+"','"+studentName+"','"+studentEmail+"','"+studentMobileNo+"','"+studentCity+"','"+studentCourse+"','"+studentFee+"')");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void studentUpdateRegistration(String studentName, String studentEmail, String studentMobileNo,
			String studentCourse) {
		try {
			stmt.executeUpdate("update registration set studentName='"+studentName+"',studentMobileNo='"+studentMobileNo+"',studentCourse='"+studentCourse+"' where studentEmail='"+studentEmail+"'");
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		
	}

}	



