package com.water.model.brd.ntce.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.water.model.brd.ntce.service.InterNtceService;

@Controller
@RequestMapping(value = "/ntce")
public class NtceController {

	private static final Logger logger = LoggerFactory.getLogger(NtceController.class);
	
	@Autowired
	private InterNtceService ntceService;
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv) throws Exception {				
		
		try {
			// 목록
			List<Map<String, Object>> list = ntceService.selectNtceList();		
			
			// 목록 카운트
			int count = ntceService.selectNtceListCnt();
			
			mv.addObject("list",list);
			mv.addObject("list_count",count);
			mv.setViewName("web/ntce/list.tiles");
				
			} catch (Throwable e) {
				e.printStackTrace();
			}
			return mv;
		}
	
	// 상세 화면	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv, @RequestParam int n) throws Exception {	
		
		int N_NUM = n;
		
		Map<String, Object> dtl = ntceService.selectNtceDtl(N_NUM);	
		
		mv.addObject("dtl",dtl);		
		mv.setViewName("web/ntce/dtl.tiles");
		
		return mv;
	}	
}
