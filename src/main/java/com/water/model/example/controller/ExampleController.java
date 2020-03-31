package com.water.model.example.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.water.model.example.service.InterExampleService;

@Controller
public class ExampleController {

	private static final Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
	@Autowired
	private InterExampleService exampleService;
	
	@RequestMapping(value = "/ex.do", method = { RequestMethod.GET })
	public ModelAndView example(ModelAndView mv) {

		String now = exampleService.getNow();
		
		mv.addObject("now", now);
		mv.setViewName("example/example");
		return mv;
	}
	
}
