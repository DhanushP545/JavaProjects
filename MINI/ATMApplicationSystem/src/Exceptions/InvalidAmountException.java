package Exceptions;

@SuppressWarnings("serial")
public class InvalidAmountException extends Exception{
	public InvalidAmountException(){
		super("Deposit Amount should be greater than 0");
	}
}
