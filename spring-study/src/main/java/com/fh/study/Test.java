package com.fh.study;

import com.fh.study.config.AppConfig;
import com.fh.study.myimport.MyImport;
import com.fh.study.myimport.TestImpostClass;
import com.fh.study.service.AutowiredService;
import com.fh.study.service.IndexService;
import com.fh.study.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		System.out.println(userService);
		System.out.println("编译成功");

		AutowiredService autowiredService = context.getBean(AutowiredService.class);
		autowiredService.get();

		IndexService indexService = (IndexService) context.getBean("indexService");
		indexService.test();

		System.out.printf( context.getBean(TestImpostClass.class).toString());
	}

}
