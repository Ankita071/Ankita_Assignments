package usingXML;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("springXml.xml");

		cap.close();
	}
}