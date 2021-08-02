package assignment10.Test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test implements ApplicationContextAware {

	@SuppressWarnings("unused")
	private ApplicationContext context;
	
	@Override
	 public void setApplicationContext(ApplicationContext context) throws BeansException
	 {
	  this.context = context;
	 }
	
	public static void main(String[] args){
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		((AbstractApplicationContext) context).registerShutdownHook();
		LifeCycle lifeCycle = (LifeCycle) context.getBean("test");
		System.out.println(lifeCycle);
	}

}
