package com.water.model.admin.brd.qna.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.water.model.admin.brd.qna.service.InterAdminQnaService;

@Controller
@RequestMapping(value = "/admin/qna")
public class AdminQnaController {

	private static final Logger logger = LoggerFactory.getLogger(AdminQnaController.class);
	
	@Autowired
	private InterAdminQnaService adminQnaService;
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv) throws Exception {				
		
		try {
			// 목록
			List<Map<String, Object>> list = adminQnaService.selectQnaList();		
			
			// 목록 카운트
			int count = adminQnaService.selectQnaListCnt();
			
			mv.addObject("list",list);
			mv.addObject("list_count",count);
			mv.setViewName("admin/qna/list.tiles");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 상세 화면	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv, @RequestParam int q) throws Exception {	
		
		int N_NUM = q;
		
		Map<String, Object> dtl = adminQnaService.selectQnaDtl(N_NUM);	
		
		mv.addObject("dtl",dtl);		
		mv.setViewName("admin/qna/dtl.tiles");
		
		return mv;
	}	
	
	// 수정 액션
	@RequestMapping(value = "/putQnaUpdt.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> putQnaUpdt(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int cnt = adminQnaService.updateQna(param);
			
			if (cnt == 0) {
				result.put("SUCCESS", false);
			} else {
				result.put("SUCCESS", true);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
