package com.jdbclogindemo1.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		HttpSession session=request.getSession(false);
		
		if(session!=null) {
			String uname=(String)session.getAttribute("USERNAME");
			
			String s_id=session.getId();
			String session_id="";
			
			Cookie[] arr=request.getCookies();
			
			for(Cookie c:arr) {
				if(c.getName().equals("JSESSIONID"))
					session_id=c.getValue();
			}
			
			pw.println("<body>");
			pw.println("<div class=\"container\">");
			pw.println("<h1 style=\"color:green;text-align:center\">Welcome"+uname+", to your profile"
					+ "page </h1>");
			pw.println("<h2 style=\"color:green;text-align:center;\">Your Session Id:" +s_id+ "</h2>");
			pw.println("<h2 style=\"color:green;text-align:center;\">Your Session Id from cookies:" +session_id+ "</h2>");
			pw.println("<a href=\"logout\">LOGOUT</a>");
			pw.println("</div>");
			pw.println("</body>");
		}else {
			response.sendRedirect("error?msg=notloggedin");
		}
	}

}
