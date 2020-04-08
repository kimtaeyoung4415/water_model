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
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView news(ModelAndView mv) {
		mv.setViewName("web/media/list.tiles");
		return mv;
	}
	
	@RequestMapping(value="/dtl.do", method=RequestMethod.GET)
	public ModelAndView viewdetais(ModelAndView mv) {
		mv.setViewName("web/media/dtl.tiles");
		return mv;
	}
}
