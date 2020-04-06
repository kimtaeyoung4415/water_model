package com.water.model.nego.service;

import java.util.List;
import java.util.Map;

public interface InterNegoService {

	List<Map<String, Object>> selectNegotiationList() throws Exception;
	

	int selectNegotiationListCnt() throws Exception;
	

	Map<String, Object> selectNegotiationDetail(int C_NUM) throws Exception;
	

	int selectNegotiationPwdCheck(Map<String, Object> param) throws Exception;
	

	int updateNegotiation(Map<String, Object> param) throws Exception;


	int insertNegotiation(Map<String, Object> param) throws Exception;


	int deleteNegotiation(Map<String, Object> param) throws Exception;

	

	

}
