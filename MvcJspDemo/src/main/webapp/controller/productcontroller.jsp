<%@page import="com.mvcjspdemo.pojo.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.mvcjspdemo.daoimpl.ProductDaoImpl"%>
<%@page import="com.mvcjspdemo.dao.ProductDao"%>
<%
	ProductDao daoImpl = new ProductDaoImpl();
	List<Product> lst = daoImpl.getAllProducts();
	request.setAttribute("PRODUCTLIST", lst);
%>
	<jsp:forward page="showall"/>