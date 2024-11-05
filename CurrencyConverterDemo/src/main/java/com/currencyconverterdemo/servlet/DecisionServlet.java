package com.currencyconverterdemo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accept")
public class DecisionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) 
			throws ServletException, IOException {
	
		int amount = Integer.parseInt(
						request.getParameter("txtAmount"));
		String choice = request.getParameter("radCurrency");
		String pageUrl = "";
		
		switch(choice) {
		case "d":
				pageUrl = "dollar?amt="+amount;
				break;
		case "p":
				pageUrl = "pound?amt="+amount;
				break;				
		}
		
		//client side redirection
		response.sendRedirect(pageUrl);
	}
}