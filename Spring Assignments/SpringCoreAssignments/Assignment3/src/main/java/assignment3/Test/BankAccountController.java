package assignment3.Test;

import java.util.Scanner;

public class BankAccountController {
	double withdrawAmount;
	double depositAmount;
	int initialBalance;
	
	BankAccount bankAccount;
	BankAccountRepositoryImpl bankAccountRepositoryImpl;
	BankAccountServiceImpl bankAccountServiceImpl;
	
	
	public BankAccountController(double withdrawAmount, double depositAmount, int initialBalance,
			BankAccount bankAccount, BankAccountRepositoryImpl bankAccountRepositoryImpl,
			BankAccountServiceImpl bankAccountServiceImpl) {
		super();
		this.withdrawAmount = withdrawAmount;
		this.depositAmount = depositAmount;
		this.initialBalance = initialBalance;
		this.bankAccount = bankAccount;
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}


	public BankAccountController() {
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


	public BankAccount getBankAccount() {
		return bankAccount;
	}


	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	public BankAccountRepositoryImpl getBankAccountRepositoryImpl() {
		return bankAccountRepositoryImpl;
	}

	public void setBankAccountRepositoryImpl(BankAccountRepositoryImpl bankAccountRepositoryImpl) {
		this.bankAccountRepositoryImpl = bankAccountRepositoryImpl;
	}

	public BankAccountServiceImpl getBankAccountServiceImpl() {
		return bankAccountServiceImpl;
	}

	public void setBankAccountServiceImpl(BankAccountServiceImpl bankAccountServiceImpl) {
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}

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
			System.out.println("The amount in account Id " + accountId + " after depositing Rs." + depositAmount + " is: Rs."
					+ (initialBalance + depositAmount));
		} else {
			System.out.println("The amount in account Id " + accountId + " after withdrawing Rs." + withdrawAmount + " is: Rs."
					+ (initialBalance - withdrawAmount));
		}
		sc.close();
		return 0;
	}

	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		return true;
	}

}
