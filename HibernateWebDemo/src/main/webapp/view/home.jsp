<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <title>Home Page</title>
</head>
<body>
	<c:if test="${empty sessionScope.USERNAME}">
		<c:redirect url="login?msg=notloggedin" />
	</c:if>
	
	<div class="container">
		<h1 style="color:green;text-align:center">
			Welcome ${sessionScope.USERNAME} , to your profile page
		</h1>
		
		<p>Click <a href="getall">HERE</a> to show all products</p>
		
		<p>Click <a href="logout">HERE</a> to logout</p>
	</div>
</body>
</html>







