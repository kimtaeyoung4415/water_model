package com.water.model.brd.qna.service;

import java.util.List;
import java.util.Map;

public interface InterQnaService {

	/** <pre>
	 * 1. 개요         : 질문 목록 액션
	 * </pre>
	 * @Method    : selectQnaList
	 * @date      : 2020. 03. 27. 10:57
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	List<Map<String, Object>> selectQnaList() throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 목록 카운트 액션
	 * </pre>
	 * @Method    : selectQnaListCnt
	 * @date      : 2020. 03. 27. 10:57
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int selectQnaListCnt() throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 상세 액션
	 * </pre>
	 * @Method    : selectQnaDtl
	 * @date      : 2020. 03. 27. 11:57
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	Map<String, Object> selectQnaDtl(int Q_NUM) throws Exception;
	
	/** <pre>
	 * 1. 개요         : 비밀번호 검사 액션
	 * </pre>
	 * @Method    : selectQnaPwdCheck
	 * @date      : 2020. 03. 27. 16:04
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int selectQnaPwdCheck(Map<String, Object> param) throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 수정 액션
	 * </pre>
	 * @Method    : updateQna
	 * @date      : 2020. 03. 23. 17:17
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 23         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int updateQna(Map<String, Object> param) throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 등록 액션
	 * </pre>
	 * @Method    : insertQna
	 * @date      : 2020. 03. 27. 10:21
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int insertQna(Map<String, Object> param) throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 삭제 액션
	 * </pre>
	 * @Method    : deleteQna
	 * @date      : 2020. 03. 27. 17:21
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int deleteQna(Map<String, Object> param) throws Exception;

	

	

	
}
