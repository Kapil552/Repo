<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<%@ page isELIgnored="false" %>
<%
	response.setHeader("Pragma", "no-cache");// HTTP 1.0
	response.setDateHeader("Expires", 0);
	response.setHeader("Cache-Control", 
	"no-cache, no-store, must-revalidate"); // HTTP 1.1
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<c:if test="${empty sessionScope.USERNAME}">
		<c:redirect url="login?msg=notloggedin" />
	</c:if>
	
	<div class="container">
		<h1 style="color:green;text-align:center">
			Welcome ${sessionScope.USERNAME} , to your
			profile page
		</h1>
		
		<p>Click <a href="getall">HERE</a> 
		to view all products</p>
		
		<a href="logout">LOGOUT</a>
	</div>
</body>
</html>






