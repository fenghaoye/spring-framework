package com.fh.study.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowiredService {

	UserService userService;

	// 和属性无关，spring初始化的时候会调用set方法，把spring中存在的bean注入到该方法中
	public void setXXX(UserService userService){
		this.userService = userService;

	}

	public void get(){
		System.out.println("setXXX:"+userService);

	}
}
