<%
	String uname = (String) session.getAttribute("USERNAME");
	if(uname == null || uname.equals(""))
		response.sendRedirect("login?msg=notloggedin");
	else {
		session.setAttribute("USERID", null);
		session.invalidate();
		response.sendRedirect("login?msg=logoutsuccess");
	}
%>