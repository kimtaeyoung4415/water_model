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
		public List<Map<String, Object>> selectNegoList() throws Exception {
			return negotiationDao.selectNegoList();
		};
		
		// 목록 카운트
		@Override
		public int selectNegoListCnt() throws Exception {		
			return negotiationDao.selectNegoListCnt();
		};
		
		// 상세
		@Override
		public Map<String, Object> selectNegoDtl(int C_NUM) throws Exception {
			
			Map<String, Object> dtl = new HashMap<String, Object>();
			
				dtl = negotiationDao.selectNegoDtl(C_NUM);
			return dtl;
		};

		// 비밀번호 검사
		@Override
		public int selectNegoPwdCheck(Map<String, Object> param) throws Exception {
			return negotiationDao.selectNegoPwdCheck(param);
		};
		
		// 수정 액션
		@Override
		public int updateNego(Map<String, Object> param) throws Exception {
			return negotiationDao.updateNego(param);		 
		};

		// 등록 액션
		@Override
		public int insertNego(Map<String, Object> param) throws Exception {
			return negotiationDao.insertNego(param);
		};

		// 삭제 액션
		@Override
		public int deleteNego(Map<String, Object> param) throws Exception {
			return negotiationDao.deleteNego(param);
		};
}
