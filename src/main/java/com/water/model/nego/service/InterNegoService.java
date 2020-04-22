package com.water.model.nego.service;

import java.util.List;
import java.util.Map;

public interface InterNegoService {

	List<Map<String, Object>> selectNegoList() throws Exception;
	

	int selectNegoListCnt() throws Exception;
	

	Map<String, Object> selectNegoDtl(int C_NUM) throws Exception;
	

	int selectNegoPwdCheck(Map<String, Object> param) throws Exception;
	

	int updateNego(Map<String, Object> param) throws Exception;


	int insertNego(Map<String, Object> param) throws Exception;


	int deleteNego(Map<String, Object> param) throws Exception;

	

	

}
