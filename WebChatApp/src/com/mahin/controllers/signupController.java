package com.mahin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class signupController {

	
	public ModelAndView signup() {
		ModelAndView model=new ModelAndView("signup");
		return model;
		
	}

}
