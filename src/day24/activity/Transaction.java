// Activity 15: Accounting Transactions (Abstraction)
package day24.activity;

public interface Transaction {

    // Every Account should be able to perform these transactions
    void deposit(double amount);
    void withdraw(double amount);
    
}
