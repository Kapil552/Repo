<%@page import="com.jdbcloginjsp.daoimpl.UserDaoImpl"%>
<%@page import="com.jdbcloginjsp.dao.UserDao"%>

<jsp:useBean class="com.jdbcloginjsp.pojo.User" 
id="usr" scope="page"/>
<jsp:setProperty name="usr" property="*"/>

<%
	UserDao daoImpl = new UserDaoImpl();
	if(daoImpl.addNewUser(usr)) {
		response.sendRedirect("login?msg=regsuccess");
	} else {
		response.sendRedirect("register.html?msg=regerror");
	}
%>
