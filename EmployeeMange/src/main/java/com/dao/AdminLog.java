package com.dao;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminLog
 */
@WebServlet("/AdminLog")
public class AdminLog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLog() {
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
		HttpSession session = request.getSession();
		
		RequestDispatcher rd = null;
		

		
		String	Username = request.getParameter("Uname");
		String Password = request.getParameter("Pass");
		
		System.out.println("Username :"+Username);
		System.out.println("Password :"+Password);
		
		
		AdminRegDao Aq = new AdminRegDao();

		try {

			//String result = q.Login(Username, Password);
		

			if(Aq.Login(Username, Password))
			{
				System.out.println("Login Successful");
//				session.setAttribute("label",Username);
//				session.setAttribute("label",Password);
			//	rd = request.getRequestDispatcher("./AdminHome.jsp");
				response.sendRedirect("AdminHome.jsp");
				//rd.forward(request, response);
			}
			else
			{
			
				System.out.println("Login Failed");
				session.setAttribute("l", "Username or Password is Invalid");
				rd = request.getRequestDispatcher("./AdminLogin.jsp");
				rd.forward(request, response);
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}