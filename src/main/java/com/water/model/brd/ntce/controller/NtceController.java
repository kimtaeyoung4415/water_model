package com.water.model.brd.ntce.controller;

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

import com.water.model.brd.ntce.service.InterNtceService;
import com.water.model.util.CommonUtil;

@Controller
@RequestMapping(value = "/ntce")
public class NtceController {

	private static final Logger logger = LoggerFactory.getLogger(NtceController.class);
	
	@Autowired
	private InterNtceService ntceService;
	
	@Autowired
	private CommonUtil commonUtil;
	
	// 목록 화면
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv, HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception {				
		
		try {
			
			// 페이징 처리 ==================================================
			
			int perPage = 15;	// 페이지당 보여줄 게시물 수
			int perBar  = 5;	// 페이징 블럭에 보여질 수     ex) 5 >> | 1 | 2 | 3 | 4 | 5 | 
			int totalCount = ntceService.selectNtceListCnt();	// 총게시물 건수
			
			// 넘어온 데이터가 없는경우 ex) list.do? ... < GET 방식에 넘어온 데이터가 없는 초기 페이지
			if (param.get("showPage") == null) {
				param.put("showPage", 0);
				param.put("perBar"  , perBar);
				param.put("perPage" , perPage);
				param.put("totalCount", totalCount);
			} else {								
			// 페이지를 선택한 경우
				param.put("p_k", "Y"); // 페이지 선택 여부   p_k >>  page_key
				param.put("showPageNo", (Integer.parseInt((String) param.get("showPage"))) );
				param.put("showPage"  , (Integer.parseInt((String) param.get("showPage")) - 1 ) * (Integer.parseInt((String) param.get("perPage"))));
				param.put("perBar" , perBar);
				param.put("perPage", perPage);
				param.put("totalCount", totalCount);
			}
			
			// 페이지바 만들기
			mv.addObject("pagination", commonUtil.pagination(param, request));
			
			// ==========================================================	
			
			// 현재 시간
			String now = commonUtil.getCurrentTime();
			
			// 목록
			List<Map<String, Object>> list = ntceService.selectNtceList(param);		
			
			mv.addObject("list",list);
			mv.addObject("list_count",totalCount);
			mv.addObject("now",now);
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
		
		if (dtl == null) {
			
			// url에서 존재하지 않는 게시물 번호를 입력한경우
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
			mv.setViewName("web/ntce/dtl.tiles");
		}
		
		return mv;
	}	
}
