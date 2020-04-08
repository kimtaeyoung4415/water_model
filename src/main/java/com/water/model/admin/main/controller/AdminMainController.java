package com.water.model.admin.main.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class AdminMainController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AdminMainController.class );
	
	@RequestMapping(value="/main.do", method=RequestMethod.GET)
	public ModelAndView news(ModelAndView mv) {
		mv.setViewName("admin/main/main.tiles-a");
		return mv;
	}
	
}
