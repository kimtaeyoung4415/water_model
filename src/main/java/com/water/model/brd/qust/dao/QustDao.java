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
	};
	
	// 목록 카운트
	@Override
	public int selectQustListCnt() throws Exception {
		return sqlSession.selectOne("model.brd.qust.selectQustListCnt");
	};
	
	// 조회수 증가
	@Override
	public int updateQustViewCnt(int Q_NUM) throws Exception {
		return sqlSession.update("model.brd.qust.updateQustViewCnt", Q_NUM);		
	};

	// 상세
	@Override
	public Map<String, Object> selectQustDtl(int Q_NUM) throws Exception {
		return sqlSession.selectOne("model.brd.qust.selectQustDtl", Q_NUM);
	};
	
	// 비밀번호 검사
	@Override
	public int selectQustPwdCheck(Map<String, Object> param) {
		return sqlSession.selectOne("model.brd.qust.selectQustPwdCheck", param);
	};
	
	// 수정
	@Override
	public int updateQust(Map<String, Object> param) throws Exception {
		return sqlSession.update("model.brd.qust.updateQust", param);
	};

	// 등록
	@Override
	public int insertQust(Map<String, Object> param) throws Exception {		
		return sqlSession.insert("model.brd.qust.insertQust", param);
	};

	// 삭제
	@Override
	public int deleteQust(Map<String, Object> param) throws Exception {
		return sqlSession.delete("model.brd.qust.deleteQust", param);
	}


}
