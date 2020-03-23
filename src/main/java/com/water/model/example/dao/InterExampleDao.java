package com.water.model.example.dao;

import java.util.Map;

public interface InterExampleDao {

	/**
	 *  ============ 예시 ============
	 * <pre>
	 * 1. 개요         : 특정 사용자 목록 불러오기
	 * 2. 처리내용    : 사용자 ID 를 이용하여 해당 사용자 목록 불러오기
	 * </pre>
	 * 
	 * @Method : getUserInfo
	 * @date : 2020. 03. 20. 11:40
	 * @author : 김선규
	 * @history : --------------------------------------
	 *            변경일-----------작성자----------변경내용 --
	 *            2020. 03. 20      김선규                  최초 작성
	 *            --------------------------------------
	 *</pre> @return
	 */
	Map<String, Object> getUserInfo(Map<String, Object> param);

}
