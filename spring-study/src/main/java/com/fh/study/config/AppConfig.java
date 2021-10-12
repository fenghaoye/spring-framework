package com.fh.study.config;

import com.fh.study.service.IndexService;
import com.fh.study.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.fh")
@Configuration
public class AppConfig {


	@Bean
	public IndexService getIndexService(){
		IndexService indexService = new IndexService();
		System.out.println("调用getIndexService方法");
		return indexService;
	}

	@Bean
	public UserService getUserService(){
		UserService userService = new UserService();
		userService.setIndexService(getIndexService());
		return userService;
	}
}
