package com.water.model.admin.brd.answ.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.water.model.admin.brd.answ.dao.InterAdminAnswDao;

@Service("AdminAnswService")
public class AdminAnswService implements InterAdminAnswService {

	@Autowired
	private InterAdminAnswDao adminAnswDao;

}
