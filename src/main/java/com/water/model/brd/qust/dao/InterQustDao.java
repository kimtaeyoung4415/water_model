package com.water.model.brd.qust.dao;

import java.util.List;
import java.util.Map;

public interface InterQustDao {

	// 목록
	List<Map<String, Object>> selectQustList() throws Exception;
	
	// 목록 카운트
	int selectQustListCnt() throws Exception;
	
	// 수정 액션
	int updateQust(Map<String, Object> param) throws Exception;

	// 등록 액션
	int insertQust(Map<String, Object> param) throws Exception;

	// 상세
	Map<String, Object> selectQustDtl(int Q_NUM) throws Exception;

	// 비밀번호 검사
	int selectQustPwdCheck(Map<String, Object> param) throws Exception;

	// 삭제 액션
	int deleteQust(Map<String, Object> param) throws Exception;

	
}
