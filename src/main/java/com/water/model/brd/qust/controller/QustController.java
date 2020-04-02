package com.water.model.brd.qust.controller;

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

import com.water.model.brd.qust.service.InterQustService;

@Controller
@RequestMapping(value = "/qust")
public class QustController {

	private static final Logger logger = LoggerFactory.getLogger(QustController.class);
	
	@Autowired
	private InterQustService qustService;
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv) throws Exception {				
		
		try {
			// 목록
			List<Map<String, Object>> list = qustService.selectQustList();		
			
			// 목록 카운트
			int count = qustService.selectQustListCnt();
			
			mv.addObject("list",list);
			mv.addObject("list_count",count);
			mv.setViewName("web/qust/list.tiles");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 등록 화면	
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception {		
		return "web/qust/ins.tiles";
	}	
	
	// 상세 화면	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv, @RequestParam int q) throws Exception {	
		
		int Q_NUM = q;
		
		Map<String, Object> dtl = qustService.selectQustDtl(Q_NUM);	
		
		mv.addObject("dtl",dtl);		
		mv.setViewName("web/qust/dtl.tiles");
		
		return mv;
	}	

	// 비밀번호 검사 화면
	@RequestMapping(value = "/pwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView pwdCheck(ModelAndView mv, @RequestParam int Q_NUM) throws Exception {				
		mv.addObject("Q_NUM", Q_NUM);
		mv.setViewName("web/qust/pwdCheck");
		return mv;
	}		
	
	// 수정
	@RequestMapping(value = "/edit.do", method={RequestMethod.POST, RequestMethod.GET},produces="application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView edit(ModelAndView mv, @RequestParam int Q_NUM) throws Exception {		
		
		try {			
			
			Map<String, Object> dtl = qustService.selectQustDtl(Q_NUM);	
			
			mv.addObject("dtl",dtl);		
			mv.setViewName("web/qust/edit");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 비밀번호 검사 이벤트
	@RequestMapping(value = "/getQustPwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getQustPwdCheck(ModelAndView mv, @RequestParam Map<String, Object> param) throws Exception {
								
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int status = qustService.selectQustPwdCheck(param);

			if (status == 0) {
				result.put("SUCCESS", false);
			} else {
				result.put("SUCCESS", true);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 등록 액션
	@RequestMapping(value = "/postQustIns.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> postQustIns(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qustService.insertQust(param);
			
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
	
	// 등록 액션
	@RequestMapping(value = "/putQustUpdt.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> putQustUpdt(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int cnt = qustService.updateQust(param);
			
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
	@RequestMapping(value = "/deleteQust.do", method={RequestMethod.POST,RequestMethod.GET},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> deleteQust(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qustService.deleteQust(param);
			
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
