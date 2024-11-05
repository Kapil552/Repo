<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1 style="color:slateblue;text-align:center">
		Login Page</h1>
		
		<form action="checkuser" method="get">
			<div class="form-group">
				<label class="control-label">Enter User Name</label>
				<input type="text" name="txtUname" placeholder="User Name"
				class="form-control">
			</div>
			<div class="form-group">
				<label class="control-label">Enter User Password</label>
				<input type="password" name="txtPass" placeholder="User password"
				class="form-control">
			</div>
			<input type="submit" value="Click to send Data"
			class="btn btn-block btn-success" name="btnlogin">
		</form>
	</div>
</body>
</html>