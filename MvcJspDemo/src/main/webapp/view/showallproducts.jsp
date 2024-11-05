<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Products Page</title>
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
		<table class="table table-hover table-bordered">
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Product Price</th>
			</tr>
			<c:forEach items="${requestScope.PRODUCTLIST}" 
			var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
				</tr>	
			</c:forEach>
		</table>
	</div>
</body>
</html>






