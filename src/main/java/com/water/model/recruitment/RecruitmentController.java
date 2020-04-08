package com.water.model.recruitment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/rit")
public class RecruitmentController {
	
	private static final Logger logger = LoggerFactory.getLogger(RecruitmentController.class);
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public ModelAndView news(ModelAndView mv) {
		mv.setViewName("web/rit/list.tiles");
		return mv;
	}
	
	@RequestMapping(value="/dtl.do",method= RequestMethod.GET)
	public ModelAndView registration(ModelAndView mv) {
		mv.setViewName("web/rit/dtl.tiles");
		return mv;
		
		}

}
