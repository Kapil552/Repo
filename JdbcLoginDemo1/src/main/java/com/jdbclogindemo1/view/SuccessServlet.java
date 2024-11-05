package com.jdbclogindemo1.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String msg=request.getParameter("msg");
		String message="", pageUrl="";
		
		switch(msg) {
			case "regsuccess":
				message="registration successful";
				pageUrl="login.html";
				break;
				
			case "logoutsuccess":
				message="successfully logged out";
				pageUrl="login.html";
				break;
			
		}
		
		pw.println("<p style=\"color:green;text-align:center\">"+message+"</p>");
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(pageUrl);
		dispatcher.include(request, response);
	}
}
