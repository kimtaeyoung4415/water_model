package com.water.model.mng.men.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="mng/men")
public class ManageMenController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageMenController.class);

	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String actors() {
		return "mng/men";
	}
	
	
}
