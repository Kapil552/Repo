package com.cookieedemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setcooky")
public class SetCookieDemo extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
			
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String uname=request.getParameter("Uname");
		String upass=request.getParameter("Upass");
		
		Cookie cn=new Cookie("namecooky",uname);
		Cookie cp=new Cookie("passcooky",upass);
		
		response.addCookie(cn);
		response.addCookie(cp);
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Set Cooky Page</title>");
		pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		pw.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		pw.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>");
		pw.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<div class=\"container\">");
		pw.println("<h1 style=\"color:brown;"
		+"text-align:center\">Cookies created on your "
		+ "machine</h1>");
		pw.println("<a href=\"getcooky\">CLICK HERE TO SEE"
				+ " YOUR COOKIES</a>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
		
	}

}
