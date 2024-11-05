<%@page import="com.mvcjspdemo.daoimpl.UserDaoImpl"%>
<%@page import="com.mvcjspdemo.dao.UserDao"%>

<jsp:useBean class="com.mvcjspdemo.pojo.User" 
id="usr" scope="page"/>
<jsp:setProperty name="usr" property="*"/>

<%
	UserDao daoImpl = new UserDaoImpl();
	if(daoImpl.checkUserDetails(usr)) {
		session.setAttribute("USERNAME", usr.getUsername());
		response.sendRedirect("home");
	} else {
		response.sendRedirect("login?msg=loginerror");
	}
%>