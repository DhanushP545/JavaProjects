package Exceptions;

@SuppressWarnings("serial")
public class AccountNotFoundException extends Exception{
	public AccountNotFoundException(int accountNumber) {
		super(accountNumber + " - Account not found");
	}
}
