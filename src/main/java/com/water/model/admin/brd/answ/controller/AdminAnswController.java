package com.water.model.admin.brd.answ.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.water.model.admin.brd.answ.service.InterAdminAnswService;

@Controller
@RequestMapping(value = "/admin/ntce")
public class AdminAnswController {

	private static final Logger logger = LoggerFactory.getLogger(AdminAnswController.class);
	
	@Autowired
	private InterAdminAnswService adminAnswService;
	
	
}
