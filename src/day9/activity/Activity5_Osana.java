// Activity 5: For-Loop (Progression Plan)
package day9.activity;

import java.util.Scanner;

public class Activity5_Osana {

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
		long product = 1;
		
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
		int startNum = input.nextInt();
		
		System.out.print("Enter the common difference: ");
		int commonDiff = input.nextInt();
		
		System.out.print("Enter the number of terms (n): ");
		int terms = input.nextInt();
		
		int currentSum = 0;
		int currentTerm = startNum;
		
		// For loop to get the sum per each iteration
		for (int i = 1; i <= terms; i++) {
			currentSum += currentTerm;
			if (i == terms) {
				System.out.print(currentTerm);
			} else {
				System.out.print(currentTerm + " + ");
			}
			currentTerm += commonDiff;
		}
		
		// Print out the result
		System.out.println(" = " + currentSum);
		
		// Activity 5.4 - Arithmetic Sequence (Sum and Product)
		System.out.println("\n--- Activity 5.4: Arithmetic Sequence (Sum and Product) ---");
		System.out.print("Enter the starting number: ");
		startNum = input.nextInt();
		
		System.out.print("Enter the common difference: ");
		commonDiff = input.nextInt();
		
		System.out.print("Enter the number of terms (n): ");
		terms = input.nextInt();
		
		long currentProduct = 1;
		currentSum = 0;
		currentTerm = startNum;
		
		// For loop for calculating SUM
		System.out.print("Sum: ");
		for (int i = 1; i <= terms; i++) {
			currentSum += currentTerm;
			
			if (i == terms) {
				System.out.print(currentTerm);
			} else {
				System.out.print(currentTerm + " + ");
			}
			
			currentTerm += commonDiff;
		}
		
		// Print out the result
		System.out.println(" = " + currentSum);
		
		// Reset the sequence
		currentTerm = startNum;
		
		// For loop for calculating PRODUCT
		System.out.print("Product: ");
		for (int i = 1; i <= terms; i++) {
			currentProduct *= currentTerm;
			
			if (i == terms) {
				System.out.print(currentTerm);
			} else {
				System.out.print(currentTerm + " * ");
			}
			
			currentTerm += commonDiff;
		}
		
		// Print out the result
		System.out.println(" = " + currentProduct);
		
		// Close the Scanner object after using
		input.close();
	}

}
