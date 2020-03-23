package com.water.model.example.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

@Repository
public class ExampleDao implements InterExampleDao {
/*
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
*/	
	@Override
	public Map<String, Object> getUserInfo(Map<String, Object> param) {		
		//return sqlsession.selectOne("water.model.example.getUserInfo", param);
		return null;
	}

}
