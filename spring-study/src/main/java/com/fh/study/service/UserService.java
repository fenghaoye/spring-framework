package com.fh.study.service;


import com.fh.study.factorybean.TestFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	//注入 indexService
//	@Autowired
	IndexService indexService;
	@Autowired
	TestFactoryBean testFactoryBean;

//	public IndexService getIndexService() {
//		return indexService;
//	}
//
//	public void setIndexService(IndexService indexService) {
//		this.indexService = indexService;
//	}

	//构造方法
	public UserService(){
		System.out.println("user init");
	}

	public void gettestFactoryBean(){
		System.out.println(testFactoryBean);
	}
}
