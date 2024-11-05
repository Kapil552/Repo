<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Multiply Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<%
	int fnum = Integer.parseInt(request.getParameter("Fnum"));
	int snum = Integer.parseInt(request.getParameter("Snum"));
	int ans = fnum*snum;
	%>
	<div class="container">
		<h1 style="color:slateblue;text-align:center">
			Multiply of <%=fnum%> and <%=snum%> is <%=ans%>
		</h1>
	</div>
</body>
</html>