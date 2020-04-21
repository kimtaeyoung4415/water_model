package com.water.model.media.magazine.dao;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;

public class MediaDao implements InterMediaDao {
	
	@Resource(name = "sqlSession")
	private SqlSessionTemplate sqlSession;
	// 목록
	@Override
	public List<Map<String, Object>> selectMediaList(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}
	// 목록 카운터
	@Override
	public int selectMediaListCnt() {
		// TODO Auto-generated method stub
		return 0;
	}
	// 조회수 증가
	@Override
	public int updateMediaViewCnt(int M_NUM) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 상세
	@Override
	public Map<String, Object> selectMediaDtl(int m_NUM) {
		// TODO Auto-generated method stub
		return null;
	}
	// 수정
	@Override
	public int updateMedia(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 등록
	@Override
	public int insertMedia(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return 0;
	}
	// 삭제
	@Override
	public int deleteMedia(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
