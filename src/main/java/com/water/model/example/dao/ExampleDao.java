package com.water.model.example.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExampleDao implements InterExampleDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	// 현재시간
	@Override
	public String getNow() {
		return sqlSession.selectOne("model.example.getNow");
	}

}
