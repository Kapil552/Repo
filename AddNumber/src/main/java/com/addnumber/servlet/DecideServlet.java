package com.addnumber.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/takeinput")
public class DecideServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		int fnum=Integer.parseInt(request.getParameter("txtfnum"));
		int snum=Integer.parseInt(request.getParameter("txtsnum"));
		
		String choice = request.getParameter("radCal");
		String pageUrl = "";

		switch(choice) {
		case "a":
			pageUrl = "add?Fnum= " +fnum+ "&Snum=" +snum;
			break;
		case "s":
			pageUrl = "substract?Fnum= " +fnum+ "&Snum=" +snum;
			break;
		case "d":
			pageUrl = "multiply?Fnum= " +fnum+ "&Snum=" +snum;
			break;
		}

		response.sendRedirect(pageUrl);
	}	
}


