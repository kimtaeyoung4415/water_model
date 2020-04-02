package com.water.model.admin.brd.answ.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminAnswDao implements InterAdminAnswDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
}
