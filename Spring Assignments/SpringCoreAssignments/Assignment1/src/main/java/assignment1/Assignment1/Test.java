package assignment1.Assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = SpringApplication.run(Assignment2Application.class, args);
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("web.xml");
		
		System.out.println("Using setter injection for printing details of customer.");
		Customer customer = (Customer) applicationContext.getBean("customerUsingSetterInjection");
		customer.customerDetails();
		
		System.out.println("Using constructor injection for printing details of customer.");
		Customer cust = (Customer) applicationContext.getBean("customerUsingConstructorInjection");
		cust.customerDetails();
	}

}
