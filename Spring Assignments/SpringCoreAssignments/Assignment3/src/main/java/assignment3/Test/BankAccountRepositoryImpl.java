package assignment3.Test;

public class BankAccountRepositoryImpl implements BankAccountRepository {
	double initialBalance;
	
	public BankAccountRepositoryImpl() {
	}
	
	public double getInitialBalance() {
		return initialBalance;
	}
	
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	public BankAccountRepositoryImpl(double initialBalance) {
		this.initialBalance = initialBalance;
	}

	@Override
	public double getBalance(long accountId) {
		System.out.println("Balance of Account Id " + accountId + " is: " + initialBalance);
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		newBalance += initialBalance;
		System.out.println("Updated Balance of Account Id " + accountId + " is: " + newBalance);
		return 0;
	}

}
