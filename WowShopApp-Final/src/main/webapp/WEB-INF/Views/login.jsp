  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>

<h2>Login Form</h2> 

<div class="container" style="padding:50px 0">
	<div class="row">login</div>
	<!-- Main Form -->
	<div class="l">
	<c:url var="loginUrl" value="/j_spring_security_check" />
	
		<form id="login-form" name="formLogin" action="${loginUrl}"  method="post" class="text-left">
			<div class="login-form-main-message"></div>
			<div class="main-login-form">
				<div class="login-group">
					<div class="form-group">
						<label for="lg_username" class="sr-only">Username</label>
						<input type="text" class="form-control" id="lg_username" name="j_username" placeholder="username" required>
					</div>
					<div class="form-group">
						<label for="lg_password" class="sr-only">Password</label>
						<input type="password" class="form-control" id="lg_password" name="j_password" placeholder="password" required>
					</div>

				</div>
				<!-- <button type="submit" class="login-button">Login</button> -->
				<input type="submit" name="submit" value="Login"/>
			</div>
			 <input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		</form>
		</div>
		</div>


  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">New User <a href="reg">Register</a></span>
  </div>
</form>
    
</body>
</html> 
