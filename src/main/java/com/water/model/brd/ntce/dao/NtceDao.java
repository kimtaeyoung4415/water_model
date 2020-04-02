package com.water.model.brd.ntce.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NtceDao implements InterNtceDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	
}
