package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReportDao {

	private String dburl="jdbc:mysql://localhost:3306/employeetable";
	private String dbuname="root";
	private String dbpassword="Sajjanar@123";
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbdriver)
	{
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public Connection getConnection() throws SQLException
	{
		  Connection con;
		
			 con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		
		return con;
	
	}
	
	
	public String report(Report rp) throws SQLException 
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data Entered Successfully";
		
		String sql="insert into report values(?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, rp.getDate());
			ps.setString(2, rp.getTask());
			
		
			
			ps.executeUpdate();
			
			
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			result="data not entered";
		}
		return result;
		
	}

}
