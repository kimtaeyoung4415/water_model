package com.water.model.registration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/registration")
public class RegistrationController {

	@RequestMapping(value="/model_rsn.do",method= RequestMethod.GET)
	public ModelAndView registration(ModelAndView mv) {
		mv.setViewName("web/registration/model_rsn");
		return mv;
		
		}
	}
