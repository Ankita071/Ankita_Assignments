package Assignment2.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
//		ApplicationContext applicationContext = SpringApplication.run(Assignment2Application.class, args);
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		System.out.println("Printing question and its answer using List");
		QuestionList qList = (QuestionList) applicationContext.getBean("questionList");
		qList.printQuestionAnswer();
		
		System.out.println("Printing question and its answer using Set");
		QuestionSet qSet = (QuestionSet) applicationContext.getBean("questionSet");
		qSet.printQuestionAnswer();
		
		System.out.println("Printing question and its answer using Map");
		QuestionMap qMap = (QuestionMap) applicationContext.getBean("questionMap");
		qMap.printQuestionAnswer();
	}
}
