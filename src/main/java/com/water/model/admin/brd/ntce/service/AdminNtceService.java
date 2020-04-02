package com.water.model.admin.brd.ntce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.admin.brd.ntce.dao.InterAdminNtceDao;

@Service("AdminNtceService")
public class AdminNtceService implements InterAdminNtceService {

	@Autowired
	private InterAdminNtceDao adminNtceDao;
		
}
