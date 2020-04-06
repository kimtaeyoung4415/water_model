package com.water.model.admin.brd.ntce.service;

import java.util.List;
import java.util.Map;

public interface InterAdminNtceService {

	/** <pre>
	 * 1. 개요         : 관리자 공지 목록
	 * </pre>
	 * @Method    : selectAdminNtceList
	 * @date      : 2020. 04. 06. 09:45
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 06         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	List<Map<String, Object>> selectAdminNtceList() throws Exception;

	/** <pre>
	 * 1. 개요         : 관리자 공지 목록
	 * </pre>
	 * @Method    : selectAdminNtceListCnt
	 * @date      : 2020. 04. 06. 09:45
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 06         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int selectAdminNtceListCnt() throws Exception;

	/** <pre>
	 * 1. 개요         : 관리자 공지 상세
	 * </pre>
	 * @Method    : selectAdminNtceDtl
	 * @date      : 2020. 04. 06. 14:30
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 06         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	Map<String, Object> selectAdminNtceDtl(int N_NUM) throws Exception;

	/** <pre>
	 * 1. 개요         : 관리자 공지 등록
	 * </pre>
	 * @Method    : insertAdminNtce
	 * @date      : 2020. 04. 06. 15:40
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 06         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int insertAdminNtce(Map<String, Object> param);

}
