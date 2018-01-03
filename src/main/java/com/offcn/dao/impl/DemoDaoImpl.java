package com.offcn.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.offcn.bean.Demo;
import com.offcn.dao.DemoDao;

@Repository
public class DemoDaoImpl implements DemoDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Demo getDemoByID(Integer id) {
		
		String sql = "select * from demo where id = ?";
		
		RowMapper<Demo> rowMapper = new BeanPropertyRowMapper<Demo>(Demo.class);
		
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}

}
