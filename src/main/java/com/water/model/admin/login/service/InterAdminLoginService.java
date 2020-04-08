package com.water.model.admin.login.service;

import java.util.Map;

public interface InterAdminLoginService {

	/** <pre>
	 * 1. 개요         : 로그인 액션
	 * </pre>
	 * @Method    : selectAdminIdCheck
	 * @date      : 2020. 04. 08. 10:50
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 08         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	String selectAdminIdCheck(Map<String, Object> param);
	
	/** <pre>
	 * 1. 개요         : 로그인 액션
	 * </pre>
	 * @Method    : selectAdminLogin
	 * @date      : 2020. 04. 08. 13:10
	 * @author    : 김선규
	 * @history -------------------------------------------
	 *          ----변경일---------작성자--------------변경내용 
	 *          2020. 04. 08         김선규                         최초 작성
	 *          -------------------------------------------
	 * </pre>
	 * @param param
	 * @return
	 */
	int selectAdminLogin(Map<String, Object> param) throws Exception;

	

}
