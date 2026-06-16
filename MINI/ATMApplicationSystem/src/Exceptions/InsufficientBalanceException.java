package Exceptions;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(){
		super("Insufficient Funds");
	}
}
