package weekOneCTA;

//string first last accountID and balance as double
//constructor, deposit method, withdrawal method, getBalance method, accountSummary method
//setters and getters for first, last and account ID

public class BankAccount {
	
	private String namefirst, namelast;
	private int accountID;
	private double accountBalance;
	
	public BankAccount() {
		this.accountBalance = 0;
	}
	
	public BankAccount(String namefirst, String namelast, int accountID, double accountBalance) {
		this.namefirst = namefirst;
		this.namelast = namelast;
		this.accountID = accountID;
		this.accountBalance = accountBalance;
		
	}
	
	public void withdrawalAccount(double total) {
		this.accountBalance -= total;
	}
	public void accountDeposit(double total) {
		this.accountBalance += total;
	}
	
	//getters and such-ers
	public String getNameLast() {
		return namelast;
	}
	
	public void setNameLast(String namelast) {
		this.namelast = namelast;
	}
	
	public String getNameFirst() {
		return namefirst;
	}
	
	public void setNameFirst(String namefirst) {
		this.namefirst = namefirst;
	}
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;	
	}
	public double getBalance() {
		return accountBalance;
	}
	public void accountPersonSum() {
		System.out.println("Account Info");
		System.out.println("Last, First : " + namelast + namefirst);
		System.out.println("Account Identifier Number: " + accountID);
		System.out.println("Account Balance: " + accountBalance);
	}

}
