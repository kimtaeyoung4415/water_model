package com.water.model.admin.brd.ntce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin/ntce")
public class AdminNtceController {

	private static final Logger logger = LoggerFactory.getLogger(AdminNtceController.class);	
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv) throws Exception {				
		
		try {
			mv.setViewName("admin/ntce/list.tiles");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}
		
}
