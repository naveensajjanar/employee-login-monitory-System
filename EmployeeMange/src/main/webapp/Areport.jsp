<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<title>Admin Report</title>
    <link rel="stylesheet" type="text/css" href="Areport.css">
</head>
<body>
 <header>

        <div class="main">
            <ul>
                <li> <a href="Home.html">Home</a>  </li>
                <li> <a href="">About Us</a>  </li>
                <li> <a href="">contact us</a>  </li>
                <li> <a href="">Features</a>  </li>
                 <li> <a href="">How it Works</a>  </li>
            </ul>
        </div>
    </header>
    <div class="left">
        <li><a href="AdminHome.jsp">Home</a></li>
        <li><a href="AdminView.jsp">View Employees</a></li>  
        <li><a href="AdminChangepwd.jsp">Change password</a></li>
        <li><a href="Areport.jsp">Report</a></li>
        <li><a href="News.jsp">News update</a></li>
        <li><a href="Meeting.jsp">Meeting update</a></li>
     </div>
    
    <div class="cen">
        <div id="in">
            <form action="">
                <label>Employee Names</label>
                <br>
                <input list="Employee" name="Employee ">
                
                <br>
<label>Month</label><br>
<input type="date" value="Month">
<div class="buttonWrapper">
          
    <button type="submit" >Submit</button>
    <button type="reset" >reset</button>
  </div>
</div>
    </div>
    <div class="righ">
          <h1 style="font-weight:bolder">News</h1>     
   <%

Connection conn=null;
Statement st=null;
ResultSet rs=null;


try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
	st=conn.createStatement();
	
	
	String qry="select * from news_update";
	rs=st.executeQuery(qry);
	
while(rs.next())
{
	%>
	
	
	Topic:<%= rs.getString(1) %>
	<br>
	Description:<%= rs.getString(2)%>
		<br>
	<%
}
}
catch(Exception e){}

%>

<h1 style="font-weight:bolder">Meetings</h1>     
   <%




try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
	st=conn.createStatement();
	
	
	String qry="select * from meeting_updates";
	rs=st.executeQuery(qry);
	
while(rs.next())
{
	%>
	
	
	Topic:<%= rs.getString(1) %>
	<br>
	Description:<%= rs.getString(2)%>
		<br>
	<%
}
}
catch(Exception e){}

%>

    </div>
</body>
</html>