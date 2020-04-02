package com.water.model.about.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/about")
public class AboutController {

	
	@RequestMapping(value = "/company.do", method = { RequestMethod.GET })
	public ModelAndView about(ModelAndView mv) {

		mv.setViewName("web/about/company.tiles");
		return mv;
	}
}
