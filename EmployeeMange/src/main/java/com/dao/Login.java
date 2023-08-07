package com.dao;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;







@WebServlet("/Log")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	       

	    public Login() {
	        super();
	        // TODO Auto-generated constructor stub
	    }


		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			

			HttpSession session = request.getSession();
			
			RequestDispatcher rd = null;
			
			String Username ="";
			String Password = "";
			
			Username = request.getParameter("Uname");
			Password = request.getParameter("Pass");
			
			System.out.println("Username :"+Username);
			System.out.println("Password :"+Password);
			
			
			Query q = new Query();
	
			try {

				//String result = q.Login(Username, Password);
			

				if(q.Login(Username, Password))
				{
					System.out.println("Login Successful");
					session.setAttribute("label",Username);
					session.setAttribute("label",Password);
					rd = request.getRequestDispatcher("./EmpHome.jsp");
					rd.forward(request, response);
				}
				else
				{
				
					System.out.println("Login Failed");
					session.setAttribute("l", "Username or Password is Invalid");
					rd = request.getRequestDispatcher("./index.jsp");
					rd.forward(request, response);
				}
				
				
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
		}

	}