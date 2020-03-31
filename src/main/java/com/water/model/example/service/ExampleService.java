package com.water.model.example.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.example.dao.InterExampleDao;

@Service("ExampleService")
public class ExampleService implements InterExampleService {

	@Autowired
	private InterExampleDao exampleDao;

	// 현재시간
	@Override
	public String getNow() {
		return exampleDao.getNow();
	}

}
