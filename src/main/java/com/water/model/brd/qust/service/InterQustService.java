package com.water.model.brd.qust.service;

import java.util.Map;

public interface InterQustService {

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
	
	
}
