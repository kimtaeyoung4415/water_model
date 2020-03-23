package com.water.model.brd.qust.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.brd.qust.dao.InterQustDao;

@Service("BrdQustService")
public class QustService implements InterQustService {

	@Autowired
	private InterQustDao qustDao;
		
	// ����
	@Override
	public int updateQust(Map<String, Object> param) {
		int result = qustDao.updateQust(param);
		return result;
	}

	// ����
	@Override
	public int delteQust(Map<String, Object> param) {
		int result = qustDao.deletQust(param);
		return result;
	}
}
