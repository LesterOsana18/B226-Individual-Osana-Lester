// Activity 15: Accounting Transactions (Abstraction)
package day24.activity;

public class SavingsAccount extends Account implements Transaction {
	
	// Stores the interest rate specific to a Savings Account
	private double interestRate;
	
	// Initializes a Savings Account with its account details and interest rate
	public SavingsAccount(String accountNumber, String accountHolder, 
			double balance, double interestRate) {
		
		super(accountNumber, accountHolder, balance);
		this.interestRate = interestRate;
	}
	
	// Displays the details of the savings account
	@Override
	public void displayAccountInfo() {
		// Display the account information
		System.out.println("--- Savings Account Info ---");
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder: " + getAccountHolder());
		System.out.printf("Balance: ₱%.2f \n", getBalance());
		System.out.println("Interest Rate: " + interestRate + "%");
	}
	
	// Override method for depositing in a savings account
	@Override
	public void deposit(double amount) {
		double newBalance = getBalance() + amount;
		setBalance(newBalance);
		
		System.out.printf("\nDeposited ₱%.2f into Savings Account.\n", amount);
		System.out.printf("New Balance: ₱%.2f\n", newBalance);
	}
	
	// Override method for withdrawing in a savings account
	@Override
	public void withdraw(double amount) {
		if (getBalance() >= amount) {
			double newBalance = getBalance() - amount;
			setBalance(newBalance);
			System.out.printf("\nWithdrew ₱%.2f from Savings Account.\n", amount);
			System.out.printf("Remaining Balance: ₱%.2f\n", getBalance());
 		}
		
		else {
			System.out.println("Insufficient funds!");
			System.out.println("Transaction cancelled...");
		}
	}
}
