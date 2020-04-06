package com.water.model.admin.brd.ntce.service;

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
		return adminNtceDao.selectAdminNtceDtl(N_NUM);
	}

	// 등록
	@Override
	public int insertAdminNtce(Map<String, Object> param) {
		return adminNtceDao.insertAdminNtce(param);
	}
		
}
