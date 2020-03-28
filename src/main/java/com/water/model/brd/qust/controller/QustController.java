package com.water.model.brd.qust.controller;

import java.util.ArrayList;
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
@RequestMapping(value = "/brd/qust")
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
			mv.setViewName("qust/list.tiles");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}

	// 상세 화면
	@RequestMapping(value = "/dtl.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView dtl(ModelAndView mv, HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {		
		
		try {
			
			Map<String, Object> dtl = qustService.selectQustDtl(param);	
									
			mv.addObject("dtl",dtl);		
			mv.setViewName("qust/dtl");			
			
		} catch (Throwable e) {
			e.printStackTrace();
		}		
		return mv;
	}
	
	// 등록 화면	
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception {		
		return "qust/ins.tiles";
	}		
	
	// 비밀번호 검사 화면
	@RequestMapping(value = "/pwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView pwdCheck(ModelAndView mv, @RequestParam int Q_NUM) throws Exception {				
		mv.addObject("Q_NUM", Q_NUM);
		mv.setViewName("qust/pwdCheck");
		return mv;
	}		
	
	// 비밀번호 검사 이벤트
	@RequestMapping(value = "/getQustPwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public String getQustPwdCheck(ModelAndView mv, @RequestParam Map<String, Object> param) throws Exception {
								
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			
			int status = qustService.selectQustPwdCheck(param);
			String type = (String) param.get("type");
			
			if (status == 0) {		
				// 비밀번호가 일치하지 않을떄
				result.put("result", false);
			} else {				
				// 비밀번호가 일치할때
				
				if ("del".equals(type)) {
					int cnt = qustService.deleteQust(param);
					
					if (cnt == 0) {
						result.put("result", false);
					} else {
						result.put("result", true);
					}
					result.put("type", type);
					
				} else {
					result.put("result", true);
					result.put("type", type);
				}
				
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	// 등록 액션
	@RequestMapping(value = "/postQustIns.do", method={RequestMethod.POST},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String postQustIns(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qustService.insertQust(param);
			
			if (cnt == 1) {
				result.put("RESULT", true);
			} else {
				result.put("RESULT", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	// 수정 이벤트
	@RequestMapping(value = "/putQustUpdt.do", method={RequestMethod.POST},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> putQustUpdt(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qustService.updateQust(param);
			
			if (cnt == 0) {
				result.put("RESULT", true);
			} else {
				result.put("RESULT", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
		
	// 삭제 이벤트
	@RequestMapping(value = "/deleteQust.do", method={RequestMethod.POST},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> deleteQust(HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = qustService.delteQust(param);
			
			if (cnt == 0) {
				result.put("RESULT", true);
			} else {
				result.put("RESULT", false);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// 임의 데이터
	public List<Map<String, Object>> dummyData(){
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> result = new HashMap<String, Object>();
		
		for (int i = 0; i < 10; i++) {
			result = new HashMap<String, Object>();
			
			result.put("no", i);
			result.put("q_username", "홍길동");			
			result.put("q_mobile", "010-3"+i+"98-7"+i+"5"+i+"");
			result.put("q_email", "example"+i+"@water.info");
			result.put("q_title", i+"번째 테스트 입니다.");
			result.put("q_cont", i+"번째 테스트 입니다. ABCDEFGHIJKLMNOPQRSTUVWXYZ 가나다라마바사아자차카타파하.");
			result.put("q_regdate", "2020-03-0"+(i+1));
			result.put("view_cnt", 45+i);
			result.put("q_pwd", "1231");
			
			if (i == 4) {
				result.put("q_updtdate", "2020-04-0"+(i+1));
				result.put("a_username", "관리자");
				result.put("a_cont", i+"번째 답변 테스트 입니다.");
				result.put("a_updtdate", "2020-04-0"+(i+1));
			}
			
			if (i == 7) {
				result.put("q_updtdate", "2020-05-0"+(i+1));
				result.put("a_username", "관리자");
				result.put("a_cont", i+"번째 답변 테스트 입니다.");
				result.put("a_updtdate", "2020-04-0"+(i+1));
			}
			
			if (i == 8) {
				result.put("q_updtdate", "2020-06-0"+(i+1));
				result.put("a_username", "관리자");
				result.put("a_cont", i+"번째 답변 테스트 입니다.");
				result.put("a_updtdate", "2020-04-0"+(i+1));
			}
			
			list.add(result);
		}	
		
		return list;
	}
}
