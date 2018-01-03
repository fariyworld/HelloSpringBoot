package com.offcn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offcn.bean.Demo;
import com.offcn.mapper.DemoMapper;
import com.offcn.service.DemoService;

/**
 * 
 * @TODO: 第一个spring boot
 * @Administrator: 黄土高坡的宝宝
 * @Date: 2018年1月3日下午8:12:31
 * @Version: V1.0.0
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@Autowired
	private DemoMapper demoMapper;

	
	@RequestMapping("/getByID")
	public Demo getDemoByID(Integer id) {

		return demoService.getDemoByID(id);
	}
	
	
	@RequestMapping("/getByIDForMybatis")
	public Demo getDemoByIDForMybatis(Integer id){
		
		return demoMapper.getDemoByID(id);
	}
}
