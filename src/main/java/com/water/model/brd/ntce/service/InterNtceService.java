package com.water.model.brd.ntce.service;

import java.util.List;
import java.util.Map;

public interface InterNtceService {

	/** <pre>
	 * 1. 개요         : 공지 목록
	 * </pre>
	 * @Method    : selectNtceList
	 * @date      : 2020. 04. 03. 09:30
	 * @author    : 김선규
	 * @param param 
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	List<Map<String, Object>> selectNtceList(Map<String, Object> param) throws Exception;

	/** <pre>
	 * 1. 개요         : 공지 목록 카운트
	 * </pre>
	 * @Method    : selectNtceListCnt
	 * @date      : 2020. 04. 03. 09:30
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int selectNtceListCnt() throws Exception;

	/** <pre>
	 * 1. 개요         : 공지 상세
	 * </pre>
	 * @Method    : selectNtceDtl
	 * @date      : 2020. 04. 03. 10:10
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	Map<String, Object> selectNtceDtl(int N_NUM) throws Exception;

}
