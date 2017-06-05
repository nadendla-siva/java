package com.myntra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myntra.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;


	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}



	

	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView checkLogin(@RequestParam("userName") String userName,@RequestParam("password") String password){
		
		boolean b=loginService.check(userName,password);
		if(b){
			return new ModelAndView("success");
		}
		else{
			return new ModelAndView("failure");
		}
		
		
		
	}
}
