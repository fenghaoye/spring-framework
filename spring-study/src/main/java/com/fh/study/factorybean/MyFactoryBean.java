package com.fh.study.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

//@Component
public class MyFactoryBean implements FactoryBean<TestFactoryBean> {
	@Override
	public TestFactoryBean getObject() throws Exception {
		return new TestFactoryBean();
	}

	@Override
	public Class<?> getObjectType() {
		return TestFactoryBean.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
