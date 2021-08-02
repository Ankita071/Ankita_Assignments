package assignment4.Test;

import java.util.Scanner;

import org.springframework.stereotype.Component;

@Component
public class BankAccountController {
	double withdrawAmount;
	double depositAmount;
	int initialBalance = 100000;

	public double withdraw(long accountId, double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		System.out.println("Withdrawn Amount is: " + withdrawAmount);
		return 0;
	}

	public double deposit(long accountId, double depositAmount) {
		this.depositAmount = depositAmount;
		System.out.println("Deposited Amount is: " + depositAmount);
		return 0;
	}

	public double getBalance(long accountId) {
		System.out.println("Press 1 for deposit and 2 for withdrawl: ");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		if (deposit == 1) {
			System.out.println("The amount in accountId " + accountId + " after depositing Rs." + depositAmount + " is Rs."
					+ (initialBalance + depositAmount));
		} else {
			System.out.println("The amount in accountId " + accountId + " after withdrawing Rs." + withdrawAmount + " is Rs."
					+ (initialBalance - withdrawAmount));
		}
		sc.close();
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return true;
	}

}
