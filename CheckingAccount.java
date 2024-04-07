package weekOneCTA;

//interest rate attribute, allows overdraft 
//methods process withdrawal and display account 
public class CheckingAccount extends BankAccount {
	
	private double interestRate;
	
	public CheckingAccount(String namelast, String namefirst, int accountID, double accountBalance, double interestRate) {
		super(namelast, namefirst, accountID, accountBalance);
		this.interestRate = interestRate;
	}
	 public double getInterestRate() {
		return interestRate;
	}
	 public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void processWithdrawal(double total) {
		if (total > this.getBalance()) {
			System.out.println("Funds not available, $30 fee added to account");
			this.withdrawalAccount(total);
		} else {
			this.withdrawalAccount(total);
		}
	}
	public void displayCheckingAccount() {
		System.out.println("Checking Account Info for: " + this.getNameLast() + "," + this.getNameFirst());
		System.out.println("Account ID #: " + this.getAccountID());
		System.out.println("Account Balance $ : " + this.getBalance());
		System.out.println("Interest Rate: " + interestRate);
		
	}

}
