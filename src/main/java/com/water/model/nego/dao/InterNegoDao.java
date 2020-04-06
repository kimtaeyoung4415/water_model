package com.water.model.nego.dao;

import java.util.List;
import java.util.Map;

public interface InterNegoDao {
	// 목록
		List<Map<String, Object>> selectNegotiationList() throws Exception;
		
		// 목록 카운트
		int selectNegotiationListCnt() throws Exception;
		
		// 조회수 증가
		int updateNegotiationViewCnt(int C_NUM) throws Exception;
		
		// 수정 액션
		int updateNegotiation(Map<String, Object> param) throws Exception;

		// 등록 액션
		int insertNegotiation(Map<String, Object> param) throws Exception;

		// 상세
		Map<String, Object> selectNegotiationDetail(int C_NUM) throws Exception;

		// 비밀번호 검사
		int selectNegotiationPwdCheck(Map<String, Object> param) throws Exception;

		// 삭제 액션
		int deleteNegotiation(Map<String, Object> param) throws Exception;
}
