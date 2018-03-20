package com.han.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class pageController {
	
		@RequestMapping(value = {"/","/home","/index"})
			public ModelAndView index()
			{
				ModelAndView mv = new ModelAndView("page");
				mv.addObject("userClicksHome" , true);
				return mv;
			}
		@RequestMapping("/about")
		public ModelAndView about()
		{
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("userClicksAbout" , true);
			return mv;
		}
		@RequestMapping("/contact")
		public ModelAndView contact()
		{
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("userClicksContact" , true);
			return mv;
		}
		
}
