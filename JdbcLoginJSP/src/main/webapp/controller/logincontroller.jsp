<%@page import="com.jdbcloginjsp.daoimpl.UserDaoImpl"%>
<%@page import="com.jdbcloginjsp.dao.UserDao"%>
<jsp:useBean class="com.jdbcloginjsp.pojo.User" 
id="usr" scope="page"/>
<jsp:setProperty name="usr" property="*"/>

<%
	UserDao daoImpl = new UserDaoImpl();
	if(daoImpl.checkUserDetails(usr)) {
		session.setAttribute("USERID", usr.getUserid());
		response.sendRedirect("home");
	} else {
		response.sendRedirect("login?msg=loginerror");
	}
%>