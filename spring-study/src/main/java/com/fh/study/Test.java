package com.fh.study;

import com.fh.study.config.AppConfig;
import com.fh.study.myimport.MyImport;
import com.fh.study.myimport.MyImportSelector;
import com.fh.study.myimport.TestImpostClass;
import com.fh.study.service.AutowiredService;
import com.fh.study.service.IndexService;
import com.fh.study.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		UserService userService = context.getBean(UserService.class);
//		UserService userService2 = context.getBean(UserService.class);
//		System.out.println(userService.getIndexService());
//		System.out.println(userService2.getIndexService());
//		System.out.println("编译成功");

		/*AutowiredService autowiredService = context.getBean(AutowiredService.class);
		autowiredService.get();

		IndexService indexService = (IndexService) context.getBean("indexService");
		indexService.test();*/
//     测试import
//		System.out.println( context.getBean(TestImpostClass.class).toString());
//		System.out.println( context.getBean(AppConfig.class).toString());

//		测试factoryBean
//		System.out.println(context.getBean("myFactoryBean"));
//		System.out.println(context.getBean("&myFactoryBean"));

	}

}
