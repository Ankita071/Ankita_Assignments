package assignment6.Test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@Bean
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.refresh();
		DBConnection dbConnection = (DBConnection) context.getBean("dbConnection", DBConnection.class);
		dbConnection.printDbConfig();
		context.close();
	}
}