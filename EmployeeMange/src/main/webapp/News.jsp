<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>News Update</title>
    <link rel="stylesheet" type="text/css" href="News.css">
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

          
  

</div>
    </div>
    <form action="<%= request.getContextPath() %>/NewsServlet" method="post">
   <div class="topi">
   
    Topic:<input type="text" name="topic">
   </div>
   <div class="desc">
    Description:<textarea name="descri" ></textarea>
   </div>
   <div class="buttonWrapper">
          
    <button type="submit" >Submit</button>
    <button type="reset" >reset</button>
  </div>
  </form>
</body>
</html>