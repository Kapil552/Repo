package com.jdbclogindemo1.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jdbclogindemo1.dao.UserDao;
import com.jdbclogindemo1.daoimpl.UserDaoImpl;
import com.jdbclogindemo1.pojo.User;

@WebServlet("/checkuser")
public class LoginController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, IOException {
		
		String uname=request.getParameter("txtUname");
		String upass=request.getParameter("txtPass");
		
		User user=new User(uname,upass);
		UserDao daoImpl=new UserDaoImpl();
		
		if(daoImpl.checkUserDetails(user)) {
			HttpSession session=request.getSession(true);
			session.setAttribute("USERNAME", uname);
			response.sendRedirect("home");
		}else {
			response.sendRedirect("error?msg=loginerror");
		}
	}

}
