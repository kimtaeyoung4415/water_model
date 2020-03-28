package com.water.model.example.service;

import java.util.List;
import java.util.Map;

public interface InterExampleService {

	/**
	 *  ============ 예시 ============
	 * <pre>
	 * 1. 개요         : 사용자 목록
	 * </pre>
	 * 
	 * @Method : getUserList
	 * @date : 2020. 03. 27. 09:21
	 * @author : 김선규
	 * @history : --------------------------------------
	 *            변경일-----------작성자----------변경내용 --
	 *            2020. 03. 27      김선규                 최초 작성
	 *            --------------------------------------
	 *</pre> @return
	 */
	List<Map<String, Object>> getUserList();

	/**
	 *  ============ 예시 ============
	 * <pre>
	 * 1. 개요         : 현재시간
	 * </pre>
	 * 
	 * @Method : getNow
	 * @date : 2020. 03. 29. 00:23
	 * @author : 김선규
	 * @history : --------------------------------------
	 *            변경일-----------작성자----------변경내용 --
	 *            2020. 03. 29      김선규                 최초 작성
	 *            --------------------------------------
	 *</pre> @return
	 */
	String getNow();
		
}
