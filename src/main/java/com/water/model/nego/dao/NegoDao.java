package com.water.model.nego.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NegoDao implements InterNegoDao{
	
	
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	
	// 목록
	@Override
	public List<Map<String, Object>> selectNegoList() throws Exception {
		return sqlSession.selectList("web.nego.selectNegoList");
	};
	
	// 목록 카운트
	@Override
	public int selectNegoListCnt() throws Exception {
		return sqlSession.selectOne("web.nego.selectNegoListCnt");
	};
	
	// 조회수 증가
	@Override
	public int updateNegoViewCnt(int C_NUM) throws Exception {
		return sqlSession.update("web.nego", C_NUM);		
	};

	// 상세
	@Override
	public Map<String, Object> selectNegoDtl(int C_NUM) throws Exception {
		return sqlSession.selectOne("web.nego.selectNegoDtl", C_NUM);
	};
	
	// 비밀번호 검사
	@Override
	public int selectNegoPwdCheck(Map<String, Object> param) {
		return sqlSession.selectOne("web.nego.selectNegoPwdCheck", param);
	};
	
	// 수정
	@Override
	public int updateNego(Map<String, Object> param) throws Exception {
		return sqlSession.update("web.nego.updateNego", param);
	};

	// 등록
	@Override
	public int insertNego(Map<String, Object> param) throws Exception {		
		return sqlSession.insert("web.nego.insertNego", param);
	};

	// 삭제
	@Override
	public int deleteNego(Map<String, Object> param) throws Exception {
		return sqlSession.delete("web.nego.deleteNego", param);
	}

	
}
