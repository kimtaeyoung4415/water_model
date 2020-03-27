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
	
	@RequestMapping(value = "/example.do", method = { RequestMethod.GET })
	public ModelAndView example(ModelAndView mv) {

		mv.setViewName("example/example.tiles");
		return mv;
	}
	
	@RequestMapping(value = "/getUserList.do", method = { RequestMethod.GET }, produces = "application/json; charset=UTF-8")
	@ResponseBody
	public ModelAndView getUserList(ModelAndView mv, @RequestParam Map<String, Object> param) {

		List<Map<String, Object>> list = exampleService.getUserList();
		
		mv.addObject("list",list);
		mv.setViewName("example/example.tiles");
		
		return mv;
	}
	
}
