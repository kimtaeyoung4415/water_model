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
	public List<Map<String, Object>> selectAdminQnaList() throws Exception {
		return sqlSession.selectList("admin.brd.qna.selectAdminQnaList");
	};
	
	// 목록 카운트
	@Override
	public int selectAdminQnaListCnt() throws Exception {
		return sqlSession.selectOne("admin.brd.qna.selectAdminQnaListCnt");
	}

	// 상세
	@Override
	public Map<String, Object> selectAdminQnaDtl(int N_NUM) throws Exception {
		return sqlSession.selectOne("admin.brd.qna.selectAdminQnaDtl", N_NUM);
	};

	// 조회수 증가
	@Override
	public int updateAdminQnaViewCnt(int N_NUM) throws Exception {
		return sqlSession.update("admin.brd.qna.updateAdminQnaViewCnt", N_NUM);		
	}

	// 답변 등록
	@Override
	public int updateAdminQna(Map<String, Object> param) throws Exception {
		return sqlSession.update("admin.brd.qna.updateAdminQna", param);
	}

	// 삭제
	@Override
	public int deleteAdminQna(Map<String, Object> param) throws Exception {
		return sqlSession.update("admin.brd.qna.deleteAdminQna", param);
	};
}
