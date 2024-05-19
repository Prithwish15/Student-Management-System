package com.Demo_Project_Using_MVC.model;

import java.sql.ResultSet;

public interface DAOService {
	
	
	public void connectDB();

	public void signUp(String studentName, String studentUserName, String studentPassword);

	public boolean verifyLogin(String studentUserName, int studentPassword);

	public void studentNewRegistration(int studentEnrollmentNo, String studentName, String studentEmail,
			String studentMobileNo, String studentCity, String studentCourse,double studentFee);

	public ResultSet studentReadRegistration();

	public void studentUpdateRegistration(String studentName, String studentEmail,
			String studentMobileNo, String studentCourse );

	public void studentDeleteRegistration(String studentEmail);
	
	public void closeDB();

}
