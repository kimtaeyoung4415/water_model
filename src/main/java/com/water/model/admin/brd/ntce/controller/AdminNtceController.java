package com.water.model.admin.brd.ntce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.water.model.admin.brd.ntce.service.InterAdminNtceService;

@Controller
@RequestMapping(value = "/admin/ntce")
public class AdminNtceController {

	private static final Logger logger = LoggerFactory.getLogger(AdminNtceController.class);
	
	@Autowired
	private InterAdminNtceService adminNtceService;
	
	
}
