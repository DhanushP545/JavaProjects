package bank;

import java.util.HashMap;

import Exceptions.AccountNotFoundException;
import Exceptions.InsufficientBalanceException;
import Exceptions.InvalidAmountException;

public class ATMService {
	private static HashMap<Integer, SavingsAccount> accounts = new HashMap<>();
	public static void displayMenu() {
		System.out.printf("\n===== ATM SIMULATION SYSTEM =====\n"
				+ "1. Create Account\n"
				+ "2. View Account\n"
				+ "3. Deposit Money\n"
				+ "4. Withdraw Money\n"
				+ "5. Transfer Funds\n"
				+ "6. Check Balance\n"
				+ "7. Show Total Accounts\n"
				+ "8. Exit\n");
	}
	public static void createAccount(String name, double initialBalance)throws InvalidAmountException {
		if(initialBalance<0)throw new InvalidAmountException();
		int accountNumber = generateAccountNumber();
		SavingsAccount account = new SavingsAccount(accountNumber,name,initialBalance);
		accounts.put(accountNumber, account);
		System.out.println("Account creation successful.. Account number - "
				+ accountNumber);
			
	}
	public static void viewAccount(int accountNumber) throws AccountNotFoundException{
		if(exists(accountNumber)) {
			BankAccount account = accounts.get(accountNumber);
			System.out.printf("\nDetails..\n"
					+ "Name: "+ account.getAccountHolderName()
					+ "\nBalance: "+ account.balance
					+ "\nAccount Number: "+account.getAccountNumber());
		}
	}
	public static void depositMoney(int accountNumber, double amount) throws InvalidAmountException, AccountNotFoundException{
		if(exists(accountNumber)) {
			accounts.get(accountNumber).deposit(amount);
			System.out.println("Amount deposited.. Current balance : "+accounts.get(accountNumber).balance);
		}
	}
	public static void withDrawMoney(int accountNumber ,double amount) throws AccountNotFoundException, InsufficientBalanceException{
		if(exists(accountNumber)) {
			accounts.get(accountNumber).withdraw(amount);
			System.out.println("Withdraw success.. Current balance : "+accounts.get(accountNumber).balance);
		}
		
	}
	public static void transferFunds(int acn1, int acn2, double amount) throws AccountNotFoundException, InsufficientBalanceException, InvalidAmountException {
		if(exists(acn1)&&exists(acn2)) {
			if(amount<=0)throw new InvalidAmountException();
			if(accounts.get(acn1).checkBalance()<amount)throw new InsufficientBalanceException();
			SavingsAccount sa1 = accounts.get(acn1);
			SavingsAccount sa2 = accounts.get(acn2);
			sa1.withdraw(amount);
			sa2.deposit(amount);
			System.out.println("Transfer Success");
		}
	}
	public static void checkBalance(int accountNumber) throws AccountNotFoundException{
		if(exists(accountNumber)) {
			System.out.println("Your current balance is... "+ accounts.get(accountNumber).checkBalance());
		}
	}
	public static void showTotalAccounts() {
		System.out.println("Total accounts currently... "+accounts.size());
	}
	public static boolean exists(int accountNumber) throws AccountNotFoundException{
		if(!accounts.containsKey(accountNumber))throw new AccountNotFoundException(accountNumber);
		return true;
	}
	public static int generateAccountNumber() {
		int acn = (int)(Math.random()*8999)+1000;
		while(accounts.containsKey(acn))acn = generateAccountNumber();
		return acn;
	}
}
