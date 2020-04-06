package com.water.model.nego.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.nego.dao.InterNegoDao;

@Service("NegotiationService")
public class NegoService implements InterNegoService{
	
	@Autowired
	private InterNegoDao negotiationDao;
	
	// 목록
		@Override
		public List<Map<String, Object>> selectNegotiationList() throws Exception {
			return negotiationDao.selectNegotiationList();
		};
		
		// 목록 카운트
		@Override
		public int selectNegotiationListCnt() throws Exception {		
			return negotiationDao.selectNegotiationListCnt();
		};
		
		// 상세
		@Override
		public Map<String, Object> selectNegotiationDetail(int C_NUM) throws Exception {
			
			Map<String, Object> dtl = new HashMap<String, Object>();
			
			int cnt = negotiationDao.updateNegotiationViewCnt(C_NUM);
			
			if (cnt != 0) {
				dtl = negotiationDao.selectNegotiationDetail(C_NUM);
			} else {
				dtl = null;
			}
			return dtl;
		};

		// 비밀번호 검사
		@Override
		public int selectNegotiationPwdCheck(Map<String, Object> param) throws Exception {
			return negotiationDao.selectNegotiationPwdCheck(param);
		};
		
		// 수정 액션
		@Override
		public int updateNegotiation(Map<String, Object> param) throws Exception {
			return negotiationDao.updateNegotiation(param);		 
		};

		// 등록 액션
		@Override
		public int insertNegotiation(Map<String, Object> param) throws Exception {
			return negotiationDao.insertNegotiation(param);
		};

		// 삭제 액션
		@Override
		public int deleteNegotiation(Map<String, Object> param) throws Exception {
			return negotiationDao.deleteNegotiation(param);
		};
}
