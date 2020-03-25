package com.water.model.mng.actors.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="mng/actors")
public class ManageActorsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManageActorsController.class);

	// ���
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String actors() {				
		return "mng/actors.tiles";
	}
	
	
}
