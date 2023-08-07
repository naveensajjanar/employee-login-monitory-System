<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
 <title>Report</title>
    <link rel="stylesheet" type="text/css" href="Report.css">
</head>
<body>

    <header>

        <div class="main">
            <ul>
                <li> <a href="">Home</a>  </li>
                <li> <a href="">About Us</a>  </li>
                <li> <a href="">contact us</a>  </li>
                <li> <a href="">Features</a>  </li>
                 <li> <a href="">How it Works</a>  </li>
                  <li> <a href="Logout.jsp">logout</a>  </li>
            </ul>
        </div>
    </header>
    <div class="left">
        <li> <a href="EmpHome.jsp">Home</a></li>
        <li> <a href="Editprofile.jsp">Edit profile</a></li>
        <li> <a href="Changepwd.jsp">Change password</a></li>
        <li ><a href="Report.jsp">Report</a></li>
        <li ><a href="LoginDetail.jsp">Login Details</a></li>
    </div>
    
    <div class="cen">
    
    <h1>Task Report</h1>
        <div id="in">
         
        <form action="<%request.getContextPath(); %>/ReportServ" method="post">
       
<label>Month:</label>

<input type="date"  name="Date"value="Month"><br>
<label>Task:</label>
<input type="textarea" name="task" placeholder="Enter the task completed by you" >
<div class="buttonWrapper">
          
    <button type="submit" >Submit</button>
    <button type="reset" >reset</button>
  </div>
  </form>
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