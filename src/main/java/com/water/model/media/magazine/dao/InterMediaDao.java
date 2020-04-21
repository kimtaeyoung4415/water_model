package com.water.model.media.magazine.dao;

import java.util.List;
import java.util.Map;

public interface InterMediaDao {
	// 목록
	List<Map<String, Object>> selectMediaList(Map<String, Object> param);
	// 목록 카운트
	int selectMediaListCnt();
	// 조회수 증가
	int updateMediaViewCnt(int M_NUM);
	// 상세
	Map<String, Object> selectMediaDtl(int m_NUM);
	// 수정
	int updateMedia(Map<String, Object> param);
	// 등록
	int insertMedia(Map<String, Object> param);
	// 삭제
	int deleteMedia(Map<String, Object> param);


}
