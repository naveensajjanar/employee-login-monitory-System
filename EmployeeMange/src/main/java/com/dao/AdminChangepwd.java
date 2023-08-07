package com.dao;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdminChangepwd
 */
@WebServlet("/AdminChangepwd")
public class AdminChangepwd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminChangepwd() {
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
					
					String Username="";
					String Password="";
					
					Username = request.getParameter("user");
					Password = request.getParameter("password");
					String Password1 = request.getParameter("password1");
					//System.out.println("Username :"+Username);
					System.out.println("password :"+Password);
					
					System.out.println(" New password :"+Password1);
				Query q = new Query();
					
					int result=0;
					
					
					
					try
					{
						 result = q.update(Password,Username,Password1);
						
						if(result > 0)
						{
							System.out.println("Update Successful");
							rd = request.getRequestDispatcher("./AdminHome.jsp");
							rd.forward(request, response);
						}
						else
						{
							System.out.println("Update Failed");
							rd = request.getRequestDispatcher("./AdminChangepwd.jsp");
							rd.forward(request, response);
							
						}

					}catch(Exception e)
					{
						System.out.println(e);
					}
				}

		

}
