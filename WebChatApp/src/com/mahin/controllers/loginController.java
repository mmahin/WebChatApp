package com.mahin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class loginController {

	@RequestMapping("/")
	public ModelAndView login() {
		ModelAndView model=new ModelAndView("login");
		return model;
		
	}
}
