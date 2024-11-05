package com.jdbclogindemo1.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/error")
public class ErrorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String msg=request.getParameter("msg");
		String message="", pageUrl="";
		          
		switch(msg) {
			case "loginerror":
				message="invalid username or password";
				pageUrl="login.html";
				break;
				
			case "notloggedin":
				message="you need to login first";
				pageUrl="login.html";
				break;
				
			case "regerror":
				message="registration failed";
				pageUrl="register.html";
				break;
		}
		
		pw.println("<p style=\"color:red;text-align:center\">"+message+"</p>");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(pageUrl);
		dispatcher.include(request, response);
	}
}
