package com.water.model.admin.nego.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/admin")
public class AdminNegoController {
	
	//목록 페이지 이동
	@RequestMapping(value="/nego/list.do", method=RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception{
		return "admin/nego/list.tiles";
	}
	
	//등록 페이지 이동
	@RequestMapping(value="/nego/ins.do", method=RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception{
		return "admin/nego/ins.tiles";
	}
	
	//상세보기 페이지 이동
	@RequestMapping(value="/nego/dtl.do", method=RequestMethod.GET)
	public String dtl(HttpServletRequest request) throws Exception{
		return "admin/nego/dtl.tiles";
	}
}
