package assignment3.Test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContextConstructor = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");
//
// 		System.out.println("Using constructor autowiring");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Account Id: ");
//		long accountId = sc.nextLong();
//		
//		System.out.println("Enter the deposit amount: ");
//		double depositAmount = sc.nextDouble();
//		
//		System.out.println("Enter the withdrawl amount: ");
//		double withdrawAmount = sc.nextDouble();
//		
//		BankAccountController bac1 = (BankAccountController) applicationContextConstructor.getBean("BankAccountController", BankAccountController.class);
//		
//		bac1.deposit(accountId, depositAmount);
//		bac1.withdraw(accountId, withdrawAmount);
//		bac1.getBalance(accountId);
//		sc.close();
		
//		@SuppressWarnings("resource")
//		ApplicationContext applicationContextByType = new ClassPathXmlApplicationContext("applicationContextByType.xml");
//
//		System.out.println("Using byType autowiring");
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Account Id: ");
//		long accountId = sc.nextLong();
//		
//		System.out.println("Enter the deposit amount: ");
//		double depositAmount = sc.nextDouble();
//		
//		System.out.println("Enter the withdrawl amount: ");
//		double withdrawAmount = sc.nextDouble();
//		
//		BankAccountController bac2 = (BankAccountController) applicationContextByType.getBean("bankAccountController", BankAccountController.class);
//		
//		bac2.deposit(accountId, depositAmount);
//		bac2.withdraw(accountId, withdrawAmount);
//		bac2.getBalance(accountId);
//		sc.close();
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContextByName = new ClassPathXmlApplicationContext("applicationContextByName.xml");

		System.out.println("Using byName autowiring");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Id: ");
		long accountId = sc.nextLong();
		
		System.out.println("Enter the deposit amount: ");
		double depositAmount = sc.nextDouble();
		
		System.out.println("Enter the withdrawl amount: ");
		double withdrawAmount = sc.nextDouble();
		
		BankAccountController bac3 = (BankAccountController) applicationContextByName.getBean("bankAccountController", BankAccountController.class);
		
		bac3.deposit(accountId, depositAmount);
		bac3.withdraw(accountId, withdrawAmount);
		bac3.getBalance(accountId);
		sc.close();
	}
}
