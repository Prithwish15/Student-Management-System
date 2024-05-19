package com.Student_Registration_Demo_Project_Using_MVC.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Demo_Project_Using_MVC.model.DAOServiceImpl;

@WebServlet("/LoginControll")
public class LoginControll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginControll() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String studentUserName = request.getParameter("UserInfo");
		int studentPassword = Integer.parseInt(request.getParameter("Password"));

		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		boolean status = service.verifyLogin(studentUserName, studentPassword);
		if (status) {
			// System.out.println("Login successful");
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/AddNewInquiryRegistration.jsp");
			rd.forward(request, response);
		} else {
			// System.out.println("Invalid Login Credential");
			request.setAttribute("msg", "Invalid Login Credential");
			RequestDispatcher rd = request.getRequestDispatcher("/Login.jsp");
			rd.forward(request, response);

		}

	}

}
