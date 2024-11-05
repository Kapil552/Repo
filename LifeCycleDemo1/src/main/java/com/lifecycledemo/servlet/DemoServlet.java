package com.lifecycledemo.servlet;

import java.io.IOException;

import javax.servlet.*;

public class DemoServlet extends GenericServlet {
		public void init(ServletConfig config) throws ServletException{
			System.out.println("init() called");
		}
		
		public void service(ServletRequest request,ServletResponse response) throws ServletException,
			IOException{
				System.out.println("service() called");
		}
		
		public void destroy() {
			System.out.println("destroy() called");
		}
}
