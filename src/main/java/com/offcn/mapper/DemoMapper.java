package com.offcn.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.offcn.bean.Demo;

public interface DemoMapper {

	@Select("SELECT * FROM demo WHERE id = #{id}")
	Demo getDemoByID(@Param("id") Integer id);
}
