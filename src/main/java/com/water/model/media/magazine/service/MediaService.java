package com.water.model.media.magazine.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.media.magazine.dao.InterMediaDao;
@Service("MediaService")
public class MediaService implements InterMediaService {
	@Autowired
	private InterMediaDao mediaDao;
	
	// 목록
		@Override
		public List<Map<String, Object>> selectMediaList(Map<String, Object> param) throws Exception {
			return mediaDao.selectMediaList(param);
		};
		
		// 목록 카운트
		@Override
		public int selectMediaListCnt() throws Exception {		
			return mediaDao.selectMediaListCnt();
		};
		
		// 상세
		@Override
		public Map<String, Object> selectMediaDtl(int M_NUM) throws Exception {
			
			Map<String, Object> dtl = new HashMap<String, Object>();
			
			// 조회수 증가
			int cnt = mediaDao.updateMediaViewCnt(M_NUM);
			
			if (cnt != 0) {
				dtl = mediaDao.selectMediaDtl(M_NUM);
			} else {
				dtl = null;
			}
			return dtl;
		};
		// 수정 액션
		@Override
		public int updateMedia(Map<String, Object> param) throws Exception {
			return mediaDao.updateMedia(param);		 
		};
		
		// 등록 액션
		@Override
		public int insertMedia(Map<String, Object> param) throws Exception {
			return mediaDao.insertMedia(param);
		};

		// 삭제 액션
		@Override
		public int deleteMedia(Map<String, Object> param) throws Exception {
			return mediaDao.deleteMedia(param);
		};

		
}
