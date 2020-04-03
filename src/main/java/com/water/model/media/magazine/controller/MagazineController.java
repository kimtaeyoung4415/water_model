package com.water.model.media.magazine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/media")
public class MagazineController {
	
	private static final Logger logger = LoggerFactory.getLogger(MagazineController.class);
	
	@RequestMapping(value="/magazine.do", method=RequestMethod.GET)
	public ModelAndView news(ModelAndView mv) {
		mv.setViewName("web/media/magazine.tiles");
		return mv;
	}
	
	@RequestMapping(value="/view_details.do", method=RequestMethod.GET)
	public ModelAndView viewdetais(ModelAndView mv) {
		mv.setViewName("web/media/view_details.tiles");
		return mv;
	}
}
