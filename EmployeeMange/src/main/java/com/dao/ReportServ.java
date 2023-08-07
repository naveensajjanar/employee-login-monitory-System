package com.dao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReportServ
 */
@WebServlet("/ReportServ")
public class ReportServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String Date=request.getParameter("Date");
	String task=request.getParameter("task");
	
	System.out.println("Date");
	System.out.println("task");
	
	Report rt=new Report(Date, task);
	ReportDao rdao=new ReportDao();
	String result = " ";
	try {
		result = rdao.report(rt);
	}
	catch (SQLException e)
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	response.sendRedirect("Report.jsp");
	}

}
