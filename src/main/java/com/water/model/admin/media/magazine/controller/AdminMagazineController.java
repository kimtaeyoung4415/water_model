package com.water.model.admin.media.magazine.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.water.model.admin.media.magazine.controller.AdminMagazineController;

@Controller
@RequestMapping(value="/admin/media")
public class AdminMagazineController {
private static final Logger logger = LoggerFactory.getLogger(AdminMagazineController.class);
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list(ModelAndView mv) {
		mv.setViewName("admin/media/list.tiles-a");
		return mv;
	}
	@RequestMapping(value="/dtl.do", method=RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv) {
		mv.setViewName("admin/media/dtl.tiles-a");
		
		return mv;
	}
	@RequestMapping(value="/ins.do", method=RequestMethod.GET)
	public ModelAndView edit(ModelAndView mv) {
		mv.setViewName("admin/media/ins.tiles-a");
		return mv;
	}
}
