package com.water.model.brd.ntce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.brd.ntce.dao.InterNtceDao;

@Service("NtceService")
public class NtceService implements InterNtceService {

	@Autowired
	private InterNtceDao ntceDao;
		
}
