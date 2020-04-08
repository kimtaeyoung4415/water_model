package com.water.model.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service("GetDate")
public class GetDate {

	private static final Logger logger = LoggerFactory.getLogger(GetDate.class);
	
	// 현재 시간
	public String getCurrentTime(){	
		SimpleDateFormat dateformat = new SimpleDateFormat ("yyyy-MM-dd");
		Date time = new Date();
		String now = dateformat.format(time);
		
		return now;
	}
	
}
