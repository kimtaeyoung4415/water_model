package com.water.model.media.magazine.service;

import java.util.List;
import java.util.Map;

public interface InterMediaService {

	List<Map<String, Object>> selectMediaList(Map<String, Object> param) throws Exception;


	int selectMediaListCnt() throws Exception;


	Map<String, Object> selectMediaDtl(int M_NUM) throws Exception;


	int updateMedia(Map<String, Object> param) throws Exception;


	int insertMedia(Map<String, Object> param) throws Exception;


	int deleteMedia(Map<String, Object> param) throws Exception;


}
