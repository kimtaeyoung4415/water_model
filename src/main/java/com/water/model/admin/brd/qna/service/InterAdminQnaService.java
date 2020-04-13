package com.water.model.admin.brd.qna.service;

import java.util.List;
import java.util.Map;

public interface InterAdminQnaService {

	/** <pre>
	 * 1. 개요         : 관리자 질문 목록 
	 * </pre>
	 * @Method    : selectAdminQnaList
	 * @date      : 2020. 04. 03. 13:00
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
	List<Map<String, Object>> selectAdminQnaList(Map<String, Object> param) throws Exception;
		

	/** <pre>
	 * 1. 개요         : 관리자 질문 목록 카운트
	 * </pre>
	 * @Method    : selectAdminQnaListCnt
	 * @date      : 2020. 04. 03. 13:00
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int selectAdminQnaListCnt() throws Exception;

	/** <pre>
	 * 1. 개요         : 관리자 질문 상세
	 * </pre>
	 * @Method    : selectAdminQnaDtl
	 * @date      : 2020. 04. 03. 13:00
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	Map<String, Object> selectAdminQnaDtl(int N_NUM) throws Exception;

	/** <pre>
	 * 1. 개요         : 관리자 질문 답변 등록
	 * </pre>
	 * @Method    : updateAdminQna
	 * @date      : 2020. 04. 03. 13:30
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int updateAdminQna(Map<String, Object> param) throws Exception;

	/** <pre>
	 * 1. 개요         : 관리자 질문 삭제 등록
	 * </pre>
	 * @Method    : deleteAdminQna
	 * @date      : 2020. 04. 03. 13:30
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 03         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int deleteAdminQna(Map<String, Object> param) throws Exception;


}
