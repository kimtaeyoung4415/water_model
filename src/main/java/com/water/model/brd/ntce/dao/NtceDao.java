package com.water.model.brd.ntce.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NtceDao implements InterNtceDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;

	// 목록
	@Override
	public List<Map<String, Object>> selectNtceList()  throws Exception{		
		return sqlSession.selectList("web.brd.ntce.selectNtceList");
	}

	// 목록 카운트
	@Override
	public int selectNtceListCnt()  throws Exception{
		return sqlSession.selectOne("web.brd.ntce.selectNtceListCnt");
	}
	
	// 상세
	@Override
	public Map<String, Object> selectNtceDtl(int N_NUM) throws Exception {
		return sqlSession.selectOne("web.brd.ntce.selectNtceDtl", N_NUM);
	}

	// 조회수 증가
	@Override
	public int updateNtceViewCnt(int N_NUM) throws Exception {
		return sqlSession.update("web.brd.ntce.updateNtceViewCnt", N_NUM);
	}
	
	
}
