package com.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;



public class Query  {

	ResultSet rs = null;
	
	String str;
	
	

	
	
	
	
	public boolean Login(String Username,String Password) throws SQLException, ClassNotFoundException
	{
		String User="";
		String Pass="";
		boolean result=false;
		String dbdriver="com.mysql.cj.jdbc.Driver";
		String sql = "select * from register where Username='"+Username+"'and Password='"+Password+"'";
		Class.forName(dbdriver);
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
//		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
		Statement st = conn.createStatement();
		rs = st.executeQuery(sql);
		
//		while(rs.next())
//		{
//			User = rs.getString("Username");
//			Pass = rs.getString("Password");
			result=rs.next();
			
		
		return result;
		
	}
	
	
	  public int update(String Password,String Username,String Pass) throws ClassNotFoundException, SQLException
	  {

		  String qry ="update register set password = '"+Pass+"' where Username = '"+Username+"' and Password='"+Password+"'";
		  String dbdriver="com.mysql.cj.jdbc.Driver";
		
			Class.forName(dbdriver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
			Statement st = conn.createStatement();
		  int count = st.executeUpdate(qry);
		  return count;
	  }
	
	  
	  
	  public int updateprofile(String Emp_id,String first_name, String last_name, String dOB, String gender, String jooining_Date, String email,
				String official_email, String designation, String address, String city, String state, String country,
				String pin_code, String phone_no, String mobile_no, String area_of_work, String secret_question,
				String secret_Answer, String username, String password) throws SQLException, ClassNotFoundException
	  
	  {
	        String sql = ("UPDATE register SET first_name='?',last_name='?',DOB='?',Gender='?',Jooining_Date='?',Email='?',Official_email='?',Designation='?',Address='?',city='?',State='?',Country='?',Pin_code='?',Phone_no='?',Mobile_no='?',Area_of_work='?',Secret_question='?',Secret_Answer='?',Username='?' WHERE Emp_id='?'");
	
	        String dbdriver="com.mysql.cj.jdbc.Driver";
			
			Class.forName(dbdriver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
			Statement st = conn.createStatement();
			//PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, Member.getFirst_name());
			ps.setString(2, Member.getLast_name());
			ps.setString(3, Member.getDOB());
			ps.setString(4, Member.getGender());
			ps.setString(5, Member.getJooining_Date());
			ps.setString(6, Member.getEmail() );
			ps.setString(7, Member.getOfficial_email());
			ps.setString(8, Member.getDesignation());
			ps.setString(9, Member.getAddress());
			ps.setString(10, Member.getCity());
			
			
			ps.setString(11, Member.getState());
			ps.setString(12, Member.getCountry());
			ps.setString(13, Member.getPin_code());
			ps.setString(14, Member.getPhone_no());
			ps.setString(15, Member.getMobile_no());
			ps.setString(16, Member.getArea_of_work());
			
			ps.setString(17, Member.getSecret_question());
			ps.setString(18, Member.getSecret_Answer());
			ps.setString(19, Member.getUsername());
			ps.setString(20, Member.getPassword());
		//	ps.setString(21, Member.getEmp_id());
			
			
		  int count = st.executeUpdate(sql);
		  return count;  
	    }
	  
	  
	  
//	  public List<Member> listAllBooks() throws SQLException, ClassNotFoundException {
//	        List<Member> listBook = new ArrayList<>();
//	         
//	        String sql = "SELECT * FROM register";
//	        
//	        String dbdriver="com.mysql.cj.jdbc.Driver";
//			
//			Class.forName(dbdriver);
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
//			Statement st = conn.createStatement(); 
//	   
//	        ResultSet resultSet = st.executeQuery(sql);
//	         
//	        while (resultSet.next()) {
//	            int id = resultSet.getInt("book_id");
//	            String title = resultSet.getString("title");
//	            String author = resultSet.getString("author");
//	            float price = resultSet.getFloat("price");
//	             
//	            Member book = new  Member();
//	            listBook.add(book);
//	        }
//	         
//	        resultSet.close();
//	        st.close();
//	         
//	       
//	         
//	        return listBook;
//	    }
//	  
	  
}



