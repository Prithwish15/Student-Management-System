package com.Student_Registration_Demo_Project_Using_MVC.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Demo_Project_Using_MVC.model.DAOServiceImpl;


@WebServlet("/UpdateRegistration")
public class UpdateRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public UpdateRegistrationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName = request.getParameter("name");
		String studentEmail = request.getParameter("email");
		String studentMobileNo = request.getParameter("mobile");    
		String studentCourse = request.getParameter("course");
		request.setAttribute("name", studentName);
		request.setAttribute("email", studentEmail);
		request.setAttribute("mobile", studentMobileNo);
		request.setAttribute("course", studentCourse);
	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/UpdateEnquiryDetails.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String studentName = request.getParameter("name");
		String studentEmail = request.getParameter("email");
		String studentMobileNo = request.getParameter("mobile");
		String studentCourse = request.getParameter("course");
		DAOServiceImpl service=new DAOServiceImpl();
		service.connectDB();
		service.studentUpdateRegistration(studentName, studentEmail, studentMobileNo, studentCourse);
		ResultSet result = service.studentReadRegistration();
		request.setAttribute("res",result);
		request.setAttribute("msg","Data Updated succesfully");
	    RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/ViewAllInquiryDetails.jsp");
		rd.forward(request, response);
		
	}

}
