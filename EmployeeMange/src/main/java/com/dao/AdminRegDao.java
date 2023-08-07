package com.dao;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

	public class AdminRegDao
	
	{
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
			  Connection con=DriverManager.getConnection(dburl, dbuname, dbpassword);
			
		
			
			return con;
		}
		
		
		
		
		public String Adminregister(Admin adm) throws SQLException 
		{
			loadDriver(dbdriver);
			Connection con=getConnection();
			String result="Data Entered Successfully";
			
			String sql="insert into adminreg values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, adm.getAdmin_id());
				ps.setString(2, adm.getFirst_name());
				ps.setString(3, adm.getLast_name());
				ps.setString(4, adm.getDOB());
				ps.setString(5, adm.getGender());
				ps.setString(6, adm.getJooining_Date());
				ps.setString(7, adm.getEmail() );
				ps.setString(8, adm.getOfficial_email());
				ps.setString(9, adm.getDesignation());
				ps.setString(10, adm.getAddress());
				ps.setString(11, adm.getCity());
				
				
				ps.setString(12, adm.getState());
				ps.setString(13, adm.getCountry());
				ps.setString(14, adm.getPin_code());
				ps.setString(15, adm.getPhone_no());
				ps.setString(16, adm.getMobile_no());
				ps.setString(17, adm.getArea_of_work());
				
				ps.setString(18, adm.getSecret_question());
				ps.setString(19, adm.getSecret_Answer());
				ps.setString(20, adm.getUsername());
				ps.setString(21, adm.getPassword());
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
		
		
		
		public boolean Login(String Username,String Password) throws SQLException, ClassNotFoundException
		{
			String User="";
			String Pass="";
			boolean result=false;
			String dbdriver="com.mysql.cj.jdbc.Driver";
			String sql = "select * from adminreg where Username='"+Username+"'and password='"+Password+"'";
			Class.forName(dbdriver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");

			Statement st = conn.createStatement();
			rs = st.executeQuery(sql);
			

				result=rs.next();
				
			
			return result;
			
		}
		
		public int updateprofile(String admin_id, String first_name, String last_name, String dOB, String gender, String jooining_Date,
				String email, String official_email, String designation, String address, String city, String state,
				String country, String pin_code, String phone_no, String mobile_no, String area_of_work,
				String secret_question, String secret_Answer, String username, String password) throws SQLException, ClassNotFoundException {
			 
	        String sql = "update adminreg set first_name=?,last_name=?,DOB=?,Gender=?,Jooining_Date=?,Email=?,Official_email=?,Designation=?,Address=?,city=?,State=?,Country=?,Pin_code=?,Phone_no=?,Mobile_no=?,Area_of_work=?,Secret_question=?,Secret_Answer=?,Username=? where Admin_id=?";
	
	        String dbdriver="com.mysql.cj.jdbc.Driver";
			
			Class.forName(dbdriver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
			Statement st = conn.createStatement();
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			//PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, Admin.getAdmin_id());
			ps.setString(2, Admin.getFirst_name());
			ps.setString(3, Admin.getLast_name());
			ps.setString(4, Admin.getDOB());
			ps.setString(5, Admin.getGender());
			ps.setString(6, Admin.getJooining_Date());
			ps.setString(7, Admin.getEmail() );
			ps.setString(8, Admin.getOfficial_email());
			ps.setString(9, Admin.getDesignation());
			ps.setString(10,Admin.getAddress());
			ps.setString(11, Admin.getCity());
			
			
			ps.setString(12, Admin.getState());
			ps.setString(13, Admin.getCountry());
			ps.setString(14, Admin.getPin_code());
			ps.setString(15, Admin.getPhone_no());
			ps.setString(16, Admin.getMobile_no());
			ps.setString(17, Admin.getArea_of_work());
			
			ps.setString(18, Admin.getSecret_question());
			ps.setString(19, Admin.getSecret_Answer());
			ps.setString(20, Admin.getUsername());
			ps.setString(21, Admin.getPassword());
			
			
		  int count = st.executeUpdate(sql);
		  return count;  
	    }
	  
		
		
		
		
		
	}
