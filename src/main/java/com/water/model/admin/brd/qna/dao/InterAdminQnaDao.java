package com.water.model.admin.brd.qna.dao;

import java.util.List;
import java.util.Map;

public interface InterAdminQnaDao {

	// 목록
	List<Map<String, Object>> selectQnaList() throws Exception;
	
	// 목록 카운트
	int selectQnaListCnt() throws Exception;
	
	// 상세
	Map<String, Object> selectQnaDtl(int N_NUM) throws Exception;

	// 조회수 증가
	int updateQnaViewCnt(int N_NUM) throws Exception;

	// 답변 등록
	int updateQna(Map<String, Object> param) throws Exception;

}
