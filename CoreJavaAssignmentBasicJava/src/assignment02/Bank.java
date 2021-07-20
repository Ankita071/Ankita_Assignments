package assignment02;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter balance in bank:");
		double bankAmount = sc.nextDouble();
		
		System.out.println("Enter fixed deposit amount:");
		double depositAmount = sc.nextDouble();
		
		System.out.println("Enter cash credit amount:");
		double creditAmount = sc.nextDouble();
		
		Account acc = new Account(bankAmount);
		SavingAccount sa = new SavingAccount(bankAmount, depositAmount);
		CurrentAccount ca = new CurrentAccount(bankAmount, creditAmount);

		double total = acc.totalBalance() + sa.totalBalance() + ca.totalBalance();
		
		System.out.println("Total amount is: " + total);
		
		sc.close();
	}

}

class Account {
	private double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	public double totalBalance() {
		return balance;
	}
}

class SavingAccount extends Account {
	private double depositAmount;
	
	public SavingAccount(double balance, double depositAmount) {
		super(balance);
		this.depositAmount = depositAmount;
	}
	
	@Override
	public double totalBalance() {
		return depositAmount;
	}
}

class CurrentAccount extends Account {
	private double creditAmount;
	
	public CurrentAccount(double balance, double creditAmount) {
		super(balance);
		this.creditAmount = creditAmount;
	}
	
	@Override
	public double totalBalance() {
		return creditAmount;
	}
}
