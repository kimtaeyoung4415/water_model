package com.water.model.negotiation.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/negotiation")
public class NegotiationController {
	
	
	@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
	public String detail(HttpServletRequest request) throws Exception{
		return "web/negotiation/detail.tiles";
	}
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception{
		return "web/negotiation/list.tiles";
	}
	
	@RequestMapping(value = "/que.do", method = RequestMethod.GET)
	public String que(HttpServletRequest request) throws Exception{
		return "web/negotiation/que.tiles";
	}
}
