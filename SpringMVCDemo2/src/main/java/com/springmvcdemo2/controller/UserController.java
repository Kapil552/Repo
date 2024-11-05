package com.springmvcdemo2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.springmvcdemo2.dao.UserDao;
import com.springmvcdemo2.pojo.User;

@Controller
public class UserController {

	private UserDao daoImpl;

	@Autowired
	public void setDaoImpl(UserDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	@GetMapping("/checkuser")
	public String check(User user, Model m) {
		
		if(daoImpl.checkUserCredentials(user)) {
			m.addAttribute("USERNAME", user.getUsername());
			return "home";
		}
		else {
			m.addAttribute("MSG", "invalid login credentials");
			return "error";
		}
	}
	
//	@GetMapping("/checkuser")
//	public String check(User user, ModelMap m) {
//		
//		if(daoImpl.checkUserCredentials(user)) {
//			m.addAttribute("USERNAME", user.getUsername());
//			return "home";
//		}
//		else {
//			m.addAttribute("MSG", "invalid login credentials");
//			return "error";
//		}
//	}
}




