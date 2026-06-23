// Activity 2: Expense Tracker Program
package day5.activity;

public class Activity2_Osana {

	public static void main(String[] args) {
		// Initialize the variables
		double income = 50_000;
		double foodAllowance = 15_000;
		double transportation = 2500;
		double rent = 4500;
		double utilityBill = 3500;
		
		// Calculate the percentage of each expense relative to the total income
		double foodPercentage = (foodAllowance / income) * 100;
		double transpoPercentage = (transportation / income) * 100;
		double rentPercentage = (rent / income) * 100;
		double utilityPercentage = (utilityBill / income) * 100;
		
		// Deduct all expenses from the income to obtain the remaining balance
		double remainingBalance = income - (foodAllowance + transportation + rent + utilityBill); // Remaining balance formula
		
		// Print statements
		System.out.printf("Income: %,.0f%n", income);
		System.out.printf("Food Allowance: %.1f %%%n", foodPercentage);
		System.out.printf("Transportation: %.1f %%%n", transpoPercentage);
		System.out.printf("Rent: %.1f %%%n", rentPercentage);
		System.out.printf("Utility Bill: %.1f %%%n", utilityPercentage);
		System.out.printf("Remaining Balance: %,.0f", remainingBalance);
	}

}
