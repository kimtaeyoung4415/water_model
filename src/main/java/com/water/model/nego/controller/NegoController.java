package com.water.model.nego.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/nego")
public class NegoController {
	
	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public String dtl(HttpServletRequest request) throws Exception{
		return "web/nego/dtl.tiles";
	}
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception{
		return "web/nego/list.tiles";
	}
	
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception{
		return "web/nego/ins.tiles";
	}
	
	@RequestMapping(value="/edit.do" , method = RequestMethod.GET)
	public String edit(HttpServletRequest request)throws Exception{
		return "web/nego/edit.tiles";
	}
}
