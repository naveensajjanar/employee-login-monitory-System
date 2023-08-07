<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
 <link rel="stylesheet" type="text/css" href="EmployeeReg.css">
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
                 <li> <a href="AdminLogin.jsp">Login</a>  </li>
            </ul>
        </div>
    </header>

    <form action="<%= request.getContextPath() %>/AdminReg" method="post">
    <fieldset>
            <header>Register</header>
<table style="with: 80%">
	<tr>
     <td>Employee ID</td>
     <td><input type="text" name="ID" id="ID" required/></td>
    </tr>

        <tr>
     <td>first name</td>
     <td><input type="text" name="fname" id="fname" required/></td>
    </tr> 

 	<tr>
     <td>last name</td>
     <td><input type="text" name="lname" id="lname" required/></td>
    </tr>

        <tr>
     <td>DOB</td>
     <td><input type="text" name="Dob" id="Dob" required/></td>
    </tr> 
	

	<tr>
     <td>Gender</td>
     <td><input type="radio" name="mal" id="mal"   value="Male" >Male 
         <input type="radio" name="mal" id="mal" value="FeMale">Female</td>
    </tr>

        <tr>
     <td>Joining Date</td>
     <td><input type="text" name="jdate" id="jdate"   required/></td>
    </tr> 

 	<tr>
     <td>Email</td>
     <td><input type="text" name="email" id="email"  required/></td>
    </tr>

        <tr>
     <td>Official email</td>
     <td><input type="text" name="Oemail" id="Oemail" required/></td>
    </tr> 

	<tr>
     <td>Designation</td>
     <td><input type="text"  name="des" id="des"  required/></td>
    </tr>

     <tr>
     <td>Address</td>
     <td><textarea name="message" id="message" style="width:200px; height:50px;"required></textarea></td>
    </tr> 
    
	<tr>
     <td>City</td>
     <td><input type="text" name="city" id="city"  required/></td>
    </tr>

        <tr>
     <td>State</td>
     <td> <input type="text" name="state" id="state" required/></td>
    </tr> 

 	<tr>
     <td>Country</td>
     <td><input type="text" name="country" id="country" required/></td>
    </tr>

        <tr>
     <td>Pin code</td>
     <td><input type="text" name="pin" id="pin" required/></td>
    </tr> 
	

	<tr>
     <td>Phone no</td>
     <td><input type="text" name="phone" id="phone" /></td>
    </tr>

        <tr>
     <td>Mobile no</td>
     <td><input type="text" name="mobile" id="mobile" required/></td>
    </tr> 

 	<tr>
     <td>Area of work</td>
     <td><input type="text" name="area" id="area" required/></td>
    </tr>

        <tr>
     <td>Secret question</td>
     <td><input type="text" name="question" id="question" required/></td>
    </tr> 

	<tr>
     <td>Secret Answer</td>
     <td><input type="text" name="answ" id="answ" required/></td>
    </tr>

        <tr>
     <td>Username</td>
     <td><input type="text" name="Uname" id="Uname" placeholder="Type your username" required/></td>
    </tr> 
<tr>
     <td>Password</td>
     <td><input type="password" name="Pass" id="Pass"  placeholder="Type your password"  required/></td>
    </tr> 
    </table>
        
       <input type="submit"  value="register"> 
        <input type="reset" name="reset"><br>
    </fieldset>
    </form>
    

</body>
</html>