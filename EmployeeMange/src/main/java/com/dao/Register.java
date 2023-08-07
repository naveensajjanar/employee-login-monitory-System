package com.dao;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Emp_id=request.getParameter("ID");
		String first_name =request.getParameter("fname");
		String last_name=request.getParameter("lname");
		String DOB=request.getParameter("Dob");
		
		String Gender=request.getParameter("mal");
		String Jooining_Date=request.getParameter("jdate");
		
		String Email =request.getParameter("email");
		String Official_email=request.getParameter("Oemail");
		String Designation=request.getParameter("des");
		String Address=request.getParameter("message");
		String city=request.getParameter("city");
		String State=request.getParameter("state");
		
		String Country =request.getParameter("country");
		String Pin_code=request.getParameter("pin");
		String Phone_no=request.getParameter("phone");
		String Mobile_no=request.getParameter("mobile");
		String Area_of_work=request.getParameter("area");
		String Secret_question=request.getParameter("question");
		String Secret_Answer=request.getParameter("answ");
		
		String Username=request.getParameter("Uname");
		String Password=request.getParameter("Pass");
		
		
		System.out.println("Username :"+Username);
		System.out.println("Pasword :"+Password);
		
		Member member=new Member(Emp_id,first_name, last_name, DOB, Gender, Jooining_Date, Email, Official_email, Designation, Address, city, State, Country, Pin_code, Phone_no, Mobile_no, Area_of_work, Secret_question, Secret_Answer, Username, Password);
		EmployeeRegDao rdao=new EmployeeRegDao();
		String result = " ";
		try {
			result = rdao.register(member);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("index.jsp");
		
	}

}
