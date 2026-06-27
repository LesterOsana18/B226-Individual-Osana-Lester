// Activity 5: For-Loop (Progression Plan)
package day9.activity;

import java.util.Scanner;

public class Activity9_Osana {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Activity 5.1 - Summation of 1 to N
		int sum = 0;
		
		System.out.println("--- Activity 5.1: Summation of 1 to N ---");
		System.out.print("Enter a number: ");
		int firstNum = input.nextInt();
		
		// Loop to get the sum per iteration
		for (int i = 1; i <= firstNum; i++) {
			sum += i; // Shorthand for sum = sum + i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		
		// Print the final sum
		System.out.println("Final Sum: " + sum);
		
		// Activity 5.2 - Product of 1 to N
		int product = 1;
		
		System.out.println("\n--- Activity 5.2: Product of 1 to N ---");
		System.out.print("Enter a number: ");
		int secondNum = input.nextInt();
		
		// Loop to get the product per iteration
		for (int i = 1; i <= secondNum; i++) {
			product *= i; // Shorthand for product = product * i;
			System.out.println("i = " + i + ", product = " + product);
		}
		
		// Print the final product
		System.out.println("Final Product: " + product);
		
		// Activity 5.3 - Arithmetic Sequence (Sum Only)
		System.out.println("\n--- Activity 5.3: Arithmetic Sequence (Sum Only) ---");
		System.out.print("Enter the starting number: ");
		int startNum1 = input.nextInt();
		
		System.out.print("Enter the common difference: ");
		int commonDiff1 = input.nextInt();
		
		System.out.print("Enter the number of terms (n): ");
		int terms1 = input.nextInt();
		
		int currentSum = 0;
		int currentTerm = startNum1;
		
		for (int i = 1; i <= terms1; i++) {
			currentSum += currentTerm;
			if (i == terms1) {
				System.out.print(currentTerm);
			} else {
				System.out.print(currentTerm + " + ");
			}
			currentTerm += commonDiff1;
		}
		System.out.println(" = " + currentSum);
		
		// Activity 5.4 - Arithmetic Sequence (Sum and Product)
		System.out.println("\n--- Activity 5.4: Arithmetic Sequence (Sum and Product) ---");
		System.out.print("Enter the starting number: ");
		int startNum2 = input.nextInt();
		
		System.out.print("Enter the common difference: ");
		int commonDiff2 = input.nextInt();
		
		System.out.print("Enter the number of terms (n): ");
		int terms2 = input.nextInt();
		
		int currentSum = 0;
		int currentTerm = startNum1;
		
		for (int i = 1; i <= terms1; i++) {
			currentSum += currentTerm;
			if (i == terms1) {
				System.out.print(currentTerm);
			} else {
				System.out.print(currentTerm + " + ");
			}
			currentTerm += commonDiff1;
		}
		System.out.println(" = " + currentSum);
		
		// Close the Scanner object after using
		input.close();
	}

}
