package com.water.model.brd.qna.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.brd.qna.dao.InterQnaDao;

@Service("QnaService")
public class QnaService implements InterQnaService {

	@Autowired
	private InterQnaDao qnaDao;
		
	// 목록
	@Override
	public List<Map<String, Object>> selectQnaList(Map<String, Object> param) throws Exception {
		return qnaDao.selectQnaList(param);
	};
	
	// 목록 카운트
	@Override
	public int selectQnaListCnt() throws Exception {		
		return qnaDao.selectQnaListCnt();
	};
	
	// 상세
	@Override
	public Map<String, Object> selectQnaDtl(int Q_NUM) throws Exception {
		
		Map<String, Object> dtl = new HashMap<String, Object>();
		
		// 조회수 증가
		int cnt = qnaDao.updateQnaViewCnt(Q_NUM);
		
		if (cnt != 0) {
			dtl = qnaDao.selectQnaDtl(Q_NUM);
		} else {
			dtl = null;
		}
		return dtl;
	};

	// 비밀번호 검사
	@Override
	public int selectQnaPwdCheck(Map<String, Object> param) throws Exception {
		return qnaDao.selectQnaPwdCheck(param);
	};
	
	// 수정 액션
	@Override
	public int updateQna(Map<String, Object> param) throws Exception {
		return qnaDao.updateQna(param);		 
	};

	// 등록 액션
	@Override
	public int insertQna(Map<String, Object> param) throws Exception {
		return qnaDao.insertQna(param);
	};

	// 삭제 액션
	@Override
	public int deleteQna(Map<String, Object> param) throws Exception {
		return qnaDao.deleteQna(param);
	};

	

}
