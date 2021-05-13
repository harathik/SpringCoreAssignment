

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Questions.xml");
		ClassQuestions que=(ClassQuestions) context.getBean("Questions");
		que.output();

	}

}
