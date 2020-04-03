package com.water.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/main")
public class MainController {
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public ModelAndView news(ModelAndView mv) {
		mv.setViewName("web/main/magazine.tiles");
		return mv;
	}
	
}
