package com.water.model.admin.login.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.water.model.admin.login.dao.InterAdminLoginDao;

@Service("AdminLoginService")
public class AdminLoginService implements InterAdminLoginService {

	public InterAdminLoginDao adminLoginDao;
	
	// 로그인
	@Override
	public int selectAdminLogin(Map<String, Object> param) throws Exception {
		return adminLoginDao.selectAdminLogin(param);
	}

	// 아이디 체크
	@Override
	public String selectAdminIdCheck(Map<String, Object> param) {
		return adminLoginDao.selectAdminIdCheck(param);
	}

}
