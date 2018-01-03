package com.offcn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.offcn.bean.Demo;
import com.offcn.dao.DemoDao;
import com.offcn.mapper.DemoMapper;
import com.offcn.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

	@Autowired
	private DemoDao demoDao;
	
	@Autowired
	private DemoMapper demoMapper;
	
	@Override
	public Demo getDemoByID(Integer id) {
		
		return demoDao.getDemoByID(id);
	}

	@Transactional
	@Override
	public int insertDemo(String name) {
		
		return demoMapper.insertDemo(name);
	}

}
