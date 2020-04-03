package com.water.model.admin.brd.qna.service;

import java.util.List;
import java.util.Map;

public interface InterAdminQnaService {

	/** <pre>
	 * 1. 개요         : 질문 목록 
	 * </pre>
	 * @Method    : selectQnaList
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
	List<Map<String, Object>> selectQnaList() throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 목록 카운트
	 * </pre>
	 * @Method    : selectQnaListCnt
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
	int selectQnaListCnt() throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 상세
	 * </pre>
	 * @Method    : selectQnaDtl
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
	Map<String, Object> selectQnaDtl(int N_NUM) throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 답변 등록
	 * </pre>
	 * @Method    : updateQna
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
	int updateQna(Map<String, Object> param) throws Exception;

}
