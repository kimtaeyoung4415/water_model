package com.water.model.brd.qust.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QustDao implements InterQustDao {


	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	// 목록
	@Override
	public List<Map<String, Object>> selectQustList() throws Exception {
		return sqlSession.selectList("model.brd.qust.selectQustList");
	}
	
	// 목록 카운트
	@Override
	public int selectQustListCnt() {
		return sqlSession.selectOne("model.brd.qust.selectQustListCnt");
	}

	// 상세
	@Override
	public Map<String, Object> selectQustDtl(int no) {
		
		Map<String, Object> result = sqlSession.selectOne("model.brd.qust.selectQustDtl", no);
		
		if (result != null && !result.isEmpty()) {
			sqlSession.update("model.brd.qust.updateQustViewCnt");
		}
		
		return result;
	}

	
	// ���
	public List<Map<String, Object>> getQustList(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.selectQustList", param);
		return null;
	}	
	
	// ���
	public int insQust(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.insertQust", param);
		return 0;
	}
	
	// ����
	@Override
	public int updateQust(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.updateQust", param);
		return 0;
	}

	// ����
	@Override
	public int deletQust(Map<String, Object> param) {
		// return sqlSession.selectList("model.brd.qust.deleteQust", param);
		return 0;
	}

	// 등록 액션
	@Override
	public int insertQust(Map<String, Object> param) {		
		return sqlSession.insert("model.brd.qust.insertQust", param);
	}



	
}
