package com.offcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.offcn.bean.Demo;
import com.offcn.dao.DemoDao;
import com.offcn.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;
	
	@Override
	public Demo getDemoByID(Integer id) {
		
		return demoDao.getDemoByID(id);
	}

}
