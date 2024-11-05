package com.springmvcjdbcdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvcjdbcdemo.dao.UserDao;
import com.springmvcjdbcdemo.pojo.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {

	private UserDao daoImpl;

	@Autowired
	public void setDaoImpl(UserDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	@GetMapping("/checkuser")
	public String check(User user, Model m, 
	HttpServletRequest request) {
		
		HttpSession session = null;
		
		if(daoImpl.checkUserCredentials(user)) {
			session = request.getSession(true);
			session.setAttribute("USERNAME", 
					user.getUsername());
			return "home";
		}
		else {
			m.addAttribute("MSG", "invalid login credentials");
			return "error";
		}
	}
	
	@GetMapping("/adduser")
	public String add(User user, Model m) {
		
		if(daoImpl.addNewUser(user)) {
			m.addAttribute("MSG", 
					"user registration successful");
			return "success";
		}
		else {
			m.addAttribute("MSG", "user registration failed");
			return "error";
		}
	}
	
	@GetMapping("/logout")
	public String logout(Model m, HttpServletRequest request) {
		
		HttpSession session = null;
		
		session = request.getSession(false);
		
		if(session == null || 
		session.getAttribute("USERNAME") == null) {
			m.addAttribute("MSG", "you need to login first");
			return "error";
		}
		else {
			session.setAttribute("USERNAME", null);
			m.addAttribute("MSG", "logout successful");
			return "success";
		}
	}
}




