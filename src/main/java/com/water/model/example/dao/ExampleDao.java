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


	@Override
	public List<Map<String, Object>> getUserList() {
		return sqlSession.selectList("water.model.example.getUserList");
	}

}
