package com.springmvcdemo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springmvcdemo3.dao.UserDao;
import com.springmvcdemo3.pojo.User;

@Controller
public class UserController {

	private UserDao daoImpl;

	@Autowired
	public void setDaoImpl(UserDao daoImpl) {
		this.daoImpl = daoImpl;
	}
	
	@GetMapping("/")
	public String indexPage(Model m) {
		m.addAttribute("USEROBJ", new User());
		return "login";
	}
	
	@GetMapping("/checkuser")
	public String check(@ModelAttribute("USEROBJ") User user,
	Model m) {
		
		if(daoImpl.checkUserCredentials(user)) {
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




