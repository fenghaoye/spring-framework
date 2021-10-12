package com.fh.study.myimport;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry, BeanNameGenerator importBeanNameGenerator) {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestImpostClass.class);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		String beanName = importBeanNameGenerator.generateBeanName(beanDefinition, registry);
		registry.registerBeanDefinition(beanName, beanDefinition);
	}

	/**
	 * 手动设置bean的名称，重写了上面的方法后，此方法便不会被执行
	 * @param importingClassMetadata annotation metadata of the importing class
	 * @param registry current bean definition registry
	 */
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(TestImpostClass.class);
		AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
		registry.registerBeanDefinition("testImpostClass2", beanDefinition);
	}
}
