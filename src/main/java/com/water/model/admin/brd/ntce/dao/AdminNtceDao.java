package com.water.model.admin.brd.ntce.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminNtceDao implements InterAdminNtceDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	// 목록
	@Override
	public List<Map<String, Object>> selectAdminNtceList() throws Exception {
		return sqlSession.selectList("admin.brd.ntce.selectAdminNtceList");
	}

	// 목록 카운트
	@Override
	public int selectAdminNtceListCnt() throws Exception {
		return sqlSession.selectOne("admin.brd.ntce.selectAdminNtceListCnt");
	}

	// 
	@Override
	public Map<String, Object> selectAdminNtceDtl(int N_NUM) throws Exception {
		return sqlSession.selectOne("admin.brd.ntce.selectAdminNtceDtl", N_NUM);
	}

	@Override
	public int insertAdminNtce(Map<String, Object> param) {
		return sqlSession.insert("admin.brd.ntce.insertAdminNtce", param);
	}

	
}
