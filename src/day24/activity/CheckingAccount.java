// Activity 15: Accounting Transactions (Abstraction)
package day24.activity;

public class CheckingAccount extends Account implements Transaction {

	// Stores the overdraft limit of the checking account
	private double overdraftLimit;

	// Initializes a Checking Account with its account details and overdraft limit
	public CheckingAccount(String accountNumber, String accountHolder,
			double balance, double overdraftLimit) {
		
		super(accountNumber, accountHolder, balance);
		this.overdraftLimit = overdraftLimit;
	}

	// Displays the details of the checking account
	@Override
	public void displayAccountInfo() {

		System.out.println("\n--- Checking Account Info ---");
		System.out.println("Account Number: " + getAccountNumber());
		System.out.println("Account Holder: " + getAccountHolder());
		System.out.printf("Balance: ₱%.2f\n", getBalance());
		System.out.printf("Overdraft Limit: ₱%.2f\n", overdraftLimit);
	}

	// Deposits money into the checking account
	@Override
	public void deposit(double amount) {

		double newBalance = getBalance() + amount;
		setBalance(newBalance);

		System.out.printf("\nDeposited ₱%.2f into Checking Account.\n", amount);
		System.out.printf("New Balance: ₱%.2f\n", getBalance());
	}

	// Withdraws money from the checking account
	@Override
	public void withdraw(double amount) {

		double availableFunds = getBalance() + overdraftLimit;

		if (amount <= availableFunds) {

			double newBalance = getBalance() - amount;
			setBalance(newBalance);

			System.out.printf("\nWithdrew ₱%.2f from Checking Account.", amount);

			if (newBalance < 0) {
				System.out.println("\nTransaction allowed using overdraft.");
			}

			System.out.printf("Remaining Balance: ₱%.2f", getBalance());

		} else {

			System.out.println("\nInsufficient funds!");
			System.out.println("Transaction cancelled...");
		}
	}
}