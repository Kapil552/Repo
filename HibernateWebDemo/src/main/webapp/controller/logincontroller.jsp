<%@page import="com.hibernatewebdemo.daoimpl.UserDaoImpl"%>
<%@page import="com.hibernatewebdemo.dao.UserDao"%>

<jsp:useBean class="com.hibernatewebdemo.pojo.User" id="user"
scope="page"/>
<jsp:setProperty property="*" name="user"/>

<%
	UserDao daoImpl = new UserDaoImpl();
	if(daoImpl.checkUserCredentials(user)) {
		session.setAttribute("USERNAME", user.getUsername());
		response.sendRedirect("home");
	} else {
		response.sendRedirect("login?msg=loginerror");
	}
%>