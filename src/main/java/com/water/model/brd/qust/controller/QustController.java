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
	
	// Qust 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv, @RequestParam Map<String, Object> param) {
				
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		try {
						
			//List<Map<String, Object>> list = qustService.getQustList(param);						
			//int count = qustService.getQustListCnt(param);
					
			// ** dummy data =====================================================				
			list = this.dummyData();
			
			int count = list.size();			
			// ** dummy data //// ================================================
						
			mv.addObject("list",list);
			mv.addObject("list_count",count);
			mv.setViewName("qust/list");
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}

	// Qust 상세 화면	
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView dtl(ModelAndView mv, @RequestParam int no) {
		
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> dtl = new HashMap<String, Object>();	
		
		try {
			
			// Map<String, Object> dtl = qustService.getQustDtl(param);	
			
			// ** dummy data =====================================================				
			list = this.dummyData();		
			
			dtl = list.get(no);
			// ** dummy data //// ================================================
									
			mv.addObject("dtl",dtl);		
			mv.setViewName("qust/dtl");			
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		return mv;
	}
	
	// Qust 등록 화면	
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins() {
		return "qust/ins";
	}		
	
	// Qust 수정, 삭제 비밀번호 체크 화면
	@RequestMapping(value = "/pwdCheck.do", method = RequestMethod.GET)
	public String pwdCheck() {
		return "qust/pwdCheck";
	}		
	
	// Qust 비밀번호 체크 액션
	@RequestMapping(value = "/getQustPwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView getQustPwdCheck(ModelAndView mv, @RequestParam Map<String, Object> param, HttpServletRequest request) {
						
		Map<String, Object> result = new HashMap<String, Object>();	
		
		try {
			String fk_seq = request.getParameter("no");
			// 해당 글 번호와 비밀번호 가져오기 (param)
			// result = qustService.getPwdCheck(param);						
			if (!result.isEmpty()) {
				mv.addObject("result",result);		
				mv.setViewName("Qust/dtl");	
			} else {
				String msg = "비밀번호가 일치하지 않습니다.";
				String loc = "/brd/Qust/pwdCheck.do";
				
				mv.addObject("msg", msg);
				mv.addObject("loc", loc);
				
				mv.setViewName("error/msg");
			}
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return mv;
	}
	
	// 질문 등록 액션	
	@RequestMapping(value = "/postQustIns.do", method={RequestMethod.POST},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String postQustIns(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			//int cnt = qustService.insertQust(param);
			int cnt = 1;
			
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
	
	// 질문 수정 이벤트
	@RequestMapping(value = "/putQustUpdt.do", method={RequestMethod.POST},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> putQustUpdt(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		
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
		
	// 질문 삭제 이벤트
	@RequestMapping(value = "/deleteQust.do", method={RequestMethod.POST},produces="text/plain;charset=UTF-8")
	@ResponseBody
	public Map<String, Object> deleteQust(HttpServletRequest request, @RequestParam Map<String, Object> param) {
		
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
			result.put("q_cont", i+"번째 테스트 입니다. ABCDEFGHIJKLMNOPQRSTUVWXYZ가나다라마바사아자차타파하");
			result.put("q_regdate", "2020-03-0"+(i+1));
			result.put("view_cnt", 45+i);
			result.put("q_pwd", "1231");
			
			if (i == 4) {
				result.put("q_updtdate", "2020-04-0"+(i+1));
				result.put("a_username", "관리자");
				result.put("a_cont", "첫번째 답변완료");
				result.put("a_updtdate", "2020-04-0"+(i+1));
			}
			
			if (i == 7) {
				result.put("q_updtdate", "2020-05-0"+(i+1));
				result.put("a_username", "관리자");
				result.put("a_cont", "두번째 답변완료");
				result.put("a_updtdate", "2020-04-0"+(i+1));
			}
			
			if (i == 8) {
				result.put("q_updtdate", "2020-06-0"+(i+1));
				result.put("a_username", "관리자");
				result.put("a_cont", "세번째 답변완료");
				result.put("a_updtdate", "2020-04-0"+(i+1));
			}
			
			list.add(result);
		}	
		
		return list;
	}
}
