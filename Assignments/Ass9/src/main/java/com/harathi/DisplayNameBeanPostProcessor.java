package com.harathi;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In after Initialization Method Bean Name is "+beanName); 
		return bean;
		
		
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In before Initialization Method Bean Name is "+beanName); 
		return bean;
		
	}
	

}
