package com.water.model.brd.ntce.dao;

import java.util.List;
import java.util.Map;

public interface InterNtceDao {

	// 목록
	List<Map<String, Object>> selectNtceList() throws Exception;

	// 목록 카운트
	int selectNtceListCnt() throws Exception;

	// 상세
	Map<String, Object> selectNtceDtl(int N_NUM) throws Exception;

	// 조회수 증가
	int updateNtceViewCnt(int N_NUM) throws Exception;

}
