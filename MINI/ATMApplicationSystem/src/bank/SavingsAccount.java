package bank;
import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;

public class SavingsAccount extends BankAccount implements ATMOperations {
	
	public SavingsAccount(int accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public boolean deposit(double amount) throws InvalidAmountException{
		if(amount<=0) {
			throw new InvalidAmountException();
		}
		balance += amount;
		return true;
	}

	@Override
	public boolean withdraw(double amount) throws InsufficientBalanceException{
		if(amount>balance) {
			throw new InsufficientBalanceException();
		}
		balance -= amount;
		return true;
	}

	@Override
	public double checkBalance() {
		return balance;
	}
	
}
