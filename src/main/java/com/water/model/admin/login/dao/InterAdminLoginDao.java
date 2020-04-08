package com.water.model.admin.login.dao;

import java.util.Map;

public interface InterAdminLoginDao {

	// 로그인
	int selectAdminLogin(Map<String, Object> param) throws Exception;

}
