package com.springmvcdemo12.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@GetMapping("/checkuser")
	public ModelAndView checkUser(@RequestParam("txtUname") String uname,
			@RequestParam("txtPass") String upass) {
		
		ModelAndView mv=null;
		
		if(uname.equals("ABC@gmail.com")&&
			upass.equals("ABC@123")){
			mv=new ModelAndView("home","USERNAME",uname);
			return mv;
		}
		else
			mv=new ModelAndView("error","MSG","Invalid Login Credentials");
			return mv;
	}
}