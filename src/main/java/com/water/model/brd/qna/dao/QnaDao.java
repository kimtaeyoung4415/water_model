package com.water.model.brd.qna.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QnaDao implements InterQnaDao {


	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	// 목록
	@Override
	public List<Map<String, Object>> selectQnaList() throws Exception {
		return sqlSession.selectList("model.brd.qna.selectQnaList");
	};
	
	// 목록 카운트
	@Override
	public int selectQnaListCnt() throws Exception {
		return sqlSession.selectOne("model.brd.qna.selectQnaListCnt");
	};
	
	// 조회수 증가
	@Override
	public int updateQnaViewCnt(int Q_NUM) throws Exception {
		return sqlSession.update("model.brd.qna.updateQnaViewCnt", Q_NUM);		
	};

	// 상세
	@Override
	public Map<String, Object> selectQnaDtl(int Q_NUM) throws Exception {
		return sqlSession.selectOne("model.brd.qna.selectQnaDtl", Q_NUM);
	};
	
	// 비밀번호 검사
	@Override
	public int selectQnaPwdCheck(Map<String, Object> param) {
		return sqlSession.selectOne("model.brd.qna.selectQnaPwdCheck", param);
	};
	
	// 수정
	@Override
	public int updateQna(Map<String, Object> param) throws Exception {
		return sqlSession.update("model.brd.qna.updateQna", param);
	};

	// 등록
	@Override
	public int insertQna(Map<String, Object> param) throws Exception {		
		return sqlSession.insert("model.brd.qna.insertQna", param);
	};

	// 삭제
	@Override
	public int deleteQna(Map<String, Object> param) throws Exception {
		return sqlSession.delete("model.brd.qna.deleteQna", param);
	}


}
