package com.water.model.example.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.example.dao.InterExampleDao;

@Service("ExampleService")
public class ExampleService implements InterExampleService {

	@Autowired
	private InterExampleDao exampleDao;
	
	@Override
	public Map<String, Object> getUserInfo(Map<String, Object> param) {
		Map<String,Object> info = exampleDao.getUserInfo(param);
		return info;
	}

}
