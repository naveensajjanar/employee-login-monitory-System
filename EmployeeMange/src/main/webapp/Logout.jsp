<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Logout/Sign Up</title>
</head>
<body>

  <% 
      
        session.invalidate();
        response.sendRedirect("index.jsp");
    %>
</body>
</html>