// Activity 15: Accounting Transactions (Abstraction)
package day24.activity;

public class Main {
	
	public static void main(String[] args) {
		
		// Create a Savings Account object
		SavingsAccount savingsAccount = new SavingsAccount("SA123", "Jareth", 1000.00, 3.5);
		savingsAccount.displayAccountInfo();
		savingsAccount.deposit(500);
		savingsAccount.withdraw(200);
		
		// Create a Checking Account object
		CheckingAccount checkingAccount = new CheckingAccount("CA456", "Maria", 2000.00, 1000.00);
		checkingAccount.displayAccountInfo();
		checkingAccount.deposit(1000);
		checkingAccount.withdraw(3500);
		
	}
	
}
