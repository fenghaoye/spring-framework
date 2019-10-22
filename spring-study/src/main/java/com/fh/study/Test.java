package com.fh.study;

import com.fh.study.config.AppConfig;
import com.fh.study.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);

			//
		System.out.println("xxxx method");

	}

}
