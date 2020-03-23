package com.water.model.brd.qust.dao;

import java.util.Map;

public interface InterQustDao {

	/** <pre>
	 * 1. 개요         : 질문 수정 액션
	 * </pre>
	 * @Method    : updtQust
	 * @date      : 2020. 03. 23. 17:15
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 02. 23         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int updateQust(Map<String, Object> param);

	/** <pre>
	 * 1. 개요         : 질문 수정 액션
	 * </pre>
	 * @Method    : deletQust
	 * @date      : 2020. 03. 23. 17:15
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 02. 23         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int deletQust(Map<String, Object> param);

	
	
}
