package com.water.model.brd.ntce.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.brd.ntce.dao.InterNtceDao;

@Service("NtceService")
public class NtceService implements InterNtceService {

	@Autowired
	private InterNtceDao ntceDao;

	// 목록
	@Override
	public List<Map<String, Object>> selectNtceList() throws Exception {		
		return ntceDao.selectNtceList();
	}

	// 목록 카운트
	@Override
	public int selectNtceListCnt() throws Exception {		
		return ntceDao.selectNtceListCnt();
	}

	// 상세
	@Override
	public Map<String, Object> selectNtceDtl(int N_NUM) throws Exception {
		
		Map<String, Object> dtl = new HashMap<String, Object>();
		
		// 조회수 증가
		int cnt = ntceDao.updateNtceViewCnt(N_NUM);
		
		if (cnt != 0) {
			dtl = ntceDao.selectNtceDtl(N_NUM);
		} else {
			dtl = null;
		}
				
		return dtl;
	}
		
}
