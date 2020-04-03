package com.water.model.brd.qust.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.brd.qust.dao.InterQustDao;

@Service("QustService")
public class QustService implements InterQustService {

	@Autowired
	private InterQustDao qustDao;
		
	// 목록
	@Override
	public List<Map<String, Object>> selectQustList() throws Exception {
		return qustDao.selectQustList();
	};
	
	// 목록 카운트
	@Override
	public int selectQustListCnt() throws Exception {		
		return qustDao.selectQustListCnt();
	};
	
	// 상세
	@Override
	public Map<String, Object> selectQustDtl(int Q_NUM) throws Exception {
		
		Map<String, Object> dtl = new HashMap<String, Object>();
		
		// 조회수 증가
		int cnt = qustDao.updateQustViewCnt(Q_NUM);
		
		if (cnt != 0) {
			dtl = qustDao.selectQustDtl(Q_NUM);
		} else {
			dtl = null;
		}
		return dtl;
	};

	// 비밀번호 검사
	@Override
	public int selectQustPwdCheck(Map<String, Object> param) throws Exception {
		return qustDao.selectQustPwdCheck(param);
	};
	
	// 수정 액션
	@Override
	public int updateQust(Map<String, Object> param) throws Exception {
		return qustDao.updateQust(param);		 
	};

	// 등록 액션
	@Override
	public int insertQust(Map<String, Object> param) throws Exception {
		return qustDao.insertQust(param);
	};

	// 삭제 액션
	@Override
	public int deleteQust(Map<String, Object> param) throws Exception {
		return qustDao.deleteQust(param);
	};

	

}
