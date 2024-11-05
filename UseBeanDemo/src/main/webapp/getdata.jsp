<%@page import="com.usebeandemo.entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>get data page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>	
	<jsp:useBean class="com.usebeandemo.entity.User" 
	id="u" scope="page"/>
	<jsp:setProperty name="u" property="*"/>
	
	<h1 style="color:slateblue;text-align:center">
		User Details are :- 
	</h1>
		<h2>User Name : 
			<jsp:getProperty property="username" name="u"/> 
		</h2>
		<h2>User Email : 
			<jsp:getProperty property="email" name="u"/>
		</h2>
		<h2>User Contact : 
			<jsp:getProperty property="contact" name="u"/>
		</h2>
</body>
</html>


