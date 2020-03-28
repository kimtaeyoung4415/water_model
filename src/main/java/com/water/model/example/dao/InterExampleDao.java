package com.water.model.example.dao;

import java.util.List;
import java.util.Map;

public interface InterExampleDao {

	List<Map<String, Object>> getUserList();

	// 현재시간
	String getNow();

}
