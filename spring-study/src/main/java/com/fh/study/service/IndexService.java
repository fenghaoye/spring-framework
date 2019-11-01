package com.fh.study.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	//注入userService
	@Autowired
	UserService userService;

	//构造方法
	public IndexService(){
		System.out.println("index init");
	}
}
