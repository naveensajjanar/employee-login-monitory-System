package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AdminQuery {

	
	
	
	  public int update(String Password,String Username,String Pass) throws ClassNotFoundException, SQLException
	  {

		  String qry ="update adminreg set password = '"+Pass+"' where Username = '"+Username+"' and password='"+Password+"'";
		  String dbdriver="com.mysql.cj.jdbc.Driver";
		
			Class.forName(dbdriver);
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
			Statement st = conn.createStatement();
		  int count = st.executeUpdate(qry);
		  return count;
	  }
	
	  
	  
	  
	  
	  
	 
	  
	  
}


