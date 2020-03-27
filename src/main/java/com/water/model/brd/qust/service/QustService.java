package com.water.model.brd.qust.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.brd.qust.dao.InterQustDao;

@Service("BrdQustService")
public class QustService implements InterQustService {

	@Autowired
	private InterQustDao qustDao;
		
	// 목록
	@Override
	public List<Map<String, Object>> selectQustList() throws Exception {
		return qustDao.selectQustList();
	}
	
	// 목록 카운트
	@Override
	public int selectQustListCnt() {		
		return qustDao.selectQustListCnt();
	}
	
	// 상세
	@Override
	public Map<String, Object> selectQustDtl(int no) {
		return qustDao.selectQustDtl(no);
	}

	
	// 수정 액션
	@Override
	public int updateQust(Map<String, Object> param) {
		int result = qustDao.updateQust(param);
		return result;
	}

	// 삭제 액션
	@Override
	public int delteQust(Map<String, Object> param) {
		int result = qustDao.deletQust(param);
		return result;
	}

	// 등록 액션
	@Override
	public int insertQust(Map<String, Object> param) {
		return qustDao.insertQust(param);
	}

}
