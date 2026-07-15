// Activity 15: Accounting Transactions (Abstraction)
package day24.activity;

public abstract class Account  {
	
	// Initialize private fields (encapsulation)
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	// Parameterized constructor
	public Account(String accountNumber, String accountHolder, double balance) {
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	// Setter (Mutator) Methods
	public void setBalance(double balance) {
		this.balance = balance; // Only balance needs to change
	}
	
	// Getter (Accessor) Methods
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	// Method to display account information
	public abstract void displayAccountInfo(); // Subclasses must implement
}
