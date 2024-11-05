package com.currencyforwarddemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dollar" , 
initParams = @WebInitParam(name = "DRATE" , value = "84"))
public class DollarServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, 
	HttpServletResponse response) 
			throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		ServletContext context = getServletContext();
		String message = context.getInitParameter("MSG");
		
		ServletConfig config = getServletConfig();
		int rate = Integer.parseInt(
				config.getInitParameter("DRATE"));
		
		int amount = Integer.parseInt(
						request.getParameter("txtAmount"));
		int ans = amount / rate;
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<title>Dollar Page</title>");
		pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		pw.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		pw.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js\"></script>");
		pw.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<div class=\"container\">");
		pw.println("<h1 style=\"color:slateblue;"
		+"text-align:center\">" + message + " ,your amount in "
				+ "dollars : "+ ans + "</h1>");
		pw.println("</div>");
		pw.println("</body>");
		pw.println("</html>");
	}
}






