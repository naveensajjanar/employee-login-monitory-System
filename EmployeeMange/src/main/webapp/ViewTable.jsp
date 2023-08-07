<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Names</title>
<link rel="stylesheet" type="text/css" href="View.css">
</head>
<body>


 <header>

        <div class="main">
            <ul>
                <li> <a href="AdminHome.jsp">Home</a> </li>
                <li> <a href="">About Us</a>  </li>
                <li> <a href="">contact us</a>  </li>
                <li> <a href="">Features</a>  </li>
                 <li> <a href="">How it Works</a>  </li>
                 <li><a href="AdminView.jsp">Back</a><li>
            </ul>
        </div>
    </header>


<div class="ta">

	<table>
	<caption style="font-size:30px";><B>Employee Details</B></caption>
		<tr>
			<td>Employee id</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Gender</td>
			<td>Date of Birth</td>
			<td>Joining Date</td>
			<td>Email</td>
			<td>Official Email</td>
			<td>Designation</td>
			<td>Address</td>
			<td>City</td>
			<td>State</td>
			<td>Country</td>
			<td>Pin Code</td>
			<td>Phone no</td>
			<td>Mobile no</td>
			<td>Area of Work</td>
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
	
	String str=request.getParameter("ID");
	String qry="select * from register;";
	
	rs=st.executeQuery(qry);
	
	while(rs.next())
	{
		%>
		<tr>
		<td><%=rs.getString(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
		<td><%=rs.getString(6) %></td>
		<td><%=rs.getString(7) %></td>
		<td><%=rs.getString(8) %></td>
		<td><%=rs.getString(9) %></td>
		<td><%=rs.getString(10) %></td>
		
		
		<td><%=rs.getString(11) %></td>
		<td><%=rs.getString(12) %></td>
		<td><%=rs.getString(13) %></td>
		<td><%=rs.getString(14) %></td>
		<td><%=rs.getString(15) %></td>
		<td><%=rs.getString(16) %></td>
		<td><%=rs.getString(17) %></td>
		
		
		</tr>
	<%
	}
}
catch(Exception e){}
%>
</table>
</div>

</body>
<style>
    table, th, td {
        
        text-align: center;
        border:2px solid black;
        border-collapse: collapse;
        
      }
     .ta
      {
      text-allign:center;
   
   margin-right:40px;
     margin-left:20px;
     margin-top:5%;

      }
 
  th,td
   {
   font-width:bolder;
   }
      </style>
</html>