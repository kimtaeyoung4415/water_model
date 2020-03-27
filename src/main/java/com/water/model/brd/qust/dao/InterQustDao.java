package com.water.model.brd.qust.dao;

import java.util.List;
import java.util.Map;

public interface InterQustDao {

	// 목록
	List<Map<String, Object>> selectQustList() throws Exception;
	
	// 목록 카운트
	int selectQustListCnt();
	
	// 수정 액션
	int updateQust(Map<String, Object> param);

	// 삭제 액션
	int deletQust(Map<String, Object> param);

	// 등록 액션
	int insertQust(Map<String, Object> param);

	// 상세
	Map<String, Object> selectQustDtl(int no);

	

	

	
	
}
