package com.water.model.admin.login.dao;

import java.util.Map;

public interface InterAdminLoginDao {

	// 아이디 체크
	String selectAdminIdCheck(Map<String, Object> param) throws Exception;
	
	// 로그인
	int selectAdminLogin(Map<String, Object> param) throws Exception;

}
