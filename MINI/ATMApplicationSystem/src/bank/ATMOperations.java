package bank;
import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;

public interface ATMOperations {
	boolean deposit(double amount) throws InvalidAmountException;
	boolean withdraw(double amount) throws InsufficientBalanceException;
	double checkBalance();
}
