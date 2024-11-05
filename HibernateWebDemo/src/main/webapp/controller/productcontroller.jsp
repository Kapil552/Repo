<%@page import="com.hibernatewebdemo.pojo.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.hibernatewebdemo.daoimpl.ProductDaoImpl"%>
<%@page import="com.hibernatewebdemo.dao.ProductDao"%>
<%
	ProductDao daoImpl = new ProductDaoImpl();
	List<Product> lst = daoImpl.getAllProducts();
	request.setAttribute("PRODUCTLIST", lst);
%>
	<jsp:forward page="showall"/>