package com.fh.study.service;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class IndexService {
	//注入userService
	@Autowired
	UserService userService;
	@Autowired
	BeanFactory beanFactory;
	@Autowired
	ApplicationContext applicationContext;

	//构造方法
	public IndexService(){

	}

	public void test(){
		System.out.println("index test"+ beanFactory +" "+applicationContext);
	}
}
