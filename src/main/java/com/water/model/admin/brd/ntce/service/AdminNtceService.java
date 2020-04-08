package com.water.model.admin.brd.ntce.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.admin.brd.ntce.dao.InterAdminNtceDao;

@Service("AdminNtceService")
public class AdminNtceService implements InterAdminNtceService {

	@Autowired
	private InterAdminNtceDao adminNtceDao;

	// 목록
	@Override
	public List<Map<String, Object>> selectAdminNtceList() throws Exception {
		return adminNtceDao.selectAdminNtceList();
	}

	// 목록 카운트
	@Override
	public int selectAdminNtceListCnt() throws Exception {		
		return adminNtceDao.selectAdminNtceListCnt();
	}

	// 상세
	@Override
	public Map<String, Object> selectAdminNtceDtl(int N_NUM) throws Exception {
		Map<String, Object> dtl = new HashMap<String, Object>();
		
		// 조회수 증가
		int cnt = adminNtceDao.updateAdminNtceViewCnt(N_NUM);
		
		if (cnt != 0) {
			dtl = adminNtceDao.selectAdminNtceDtl(N_NUM);
		} else {
			dtl = null;
		}
		
		return dtl;
	}

	// 등록
	@Override
	public int insertAdminNtce(Map<String, Object> param) throws Exception {
		return adminNtceDao.insertAdminNtce(param);
	}

	// 수정
	@Override
	public int updateAdminNtce(Map<String, Object> param) throws Exception {
		return adminNtceDao.updateAdminNtce(param);
	}
		
	// 삭제
	@Override
	public int deleteAdminNtce(Map<String, Object> param) throws Exception {
		return adminNtceDao.deleteAdminNtce(param);
	}
	
}
