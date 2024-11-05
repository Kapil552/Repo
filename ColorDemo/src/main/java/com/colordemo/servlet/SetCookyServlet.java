package com.colordemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/takecolor")
public class SetCookyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		String uname=request.getParameter("Uname");
		String choice=request.getParameter("radcal");
		String color="";
		
		switch(choice) {
		case "r" :
			color="Red";
			break;
		case "g" :
			color="Green";
			break;
		case "y" :
			color="Yellow";
			break;
		}
		
		
		Cookie cn=new Cookie("namecooky",uname);
		Cookie cc=new Cookie("colorcooky",color);
		
		response.addCookie(cn);
		response.addCookie(cc);
		
		pw.println("<h1 style=\"color:" +color+ " text-align:center\">Cookies created "
				+ "on your machine</h1>");
		pw.println("<a href=\"getcooky\">Click here to see your cookies</a>");
	}
}
