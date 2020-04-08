package com.water.model.admin.brd.ntce.controller;

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

import com.water.model.admin.brd.ntce.service.InterAdminNtceService;
import com.water.model.util.GetDate;

@Controller
@RequestMapping(value = "/admin/ntce")
public class AdminNtceController {

	private static final Logger logger = LoggerFactory.getLogger(AdminNtceController.class);
	
	@Autowired
	private InterAdminNtceService adminNtceService;
	
	@Autowired
	private GetDate getDate;
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv) throws Exception {				
		
		try {
			
			// 현재 시간
			String now = getDate.getCurrentTime();
			
			// 목록
			List<Map<String, Object>> list = adminNtceService.selectAdminNtceList();		
			
			// 목록 카운트
			int count = adminNtceService.selectAdminNtceListCnt();
			
			mv.addObject("list",list);
			mv.addObject("list_count",count);
			mv.addObject("now",now);
			mv.setViewName("admin/ntce/list.tiles");
				
			} catch (Throwable e) {
				e.printStackTrace();
			}
		return mv;
	}
	
	// 등록 화면	
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception {		
		return "admin/ntce/ins.tiles";
	}	
	
	// 상세 화면	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv, @RequestParam int n) throws Exception {	
		
		int N_NUM = n;		
		
		Map<String, Object> dtl = adminNtceService.selectAdminNtceDtl(N_NUM);	
		
		if (dtl == null) {
			String msg = "존재하지 않은 게시물입니다.";
			String loc = "javascript:history.back()";
			
			mv.addObject("msg", msg);
			mv.addObject("loc", loc);
			
			mv.setViewName("msg/error");
		} else {
			// 현재 시간
			String now = getDate.getCurrentTime();		
			
			mv.addObject("dtl",dtl);		
			mv.addObject("now",now);
			mv.setViewName("admin/ntce/dtl.tiles");
		}
		
		return mv;
	}	

	// 등록 액션
	@RequestMapping(value = "/postAdminNtceIns.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> postAdminNtceIns(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = adminNtceService.insertAdminNtce(param);
			
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

	// 수정
	@RequestMapping(value = "/edit.do", method={RequestMethod.POST, RequestMethod.GET},produces="application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView edit(ModelAndView mv, @RequestParam int N_NUM) throws Exception {		
		
		try {			
			
			Map<String, Object> dtl = adminNtceService.selectAdminNtceDtl(N_NUM);	
			
			if (dtl == null) {
				String msg = "존재하지 않은 게시물입니다.";
				String loc = "javascript:history.back()";
				
				mv.addObject("msg", msg);
				mv.addObject("loc", loc);
				
				mv.setViewName("msg/error");
			} else {
			
				mv.addObject("dtl",dtl);		
				mv.setViewName("admin/ntce/edit");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 수정 액션
	@RequestMapping(value = "/putAdminNtceUpdt.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> putQnaUpdt(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int cnt = adminNtceService.updateAdminNtce(param);
			
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
	
	// 삭제 이벤트
	@RequestMapping(value = "/deleteAdminNtce.do", method={RequestMethod.POST,RequestMethod.GET},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> deleteAdminNtce(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = adminNtceService.deleteAdminNtce(param);
			
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
