package com.han.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {
	
		@RequestMapping(value = {"/","/home","/index"})
			public ModelAndView index()
			{
				ModelAndView mv = new ModelAndView("page");
				mv.addObject("greetings" , "welcome to sprng mvc");
				return mv;
			}
}
