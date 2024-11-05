<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	
		<c:if test="${param.msg == 'loginerror'}">
			<c:set var="message" value="invalid login
			 credentials"/>
			<c:set var="msgcolor" value="red"/> 
		</c:if>
		
		<c:if test="${param.msg == 'regsuccess'}">
			<c:set var="message" value="registration 
			successful"/>
			<c:set var="msgcolor" value="green"/> 
		</c:if>
		
		<c:if test="${param.msg == 'logoutsuccess'}">
			<c:set var="message" value="logout 
			successful"/>
			<c:set var="msgcolor" value="green"/> 
		</c:if>
		
		<c:if test="${param.msg == 'notloggedin'}">
			<c:set var="message" value="you need to
			 login first"/>
			<c:set var="msgcolor" value="red"/> 
		</c:if>
	
		<p style="text-align:center;color:${msgcolor}">
			${message}
		</p>
		
		<h1 style="color:slateblue;text-align:center">
			Login Page
		</h1>
		<form action="checkuser" method="post">
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
			<input type="submit" value="CLICK TO LOGIN"
			class="btn btn-block btn-success">
		</form>
		<p>Click <a href="reg">HERE</a> 
		to register</p>
	</div>
</body>
</html>






