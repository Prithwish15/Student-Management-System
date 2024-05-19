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


@WebServlet("/ReadRegistrationController")
public class ViewInquiryRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ViewInquiryRegistrationController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOServiceImpl service= new DAOServiceImpl();
		service.connectDB();
		ResultSet result = service.studentReadRegistration();
		request.setAttribute("res",result);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/ViewAllInquiryDetails.jsp");
		rd.forward(request,response);
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
