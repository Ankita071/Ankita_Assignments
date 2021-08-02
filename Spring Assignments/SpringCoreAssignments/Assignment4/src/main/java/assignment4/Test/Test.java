package assignment4.Test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@Bean
	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(Assignment2Application.class, args);
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Id: ");
		long accountId = sc.nextLong();
		
		System.out.println("Enter the deposit amount: ");
		double depositAmount = sc.nextDouble();
		
		System.out.println("Enter the withdrawl amount: ");
		double withdrawAmount = sc.nextDouble();
		
		BankAccountController bac = (BankAccountController) applicationContext.getBean("BankAccountController");
		
		bac.deposit(accountId, depositAmount);
		bac.withdraw(accountId, withdrawAmount);
		bac.getBalance(accountId);
		sc.close();
	}
}
