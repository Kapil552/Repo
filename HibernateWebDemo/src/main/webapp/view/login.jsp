<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Demo</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	
		<c:if test="${param.msg == 'loginerror'}">
			<c:set var="message" value="invalid login credentials"/>
			<c:set var="msgcolor" value="red"/>
		</c:if>
		
		<c:if test="${param.msg == 'notloggedin'}">
			<c:set var="message" value="you need to login first"/>
			<c:set var="msgcolor" value="red"/>
		</c:if>
		
		<c:if test="${param.msg == 'regsuccess'}">
			<c:set var="message" value="registration successful"/>
			<c:set var="msgcolor" value="green"/>
		</c:if>
		
		<c:if test="${param.msg == 'logoutsuccess'}">
			<c:set var="message" value="logout successful"/>
			<c:set var="msgcolor" value="green"/>
		</c:if>
		
		<p style="text-align:center;color:${msgcolor}">
			${message}
		</p>
		
		<h1 style="color:slateblue;text-align:center">
			Login Page
		</h1>
		
		<form action="checkuser" method="post" class="form">
			<div class="form-group">
				<label class="control-label">Enter Your User Name</label>
				<input type="text" name="username" placeholder="User Name"
				class="form-control"> 
			</div>
			
			<div class="form-group">
				<label class="control-label">Enter Your Password</label>
				<input type="password" name="password" placeholder="User Password"
				class="form-control"> 
			</div>
			
			<input type="submit" class="btn btn-block btn-info"
			value="LOGIN" name="btnLogin">
		</form>
		
		<p>Click <a href="reg">HERE</a> to register</p>
	</div>
</body>
</html>










