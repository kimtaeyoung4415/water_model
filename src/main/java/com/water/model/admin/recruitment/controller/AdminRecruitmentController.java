package com.water.model.admin.recruitment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/admin")
public class AdminRecruitmentController {
private static final Logger logger = LoggerFactory.getLogger(AdminRecruitmentController.class);
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView list(ModelAndView mv) {
		mv.setViewName("admin/rit/list.tiles-a");
		return mv;
	}
	
	@RequestMapping(value="/dtl.do", method=RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv) {
		mv.setViewName("admin/rit/dtl.tiles-a");
		return mv;
	}
	@RequestMapping(value="/dtl2.do", method=RequestMethod.GET)
	public ModelAndView dtl2(ModelAndView mv) {
		mv.setViewName("admin/rit/dtl2.tiles-a");
		return mv;
	}

}
