package com.harathi;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Triangle.xml");
		context.registerShutdownHook();
		circle que=(circle) context.getBean("Circle");
		que.output();
		

	}

}
