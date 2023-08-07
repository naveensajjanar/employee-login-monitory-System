package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;

public class EmployeeRegDao
{
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
	public String register(Member member) throws SQLException 
	{
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result="Data Entered Successfully";
		
		String sql="insert into register values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, Member.getEmp_id());
			ps.setString(2, Member.getFirst_name());
			ps.setString(3, Member.getLast_name());
			ps.setString(4, Member.getDOB());
			ps.setString(5, Member.getGender());
			ps.setString(6, Member.getJooining_Date());
			ps.setString(7, Member.getEmail() );
			ps.setString(8, Member.getOfficial_email());
			ps.setString(9, Member.getDesignation());
			ps.setString(10, Member.getAddress());
			ps.setString(11, Member.getCity());
			
			
			ps.setString(12, Member.getState());
			ps.setString(13, Member.getCountry());
			ps.setString(14, Member.getPin_code());
			ps.setString(15, Member.getPhone_no());
			ps.setString(16, Member.getMobile_no());
			ps.setString(17, Member.getArea_of_work());
			
			ps.setString(18, Member.getSecret_question());
			ps.setString(19, Member.getSecret_Answer());
			ps.setString(20, Member.getUsername());
			ps.setString(21, Member.getPassword());
		
			
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
