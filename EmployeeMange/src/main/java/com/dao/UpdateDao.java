package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateDao {

	
	private String dburl="jdbc:mysql://localhost:3306/employeetable";
	private String dbuname="root";
	private String dbpassword="Sajjanar@123";
	private String dbdriver="com.mysql.cj.jdbc.Driver";
	
	
	ResultSet rs = null;
	
	String str;
	
	
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
	
	public String NewsUpdate(News ns) throws SQLException 
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data Entered Successfully";
		String sql="update news_update set topic=?,descri=? where nid=1";
		
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, ns.getTopic());
			ps.setString(2, ns.getDescription());
		
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
	
	

	public String MeetingUpdate(Meetings mt) throws SQLException 
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data Entered Successfully";
		
		String sql="update meeting_updates set timing=?,descri=? where mid=1";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, mt.getTime());
			ps.setString(2, mt.getDescription());
		
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
