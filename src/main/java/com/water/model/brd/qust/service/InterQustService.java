package com.water.model.brd.qust.service;

import java.util.List;
import java.util.Map;

public interface InterQustService {

	/** <pre>
	 * 1. 개요         : 질문 목록 액션
	 * </pre>
	 * @Method    : selectQustList
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
	List<Map<String, Object>> selectQustList() throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 목록 카운트 액션
	 * </pre>
	 * @Method    : selectQustListCnt
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
	int selectQustListCnt() throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 상세 액션
	 * </pre>
	 * @Method    : selectQustDtl
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
	Map<String, Object> selectQustDtl(int Q_NUM) throws Exception;
	
	/** <pre>
	 * 1. 개요         : 비밀번호 검사 액션
	 * </pre>
	 * @Method    : selectQustPwdCheck
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
	int selectQustPwdCheck(Map<String, Object> param) throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 수정 액션
	 * </pre>
	 * @Method    : updateQust
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
	int updateQust(Map<String, Object> param) throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 등록 액션
	 * </pre>
	 * @Method    : insertQust
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
	int insertQust(Map<String, Object> param) throws Exception;

	/** <pre>
	 * 1. 개요         : 질문 삭제 액션
	 * </pre>
	 * @Method    : deleteQust
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
	int deleteQust(Map<String, Object> param) throws Exception;

	

	

	
}
