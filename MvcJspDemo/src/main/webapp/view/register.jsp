<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		
		<c:if test="${param.msg == 'regerror'}">
			<c:set var="message" value="registration
			 failed"/>
			<c:set var="msgcolor" value="red"/> 
		</c:if>
		
		<p style="text-align:center;color:${msgcolor}">
			${message}
		</p>
		
		<h1 style="color:slateblue;text-align:center">
			Registration Page
		</h1>
		<form action="reguser" method="post">
			<div class="form-group">
				<label>Enter User Name</label>
				<input type="text" name="username" 
				placeholder="User Name" 
				class="form-control">
			</div>
			<div class="form-group">
				<label>Enter User Password</label>
				<input type="password" name="password" 
				placeholder="User Password" 
				class="form-control">
			</div>
			<input type="submit" value="CLICK TO REGISTER"
			class="btn btn-block btn-success">
		</form>
	</div>
</body>
</html>






