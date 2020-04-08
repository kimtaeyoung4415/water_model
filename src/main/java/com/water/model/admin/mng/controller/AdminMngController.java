package com.water.model.admin.mng.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/admin/mng")
public class AdminMngController {
	
	@RequestMapping(value="/list.do")
	public String list(HttpServletRequest request) throws Exception {
		return "/admin/mng/list.tiles-a";
	}
}
