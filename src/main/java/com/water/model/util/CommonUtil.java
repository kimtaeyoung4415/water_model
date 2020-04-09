package com.water.model.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("CommonUtil")
public class CommonUtil {
	
	// 현재 시간
	public String getCurrentTime(){	
		SimpleDateFormat dateformat = new SimpleDateFormat ("yyyy-MM-dd");
		Date time = new Date();
		String now = dateformat.format(time);
		
		return now;
	}
	
	// 페이징 액션
	public String pagination(
			String url, 
			int showPage, 
			int perPage, 
			int totalPage,
			int perBar ) {
		
		String pageBar = "";
		
		String lastStr = url.substring(url.length()-1);
		
		if (!"?".equals(lastStr)) {
			url += "?";
		}
		
		// perBar 반복용
		int loop = 1; 
		
		// 
		int pageNo = (( showPage - 1 ) / perBar) * perBar + 1 ;
		
		while (!( loop > perBar || pageNo > totalPage ) ) {
			if (pageNo == showPage) {
				pageBar += "&nbsp;<span>"+pageNo+"</span>&nbsp;";
			} else {
				pageBar += "&nbsp;<a href='"+url+"&showPage="+pageNo+"&perPage="+perPage+"'>"+pageNo+"</a>&nbsp;";
			}
			loop++;
			pageNo++;
		}
		
		return pageBar;
	}
}
