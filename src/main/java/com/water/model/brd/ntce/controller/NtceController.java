package com.water.model.brd.ntce.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.water.model.brd.ntce.service.InterNtceService;

@Controller
@RequestMapping(value = "/ntce")
public class NtceController {

	private static final Logger logger = LoggerFactory.getLogger(NtceController.class);
	
	@Autowired
	private InterNtceService ntceService;
	
	
}
