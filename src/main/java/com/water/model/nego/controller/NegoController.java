package com.water.model.nego.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.water.model.nego.service.InterNegoService;


@Controller
@RequestMapping(value="/nego")
public class NegoController {
	
	@Autowired
	private InterNegoService negoService;
	
	//상세보기 페이지 이동
	@RequestMapping(value = "/dtl.do", method = RequestMethod.GET)
	public ModelAndView dtl(ModelAndView mv, @RequestParam int q) throws Exception{
		int C_NUM = q;
		
		Map<String, Object> dtl = negoService.selectNegoDtl(C_NUM);
		if (dtl == null) {
			
			// url에서 존재하지 않는 게시물 번호를 입력한경우
			String msg = "존재하지 않은 게시물입니다.";
			String loc = "javascript:history.back()";
			
			mv.addObject("msg", msg);
			mv.addObject("loc", loc);
			
			mv.setViewName("msg/error");
		} else {
		
			mv.addObject("dtl",dtl);		
			mv.setViewName("web/nego/dtl.tiles");
		}

		return mv;
	}
	
	//목록 페이지 이동
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	@ResponseBody
	public ModelAndView list(ModelAndView mv, HttpServletRequest request, @RequestParam Map<String, Object> param) throws Exception{
		int totalCount = negoService.selectNegoListCnt();
		
		List<Map<String, Object>> list = negoService.selectNegoList();
		
		mv.addObject("list", list);
		mv.addObject("list_count", totalCount);
		mv.setViewName("web/nego/list.tiles");
		return mv;
	}
	
	//등록 페이지 이동
	@RequestMapping(value = "/ins.do", method = RequestMethod.GET)
	public String ins(HttpServletRequest request) throws Exception{
		return "web/nego/ins.tiles";
	}
	//등록 액션
	@RequestMapping(value="/postNegoIns.do", method={RequestMethod.POST},produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> postNegoIns(@RequestParam Map<String, Object> param)throws Exception{
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int cnt = negoService.insertNego(param);
			
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
	//비밀번호 검사 화면
	@RequestMapping(value = "/pwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public ModelAndView pwdCheck(ModelAndView mv, @RequestParam int C_NUM) throws Exception {		
		System.out.println(C_NUM);
		mv.addObject("C_NUM", C_NUM);
		mv.setViewName("web/nego/pwdCheck");
		return mv;
	}
	//비밀번호 검사 이벤트
	@RequestMapping(value = "/getNegoPwdCheck.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> getNegoPwdCheck(ModelAndView mv, @RequestParam Map<String, Object> param)throws Exception{
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int status = negoService.selectNegoPwdCheck(param);
			
			if(status == 0) {
				result.put("SUCCESS", false);
			} else {
				result.put("SUCCESS", true);
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//수정 페이지 이동
	@RequestMapping(value="/edit.do" , method = RequestMethod.GET)
	public String edit(HttpServletRequest request)throws Exception{
		return "web/nego/edit.tiles";
	}
	
	//삭제액션
	@RequestMapping(value = "/deleteNego.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String,Object> deleteNego(ModelAndView mv, @RequestParam Map<String, Object> param){
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
			int status = negoService.deleteNego(param);
			
			if(status == 0 ) {
				result.put("SUCCESS", false);
			} else {
				result.put("SUCCESS", true);
			} 
		}catch (Throwable e) {
				e.printStackTrace();
			}
		return result;
	}
}
