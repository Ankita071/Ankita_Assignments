package assignment5.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	@Bean
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student student = (Student) applicationContext.getBean("student", Student.class);
		
		System.out.println(student.toString());

	}
}
