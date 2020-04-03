package com.water.model.admin.brd.qna.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AdminQnaDao implements InterAdminQnaDao {

	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	// 목록
	@Override
	public List<Map<String, Object>> selectQnaList() throws Exception {
		return sqlSession.selectList("model.admin.brd.qna.selectQnaList");
	};
	
	// 목록 카운트
	@Override
	public int selectQnaListCnt() throws Exception {
		return sqlSession.selectOne("model.admin.brd.qna.selectQnaListCnt");
	}

	// 상세
	@Override
	public Map<String, Object> selectQnaDtl(int N_NUM) throws Exception {
		return sqlSession.selectOne("model.admin.brd.qna.selectQnaDtl", N_NUM);
	};

	// 조회수 증가
	@Override
	public int updateQnaViewCnt(int N_NUM) throws Exception {
		return sqlSession.update("model.admin.brd.qna.updateQnaViewCnt", N_NUM);		
	}

	// 답변 등록
	@Override
	public int updateQna(Map<String, Object> param) throws Exception {
		return sqlSession.update("model.admin.brd.qna.updateQna", param);
	};
}
