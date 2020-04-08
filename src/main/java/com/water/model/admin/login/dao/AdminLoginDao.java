package com.water.model.admin.login.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminLoginDao implements InterAdminLoginDao {


	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	// 아이디 체크
	@Override
	public String selectAdminIdCheck(Map<String, Object> param) throws Exception {
		return sqlSession.selectOne("admin.login.selectAdminIdCheck", param);
	}
	
	// 로그인
	@Override
	public int selectAdminLogin(Map<String, Object> param) throws Exception {
		 return sqlSession.selectOne("admin.login.selectAdminLogin", param);
	}

}
