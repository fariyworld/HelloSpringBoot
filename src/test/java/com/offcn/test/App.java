package com.offcn.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.offcn.controller","com.offcn.service","com.offcn.dao"})
@MapperScan(basePackages = "com.offcn.mapper")
@EnableAutoConfiguration
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);
	}
}
