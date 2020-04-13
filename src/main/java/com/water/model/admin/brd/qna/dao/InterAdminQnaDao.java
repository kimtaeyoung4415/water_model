package com.water.model.admin.brd.qna.dao;

import java.util.List;
import java.util.Map;

public interface InterAdminQnaDao {

	// 목록
	List<Map<String, Object>> selectAdminQnaList(Map<String, Object> param) throws Exception;
	
	// 목록 카운트
	int selectAdminQnaListCnt() throws Exception;
	
	// 상세
	Map<String, Object> selectAdminQnaDtl(int N_NUM) throws Exception;

	// 조회수 증가
	int updateAdminQnaViewCnt(int N_NUM) throws Exception;

	// 답변 등록
	int updateAdminQna(Map<String, Object> param) throws Exception;

	// 삭제
	int deleteAdminQna(Map<String, Object> param) throws Exception;

}
