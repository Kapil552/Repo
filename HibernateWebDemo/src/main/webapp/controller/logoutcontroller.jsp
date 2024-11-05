<%
	String uname = (String) session.getAttribute("USERNAME");
	
	if(uname != null) {
		session.setAttribute("USERNAME", null);
		session.invalidate();
		response.sendRedirect("login?msg=logoutsuccess");
	} else {
		response.sendRedirect("login?msg=notloggedin");
	}
%>