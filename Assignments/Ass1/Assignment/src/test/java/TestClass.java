import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class TestClass {

	@Test
	void test() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("one.xml");
		final ClassCustomer cust=(ClassCustomer) context.getBean("Customer");
		assertAll(
		new Executable() {
			public void execute() throws Throwable {
				assertEquals(cust.getCustomerName(),"harathi");
			}
		},
		()->assertEquals(cust.getCustomerId(),1234),
		()->assertEquals(cust.getCustomerContact(),8978867628L),
		()->assertEquals(cust.getCustomerAddress().getStreet(),"Benzcircle"),
		()->assertEquals(cust.getCustomerAddress().getCity(),"Vijayawada"),
		()->assertEquals(cust.getCustomerAddress().getZip(),520007),
		()->assertEquals(cust.getCustomerAddress().getCountry(),"India")
	);
	}

}
