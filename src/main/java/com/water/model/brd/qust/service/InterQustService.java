package com.water.model.brd.qust.service;

import java.util.List;
import java.util.Map;

public interface InterQustService {

	/** <pre>
	 * 1. 개요         : 질문 목록 액션
	 * </pre>
	 * @Method    : getQustList
	 * @date      : 2020. 03. 27. 10:57
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 27         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 * @throws Exception 
	 */
	List<Map<String, Object>> selectQustList() throws Exception;
	
	/** <pre>
	 * 1. 개요         : 질문 목록 카운트 액션
	 * </pre>
	 * @Method    : getQustListCnt
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
	int selectQustListCnt();
	
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
	Map<String, Object> selectQustDtl(int no);
	
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
	int updateQust(Map<String, Object> param);

	/** <pre>
	 * 1. 개요         : 질문 삭제 액션
	 * </pre>
	 * @Method    : delteQust
	 * @date      : 2020. 03. 23. 17:18
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 03. 23         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int delteQust(Map<String, Object> param);

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
	int insertQust(Map<String, Object> param);

	

	

	
}
