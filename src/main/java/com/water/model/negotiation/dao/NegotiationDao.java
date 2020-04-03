package com.water.model.negotiation.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NegotiationDao implements InterNegotiationDao{
	
	
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	// 목록
	@Override
	public List<Map<String, Object>> selectNegotiationList() throws Exception {
		return sqlSession.selectList("model.brd.Negotiation.selectNegotiationList");
	};
	
	// 목록 카운트
	@Override
	public int selectNegotiationListCnt() throws Exception {
		return sqlSession.selectOne("model.brd.Negotiation.selectNegotiationListCnt");
	};
	
	// 조회수 증가
	@Override
	public int updateNegotiationViewCnt(int C_NUM) throws Exception {
		return sqlSession.update("model.brd.Negotiation.updateNegotiationViewCnt", C_NUM);		
	};

	// 상세
	@Override
	public Map<String, Object> selectNegotiationDetail(int C_NUM) throws Exception {
		return sqlSession.selectOne("model.brd.Negotiation.selectNegotiationDtl", C_NUM);
	};
	
	// 비밀번호 검사
	@Override
	public int selectNegotiationPwdCheck(Map<String, Object> param) {
		return sqlSession.selectOne("model.brd.Negotiation.selectNegotiationPwdCheck", param);
	};
	
	// 수정
	@Override
	public int updateNegotiation(Map<String, Object> param) throws Exception {
		return sqlSession.update("model.brd.Negotiation.updateNegotiation", param);
	};

	// 등록
	@Override
	public int insertNegotiation(Map<String, Object> param) throws Exception {		
		return sqlSession.insert("model.brd.Negotiation.insertNegotiation", param);
	};

	// 삭제
	@Override
	public int deleteNegotiation(Map<String, Object> param) throws Exception {
		return sqlSession.delete("model.brd.Negotiation.deleteNegotiation", param);
	}

	
}
