package weekOneCTA;

import java.util.Scanner;


public class TestingBank {
	public static void main(String[] args) {
		System.out.println("To start new Account... \nEnter First Name, Last Name, and starting Balance($) : ");
		Scanner scnr = new Scanner(System.in);
        String namefirst1 = scnr.nextLine();
        String namelast1 = scnr.nextLine();
        double accountBalance = scnr.nextDouble();
        scnr.close();
        
	    CheckingAccount checkAcc = new CheckingAccount(namefirst1, namelast1, 28474, accountBalance, 0.11);
	    
	    System.out.println("Account Summary: ");
	    System.out.println("First Name: " + checkAcc.getNameFirst());
	    System.out.println("Last Name: " + checkAcc.getNameLast());
	    System.out.println("Account ID: " + checkAcc.getAccountID());
	    System.out.println("Balance: $" + checkAcc.getBalance());
	    System.out.println("Interest Rate: " + checkAcc.getInterestRate());
	    
	    System.out.println("\nMaking a deposit of $250...");
	    checkAcc.accountDeposit(250);
	    System.out.println("Balance: $" + checkAcc.getBalance());
	    
	    System.out.println("\nMaking a withdrawal for rent of $1135...");
	    checkAcc.processWithdrawal(1135);
	    System.out.println("New balance: $" + checkAcc.getBalance());
	    
	    System.out.println("\nDisplaying account information...");
	    checkAcc.displayCheckingAccount();
	  }
	}

