package com.dao;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateProfile
 */
@WebServlet("/UpdateProfile")
public class UpdateProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProfile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
RequestDispatcher rd = null;
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
	
	Query q = new Query();
		
		int result=0;
		
		Member member=new Member(Emp_id,first_name, last_name, DOB, Gender, Jooining_Date, Email, Official_email, Designation, Address, city, State, Country, Pin_code, Phone_no, Mobile_no, Area_of_work, Secret_question, Secret_Answer, Username, Password);
		
		
		try
		{
			 result = q.updateprofile(Emp_id,first_name,last_name,DOB, Gender,Jooining_Date,Email,
					Official_email,Designation,Address, city, State,Country,
						Pin_code, Phone_no,Mobile_no,Area_of_work,Secret_question,
						Secret_Answer, Username, Password);
			
			if(result > 0)
			{
				System.out.println("Update Successful");
				rd = request.getRequestDispatcher("./EmpHome.jsp");
				rd.forward(request, response);
			}
			else
			{
				System.out.println("Update Failed");
				rd = request.getRequestDispatcher("./Editprofile.jsp");
				rd.forward(request, response);
				
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
