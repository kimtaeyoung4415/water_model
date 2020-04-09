package com.water.model.admin.brd.ntce.dao;

import java.util.List;
import java.util.Map;

public interface InterAdminNtceDao {

	// 목록
	List<Map<String, Object>> selectAdminNtceList(Map<String, Object> param) throws Exception;

	// 목록 카운트
	int selectAdminNtceListCnt() throws Exception;

	// 상세
	Map<String, Object> selectAdminNtceDtl(int N_NUM) throws Exception;

	// 등록
	int insertAdminNtce(Map<String, Object> param) throws Exception;

	// 조회수 증가
	int updateAdminNtceViewCnt(int N_NUM) throws Exception;

	// 수정
	int updateAdminNtce(Map<String, Object> param) throws Exception;
		
	// 삭제
	int deleteAdminNtce(Map<String, Object> param) throws Exception;

}
