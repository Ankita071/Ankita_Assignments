package assignment9.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		LifeCycle lifeCycle = (LifeCycle) context.getBean("test");
		System.out.println(lifeCycle);
	}

}
