package com.water.model.nego.dao;

import java.util.List;
import java.util.Map;

public interface InterNegoDao {
	// 목록
		List<Map<String, Object>> selectNegoList() throws Exception;
		
		// 목록 카운트
		int selectNegoListCnt() throws Exception;
		
		// 조회수 증가
		int updateNegoViewCnt(int C_NUM) throws Exception;
		
		// 수정 액션
		int updateNego(Map<String, Object> param) throws Exception;

		// 등록 액션
		int insertNego(Map<String, Object> param) throws Exception;

		// 상세
		Map<String, Object> selectNegoDtl(int C_NUM) throws Exception;

		// 비밀번호 검사
		int selectNegoPwdCheck(Map<String, Object> param) throws Exception;

		// 삭제 액션
		int deleteNego(Map<String, Object> param) throws Exception;
}
