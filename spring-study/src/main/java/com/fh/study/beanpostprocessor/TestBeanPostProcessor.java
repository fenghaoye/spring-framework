package com.fh.study.beanpostprocessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TestBeanPostProcessor {

	@Autowired
	private TestBeanPostProcessor2 testBeanPostProcessor2;

	public TestBeanPostProcessor() {
		System.out.println("TestBeanPostProcessor构造方法");
	}
}
