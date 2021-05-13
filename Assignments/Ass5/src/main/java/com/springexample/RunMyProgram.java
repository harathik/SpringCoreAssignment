package com.springexample;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class RunMyProgram {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        StudentHolder studentHolder = (StudentHolder) context.getBean("studentHolder");
            studentHolder.displayStudentDetails();
    }
}