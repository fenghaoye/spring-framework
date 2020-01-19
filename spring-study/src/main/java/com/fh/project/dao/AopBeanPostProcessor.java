package com.fh.project.dao;

import com.fh.project.imports.MyInvocationHandler;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;

import java.lang.reflect.Proxy;


public class AopBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO 报错
		/*bean = Proxy.newProxyInstance(this.getClass().getClassLoader(),
				new Class[]{Dao.class},new MyInvocationHandler(bean));*/
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		return null;
	}

}
