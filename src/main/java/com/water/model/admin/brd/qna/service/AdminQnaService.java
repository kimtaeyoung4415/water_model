package com.water.model.admin.brd.qna.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.admin.brd.qna.dao.InterAdminQnaDao;

@Service("AdminQnaService")
public class AdminQnaService implements InterAdminQnaService {

	@Autowired
	private InterAdminQnaDao adminQnaDao;

	// 목록
	@Override
	public List<Map<String, Object>> selectAdminQnaList(Map<String, Object> param) throws Exception {
		return adminQnaDao.selectAdminQnaList(param);
	};
	
	// 목록 카운트
	@Override
	public int selectAdminQnaListCnt() throws Exception {		
		return adminQnaDao.selectAdminQnaListCnt();
	}

	// 상세
	@Override
	public Map<String, Object> selectAdminQnaDtl(int N_NUM) throws Exception {
		Map<String, Object> dtl = new HashMap<String, Object>();
		
		// 조회수 증가
		int cnt = adminQnaDao.updateAdminQnaViewCnt(N_NUM);
		
		if (cnt != 0) {
			dtl = adminQnaDao.selectAdminQnaDtl(N_NUM);
		} else {
			dtl = null;
		}
		return dtl;
	};

	// 수정 액션
	@Override
	public int updateAdminQna(Map<String, Object> param) throws Exception {
		return adminQnaDao.updateAdminQna(param);		 
	}

	@Override
	public int deleteAdminQna(Map<String, Object> param) throws Exception {
		return adminQnaDao.deleteAdminQna(param);	
	}

}
