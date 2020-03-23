package com.water.model.example.controller;

import java.util.Map;

import javax.annotation.Resource;

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
	
	@RequestMapping(value = "/example.do", method = { RequestMethod.GET })
	public ModelAndView example(ModelAndView mv) {

		mv.setViewName("example/example");
		return mv;
	}
	
	@RequestMapping(value = "/aboutcompany.do", method = { RequestMethod.GET })
	public ModelAndView about(ModelAndView mv) {

		mv.setViewName("about/aboutcompany");
		return mv;
	}
	
	@RequestMapping(value = "/getUserInfo.do", method = { RequestMethod.GET }, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public ModelAndView getUserInfo(ModelAndView mv, @RequestParam Map<String, Object> param) {

		Map<String, Object> info = exampleService.getUserInfo(param);
		
		mv.addObject("info",info);
		mv.setViewName("example/example");
		
		return mv;
	}
	
	
}
