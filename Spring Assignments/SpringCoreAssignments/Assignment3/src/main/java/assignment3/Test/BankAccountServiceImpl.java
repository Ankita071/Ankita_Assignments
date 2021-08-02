package assignment3.Test;

import java.util.Scanner;

public class BankAccountServiceImpl implements BankAccountService {
	double withdrawAmount;
	double depositAmount;
	int initialBalance;
	
	
	public BankAccountServiceImpl() {
	}
	
	public double getWithdrawAmount() {
		return withdrawAmount;
	}

	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	public int getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}

	public BankAccountServiceImpl(double withdrawAmount, double depositAmount, int initialBalance) {
		this.withdrawAmount = withdrawAmount;
		this.depositAmount = depositAmount;
		this.initialBalance = initialBalance;
	}

	@Override
	public double withdraw(long accountId, double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
		System.out.println("Withdrawn Amount is: " + withdrawAmount);
		return 0;
	}
	
	@Override
	public double deposit(long accountId, double depositAmount) {
		this.depositAmount = depositAmount;
		System.out.println("Deposited Amount is: " + depositAmount);
		return 0;
	}

	@Override
	public double getBalance(long accountId) {
		System.out.println("Press 1 for deposit and 2 for withdrawl: ");
		Scanner sc = new Scanner(System.in);
		int deposit = sc.nextInt();
		if (deposit == 1) {
			System.out.println(initialBalance + depositAmount);
		} else
			System.out.println(initialBalance - withdrawAmount);
		sc.close();
		return 0;
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return true;
	}
}
