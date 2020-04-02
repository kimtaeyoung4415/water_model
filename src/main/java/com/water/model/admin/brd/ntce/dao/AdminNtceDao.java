package com.water.model.admin.brd.ntce.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminNtceDao implements InterAdminNtceDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	
}
