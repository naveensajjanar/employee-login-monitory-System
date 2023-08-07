package com.dao;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MeetingServlet
 */
@WebServlet("/MeetingServlet")
public class MeetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MeetingServlet() {
        super();
      
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String time=request.getParameter("tm");
		String description =request.getParameter("descri");
		
		
		Meetings mts=new Meetings(time,description);
	UpdateDao udo=new UpdateDao();
		String result = " ";
		try {
			result = udo.MeetingUpdate(mts);
		}
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		response.sendRedirect("AdminHome.jsp");
		
	}
	}

