package com.water.model.example.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleDao implements InterExampleDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	// 임시 외부서버 테스트용
	@Resource(name = "sqlSession_wi")
	private SqlSessionTemplate sqlSession_wi;

	
	@Override
	public List<Map<String, Object>> getUserList() {
		return sqlSession.selectList("water.model.example.getUserList");
	}

	// 현재시간
	@Override
	public String getNow() {
		return sqlSession_wi.selectOne("model.example.getNow");
	}

}
