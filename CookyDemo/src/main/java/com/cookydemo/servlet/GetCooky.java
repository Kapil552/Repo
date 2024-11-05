package com.cookydemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcooky")
public class GetCooky extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Cookie[] arr=request.getCookies();
		String uname="", upass="";
		
		for(Cookie c:arr) {
			if(c.getName().equals("namecooky"))
			uname=c.getValue();
			
			if(c.getName().equals("passcooky"))
			upass=c.getValue();
		}
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html lang=\"en\">");
		pw.println("<head>");
		pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
		pw.println("<title>Cookies Page</title>");
		pw.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		pw.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>");
		pw.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<div class=\"container\">");
		pw.println("<h1 style=\"color: slateblue; text-align: center;\">Data from your Cookies</h1>");
		pw.println("<h2 style=\"color: yellow; text-align: center;\">User Name:"+uname+"</h2>");
		pw.println("<h2 style=\"color: violet; text-align: center;\">User pass:"+upass+"</h2>");
		pw.println("</div>");
		pw.println("</head>");
		pw.println("</html");
	}

}
