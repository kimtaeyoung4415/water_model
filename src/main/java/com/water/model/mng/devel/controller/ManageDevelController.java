package com.water.model.mng.devel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="mng/devel")
public class ManageDevelController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageDevelController.class);

	// ���
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String actors() {				
		return "mng/development.tiles";
	}
	
	
}
