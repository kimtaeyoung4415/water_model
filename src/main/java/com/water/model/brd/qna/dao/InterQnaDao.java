package com.water.model.brd.qna.dao;

import java.util.List;
import java.util.Map;

public interface InterQnaDao {

	// 목록
	List<Map<String, Object>> selectQnaList() throws Exception;
	
	// 목록 카운트
	int selectQnaListCnt() throws Exception;
	
	// 조회수 증가
	int updateQnaViewCnt(int Q_NUM) throws Exception;
	
	// 수정 액션
	int updateQna(Map<String, Object> param) throws Exception;

	// 등록 액션
	int insertQna(Map<String, Object> param) throws Exception;

	// 상세
	Map<String, Object> selectQnaDtl(int Q_NUM) throws Exception;

	// 비밀번호 검사
	int selectQnaPwdCheck(Map<String, Object> param) throws Exception;

	// 삭제 액션
	int deleteQna(Map<String, Object> param) throws Exception;

}
