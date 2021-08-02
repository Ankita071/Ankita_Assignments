package assignment4.Test;

import org.springframework.stereotype.Component;

@Component
public class BankAccountRepositoryImpl implements BankAccountRepository {
	double initialBalance=100000;
	
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
