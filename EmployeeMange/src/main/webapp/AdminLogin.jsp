<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login page</title>
<link rel="Stylesheet" type="text/css" href="index.css">

<script type="text/javascript">
        function Validate(){
            
            var user=document.getElementById("Uname").value;
            var password=document.getElementById("Pass").value;
            if(user=="")
            {
                alert("Enter the User Id");
                 return false;// if we dont write return statement it will true for both if we leave blank for both the fields
            }
         
            if(password=="")
            {
                 alert("Enter the Password");
              return false;
            }
            
        }
       
        </script>

</head>
<header>

    <div class="main">
     
       
        <ul>
            <li> <a href="Home.html">Home</a></li>
            <li> <a href="">About Us</a>  </li>
            <li> <a href="">contact us</a>  </li>
            <li> <a href="">Features</a>  </li>
             <li> <a href="">How it Works</a>  </li>
        </ul>
    </div>
</header>
<body>
  <div class="container">
    <input type="checkbox" id="check">
    <div class="login form">
      <header>Login</header>
       <form action="<%= request.getContextPath() %>/AdminLog" method="post" onsubmit="return Validate();" >
   
      <input type="text" name="Uname" id="Uname" placeholder="Type your username">
       <input type="password" name="Pass" id="Pass" " placeholder="Type your password">
        <a href="#">Forgot password?</a>
        <input type="submit"   value="Login">
      </form>
      <div class="signup">
        <span class="signup">Don't have an account?
         <label for="check"><a href="AdminReg.jsp">signup</a></label>
        </span>
      </div>
    </div>
  </div>

  
  <fieldset>
  <div id="imge">
  <img alt="unavilable" src="front.jpg"  width="630" height="485">
  </div>
  </fieldset>
  

  <footer>
    <div class="Foot">

    <ul>
        <li> <a href="">Home</a></li>
        <li> <a href="">About Us</a>  </li>
        <li> <a href="">contact us</a>  </li>
        <li> <a href="">Features</a>  </li>
         <li> <a href="">How it Works</a>  </li>
    </ul>

</div>
  </footer>
</body>
</html>