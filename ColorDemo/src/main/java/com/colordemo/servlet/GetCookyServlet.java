package com.colordemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcooky")
public class GetCookyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		Cookie []arr=request.getCookies();
		String uname="", color="";
		
		for(Cookie c: arr) {
			if(c.getName().equals("namecooky"))
				uname=c.getValue();
			
			if(c.getName().equals("colorcooky"))
				color=c.getValue();
		}
		
		pw.println("<h1 style=\"color:slateblue; text-align:center\">Data from your cokies</h1>");
		pw.println("<h2 style=\"color:Green; text-align:center\">User Name:"+uname+"</h2>");
		pw.println("<h2 style=\"color:"+color+ " text-align:center\">Favorite Color:"+color+"</h2>");
	
		}
}
