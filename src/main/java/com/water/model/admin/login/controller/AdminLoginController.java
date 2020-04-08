package com.water.model.admin.login.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.water.model.admin.login.service.InterAdminLoginService;

@Controller
@RequestMapping(value = "/admin")
public class AdminLoginController {

	private static final Logger logger = LoggerFactory.getLogger(AdminLoginController.class);
	
	@Autowired
	private InterAdminLoginService adminLoginService;
	
	// 로그인 화면	
	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public String ins() throws Exception {		
		return "admin/login/login.tiles-n";
	}	

	// 로그인 액션
	@RequestMapping(value = "/getAdminLogin.do", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> getAdminLogin(@RequestParam Map<String, Object> param) throws Exception {				
		
		Map<String, Object> result = new HashMap<String, Object>();
		
		try {
	
			// 존재하는 아이디인지 체크
			String result_id = adminLoginService.selectAdminIdCheck(param);
			
			String AD_ID = param.get("AD_ID").toString();
			
			if (AD_ID.equals(result_id)) {
				result.put("ERR_CD", "ERR_ID");
				result.put("SUCCESS", false);
			} else {
				
				// 로그인
				int cnt = adminLoginService.selectAdminLogin(param);
				
				if (cnt == 0) {
					result.put("ERR_CD", "ERR_PWD");
					result.put("SUCCESS", false);
				} else {
					result.put("SUCCESS", true);
				}				
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
