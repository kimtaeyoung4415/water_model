package com.water.model.brd.qust.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class QustDao implements InterQustDao {

	/*
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	 */	
	
	// 목록 카운트
	public int getQustListCnt(Map<String, Object> param) {
		// return sqlSession.selectOne("model.brd.qust.selectQustListCnt", param);
		return 0;
	}
	
	// 목록
	public List<Map<String, Object>> getQustList(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.selectQustList", param);
		return null;
	}	
	
	// 상세
	public Map<String, Object> getQustDtl(Map<String, Object> param) {
		/*
		Map<String, Object> result = sqlSession.selectList("model.brd.qust.selectQustDtl", param);
		
		// 조회수 증가
		if (result != null && !result.isEmpty()) {
			sqlSession.update("model.brd.qust.updateQustViewCnt");
		}
		
		return result;
		*/
		return null;
	}

	// 등록
	public int insQust(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.insertQust", param);
		return 0;
	}
	
	// 수정
	@Override
	public int updateQust(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.updateQust", param);
		return 0;
	}

	// 삭제
	@Override
	public int deletQust(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.deleteQust", param);
		return 0;
	}
}
