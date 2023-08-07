<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Profile</title>
 <link rel="stylesheet" type="text/css" href="EditProfile.css">
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
    
    
<div class="cen">
    <form action="<%= request.getContextPath() %>/UpdateProfile" method="post">
        <fieldset>
            <header>Edit Profile</header>
    <table style="with: 80%">
	<tr>
     <td>Employee ID</td>
     <td><input type="text" name="ID" id="ID" /></td>
    </tr>

        <tr>
     <td>first name</td>
     <td><input type="text" name="fname" id="fname" /></td>
    </tr> 

 	<tr>
     <td>last name</td>
     <td><input type="text" name="lname" id="lname" /></td>
    </tr>

        <tr>
     <td>DOB</td>
     <td><input type="text" name="Dob" id="Dob" /></td>
    </tr> 
	

	<tr>
     <td>Gender</td>
     <td><input type="radio" name="mal" id="mal"   value="Male" >Male 
         <input type="radio" name="mal" id="mal" value="FeMale">Female</td>
    </tr>

        <tr>
     <td>Joining Date</td>
     <td><input type="text" name="jdate" id="jdate"  /></td>
    </tr> 

 	<tr>
     <td>Email</td>
     <td><input type="text" name="email" id="email" /></td>
    </tr>

        <tr>
     <td>Official email</td>
     <td><input type="text" name="Oemail" id="Oemail" /></td>
    </tr> 

	<tr>
     <td>Designation</td>
     <td><input type="text"  name="des" id="des"  /></td>
    </tr>

     <tr>
     <td>Address</td>
     <td><textarea name="message" id="message" style="width:200px; height:50px;"></textarea></td>
    </tr> 
    
	<tr>
     <td>City</td>
     <td><input type="text" name="city" id="city" /></td>
    </tr>

        <tr>
     <td>State</td>
     <td> <input type="text" name="state" id="state" /></td>
    </tr> 

 	<tr>
     <td>Country</td>
     <td><input type="text" name="country" id="country" /></td>
    </tr>

        <tr>
     <td>Pin code</td>
     <td><input type="text" name="pin" id="pin" /></td>
    </tr> 
	

	<tr>
     <td>Phone no</td>
     <td><input type="text" name="phone" id="phone" /></td>
    </tr>

        <tr>
     <td>Mobile no</td>
     <td><input type="text" name="mobile" id="mobile" /></td>
    </tr> 

 	<tr>
     <td>Area of work</td>
     <td><input type="text" name="area" id="area" /></td>
    </tr>

        <tr>
     <td>Secret question</td>
     <td><input type="text" name="question" id="question" /></td>
    </tr> 

	<tr>
     <td>Secret Answer</td>
     <td><input type="text" name="answ" id="answ" /></td>
    </tr>

        <tr>
     <td>Username</td>
     <td><input type="text" name="Uname" id="Uname" placeholder="Type your username"/></td>
    </tr> 
<tr>

    </table>
          
            <button type="submit" >Submit</button>
            <button type="reset" >reset</button>

          
    </fieldset>
    </form>
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
<div class="left">
           <li> <a href="EmpHome.jsp">Home</a></li>
          <li> <a href="Editprofile.jsp">Edit profile</a></li>
          <li> <a href="Changepwd.jsp">Change password</a></li>
          <li ><a href="Report.jsp">Report</a></li>
</div>
</body>
</html>