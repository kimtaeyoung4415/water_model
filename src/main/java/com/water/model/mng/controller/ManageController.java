package com.water.model.mng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/mng")
public class ManageController {

	private static final Logger logger = LoggerFactory.getLogger(ManageController.class);
	
	@RequestMapping(value = "/men/list.do", method = RequestMethod.GET)
	public String men() {
		return "web/mng/men.tiles";
	}
	
	@RequestMapping(value = "/women/list.do", method = RequestMethod.GET)
	public String women() {
		return "web/mng/women.tiles";
	}
	
	@RequestMapping(value = "/devel/list.do", method = RequestMethod.GET)
	public String devel() {
		return "web/mng/development.tiles";
	}
	
	@RequestMapping(value = "/actors/list.do", method = RequestMethod.GET)
	public String actors() {
		return "web/mng/actors.tiles";
	}
	
	@RequestMapping(value = "/view.do", method = RequestMethod.GET)
	public String view() {
		return "web/mng/mngview.tiles";
	}
}
