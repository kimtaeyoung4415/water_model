package com.water.model.brd.qna.controller;

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

import com.water.model.brd.qna.service.InterQnaService;
import com.water.model.util.CommonUtil;

@Controller
@RequestMapping(value = "/qna")
public class QnaController {

	private static final Logger logger = LoggerFactory.getLogger(QnaController.class);
	
	@Autowired
	private InterQnaService qnaService;
	
	@Autowired
	private CommonUtil commonUtil;
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv) throws Exception {				
		
		try {
			
			// 현재 시간
			String now = commonUtil.getCurrentTime();
			
			// 목록
			List<Map<String, Object>> list = qnaService.selectQnaList();		
			
			// 목록 카운트
			int count = qnaService.selectQnaListCnt();
			
			mv.addObject("list",list);
			mv.addObject("list_count",count);
			mv.addObject("now",now);
			mv.setViewName("web/qna/list.tiles");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 등록 화면	
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception {		
		return "web/qna/ins.tiles";
	}	
	
	// 상세 화면	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv, @RequestParam int q) throws Exception {	
		
		int Q_NUM = q;
		
		Map<String, Object> dtl = qnaService.selectQnaDtl(Q_NUM);	
		
		if (dtl == null) {
			String msg = "존재하지 않은 게시물입니다.";
			String loc = "javascript:history.back()";
			
			mv.addObject("msg", msg);
			mv.addObject("loc", loc);
			
			mv.setViewName("msg/error");
		} else {
		
			// 현재 시간
			String now = commonUtil.getCurrentTime();
			
			mv.addObject("dtl",dtl);		
			mv.addObject("now",now);
			mv.setViewName("web/qna/dtl.tiles");
		}
			
		return mv;
	}	

	// 비밀번호 검사 화면
	@RequestMapping(value = "/pwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView pwdCheck(ModelAndView mv, @RequestParam int Q_NUM) throws Exception {				
		mv.addObject("Q_NUM", Q_NUM);
		mv.setViewName("web/qna/pwdCheck");
		return mv;
	}		
	
	// 수정
	@RequestMapping(value = "/edit.do", method={RequestMethod.POST, RequestMethod.GET},produces="application/json;charset=UTF-8")
	@ResponseBody
	public ModelAndView edit(ModelAndView mv, @RequestParam int Q_NUM) throws Exception {		
		
		try {			
			
			Map<String, Object> dtl = qnaService.selectQnaDtl(Q_NUM);	
			
			if (dtl == null) {
				String msg = "존재하지 않은 게시물입니다.";
				String loc = "javascript:history.back()";
				
				mv.addObject("msg", msg);
				mv.addObject("loc", loc);
				
				mv.setViewName("msg/error");
			} else {
			
				mv.addObject("dtl",dtl);		
				mv.setViewName("web/qna/edit");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 비밀번호 검사 이벤트
	@RequestMapping(value = "/getQnaPwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getQnaPwdCheck(ModelAndView mv, @RequestParam Map<String, Object> param) throws Exception {
								
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int status = qnaService.selectQnaPwdCheck(param);

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
	@RequestMapping(value = "/postQnaIns.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> postQnaIns(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qnaService.insertQna(param);
			
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
	
	// 수정 액션
	@RequestMapping(value = "/putQnaUpdt.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> putQnaUpdt(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int cnt = qnaService.updateQna(param);
			
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
	@RequestMapping(value = "/deleteQna.do", method={RequestMethod.POST,RequestMethod.GET},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> deleteQna(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qnaService.deleteQna(param);
			
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
