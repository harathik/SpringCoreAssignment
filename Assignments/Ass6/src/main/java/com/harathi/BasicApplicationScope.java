package com.harathi;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:dbconfig.properties")
public class BasicApplicationScope {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext run = new AnnotationConfigApplicationContext(BasicApplicationScope.class);
		SomeExternalService personDAO = run.getBean(SomeExternalService.class);
		System.out.println(personDAO.toString());

		
	}

}
