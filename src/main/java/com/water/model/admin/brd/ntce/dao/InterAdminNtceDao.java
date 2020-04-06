package com.water.model.admin.brd.ntce.dao;

import java.util.List;
import java.util.Map;

public interface InterAdminNtceDao {

	// 목록
	List<Map<String, Object>> selectAdminNtceList() throws Exception;

	// 목록 카운트
	int selectAdminNtceListCnt() throws Exception;

	// 상세
	Map<String, Object> selectAdminNtceDtl(int N_NUM) throws Exception;

	// 등록
	int insertAdminNtce(Map<String, Object> param);

}
