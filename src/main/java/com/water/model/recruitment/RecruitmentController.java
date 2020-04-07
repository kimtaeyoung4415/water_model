package com.water.model.recruitment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/recruitment")
public class RecruitmentController {
	
	private static final Logger logger = LoggerFactory.getLogger(RecruitmentController.class);
	
	@RequestMapping(value="/model_rt.do", method=RequestMethod.GET)
	public ModelAndView news(ModelAndView mv) {
		mv.setViewName("web/recruitment/model_rt.tiles");
		return mv;
	}
	
	@RequestMapping(value="/rsn.do",method= RequestMethod.GET)
	public ModelAndView registration(ModelAndView mv) {
		mv.setViewName("web/recruitment/rsn.tiles");
		return mv;
		
		}

}
