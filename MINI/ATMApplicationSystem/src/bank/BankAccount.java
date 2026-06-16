package bank;

public abstract class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	protected double balance;
	public BankAccount() {
		//default constructor
	}
	public BankAccount(int accountNumber, String accountHolderName, double
			balance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	
}
