<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>View Employee</title>
    <link rel="stylesheet" type="text/css" href="View.css">
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
       <div class="ta">

	<table>
		<tr>
			<td>Employee id</td>
			<td> Employee Names</td>
			<td></td>
		</tr>


	<%

Connection conn=null;
Statement st=null;
ResultSet rs=null;


try
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/employeetable","root","Sajjanar@123");
	st=conn.createStatement();
	
	
	String qry="select * from register";
	rs=st.executeQuery(qry);
	
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><a href="ViewTable.jsp?getEmp_id=?">view</a></td>
		</tr>
	<%
	}
}
catch(Exception e){}
%>
</table>
</div> 
 
 
</div>
    <style>
     table, th, td {
        
        text-align: center;
        border:5px solid blue;
        border-collapse: collapse;
        color:black;
        font-size:25px;
        font-weight:bold;
        
      }
       th:hover,td:hover
      {
        background-color: aliceblue;
        font-size: 30px;
      }
     .ta
      {
      float:right;
    padding-top: 200px;
margin-top: -5%;
margin-right:150px;

      }
   table
   {
width:600px;
height:100px;
   }
      </style>
</body>
</html>