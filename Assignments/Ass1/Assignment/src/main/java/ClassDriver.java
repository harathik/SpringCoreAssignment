import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("one.xml");
		ClassCustomer cust=(ClassCustomer) context.getBean("Customer");
		cust.printDetails();
	}

}
