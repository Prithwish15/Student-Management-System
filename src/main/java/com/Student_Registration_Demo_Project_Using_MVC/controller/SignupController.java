package com.Student_Registration_Demo_Project_Using_MVC.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Demo_Project_Using_MVC.model.DAOServiceImpl;

@WebServlet("/SignupController")
public class SignupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SignupController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName = request.getParameter("Name");
		String studentUserName = request.getParameter("EmailID");
		String studentPassword = request.getParameter("Password");
		DAOServiceImpl service=new DAOServiceImpl();
		service.connectDB();
		service.signUp(studentName,studentUserName,studentPassword);
		request.setAttribute("value","sign up successful");
		RequestDispatcher rd = request.getRequestDispatcher("/Signup.jsp");
		rd.forward(request, response);
	}

}
