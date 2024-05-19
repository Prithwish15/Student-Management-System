package com.Student_Registration_Demo_Project_Using_MVC.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.Demo_Project_Using_MVC.model.DAOServiceImpl;

@WebServlet("/AddNewRegistration")
public class AddInquiryRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    
    public AddInquiryRegistrationController() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/AddNewInquiryRegistration.jsp");
		 rd.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int studentEnrollmentNo = Integer.parseInt(request.getParameter("studentEnrollmentNo"));
		String studentName = request.getParameter("studentName");
		String studentEmail = request.getParameter("studentEmail");
		String studentMobileNo = request.getParameter("studentMobileNo");
		String studentCity = request.getParameter("studentCity");
		String studentCourse = request.getParameter("studentCourse");
		double studentFee = Double.parseDouble(request.getParameter("studentFee"));
		
		
		
		DAOServiceImpl service=new DAOServiceImpl();
		service.connectDB();
		
		service.studentNewRegistration(studentEnrollmentNo,studentName,studentEmail,studentMobileNo,studentCity,studentCourse,studentFee);
		request.setAttribute("msg", "New Record is saved successfully");
		 RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/AddNewInquiryRegistration.jsp");
		 rd.forward(request,response);
	}

}

