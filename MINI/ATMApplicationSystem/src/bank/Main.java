package bank;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int acn;
		double bal;//amount would be better name
		while(choice !=8) {
			ATMService.displayMenu();
			System.out.println("Enter your Choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1:
				System.out.printf("\n===Create Account===\n");
				System.out.println("Enter name: ");String name = sc.nextLine();
				System.out.println("Enter initial balance: ");bal = sc.nextDouble();sc.nextLine();
				try {
					ATMService.createAccount(name, bal);
				}catch(Exception e) {//all exceptions just need to display message
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.printf("\n===View Account===\n");
				System.out.println("Enter account number: ");acn = sc.nextInt();sc.nextLine();
				try {
					ATMService.viewAccount(acn);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.printf("\n=== Deposit ===\n");
				System.out.println("Enter account number: ");acn = sc.nextInt();sc.nextLine();
				System.out.println("Enter amount : ");bal = sc.nextDouble();sc.nextLine();
				try {
					ATMService.depositMoney(acn, bal);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				System.out.printf("\n=== Withdraw ===\n");
				System.out.println("Enter account number: ");acn = sc.nextInt();sc.nextLine();
				System.out.println("Enter amount : ");bal = sc.nextDouble();sc.nextLine();
				try {
					ATMService.withDrawMoney(acn, bal);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				System.out.printf("\n=== Transer funds ===\n");
				System.out.println("Enter your account number: ");acn = sc.nextInt();sc.nextLine();
				System.out.println("Enter receiver account number: ");int acn2 = sc.nextInt();sc.nextLine();
				System.out.println("Enter amount : ");bal = sc.nextDouble();sc.nextLine();
				try {
					ATMService.transferFunds(acn,acn2,bal);
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 6:
				System.out.printf("\n=== Check Balance ===\n");
				System.out.println("Enter account number: ");acn = sc.nextInt();sc.nextLine();
				try {
					ATMService.checkBalance(acn);
				}catch(Exception e) {
					System.out.println(e.getMessage());
					System.out.println("Transfer failed");
				}
				break;
			case 7:
				System.out.printf("\n=== Total accounts ===\n");
				try {
					ATMService.showTotalAccounts();
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:
				System.out.printf("\nExiting.... \n");
				break;
			default:
				System.out.println("Choose valid option 1-8");
				
			}
			
		}
		sc.close();
	}
}
