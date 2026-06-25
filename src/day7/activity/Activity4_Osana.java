// Activity 4: If Statement in Java
package day7.activity;

import java.util.Scanner;

public class Activity4_Osana {

	public static void main(String[] args) {
		// Sample Game Menu Program
		
		// Create a Scanner object
		Scanner userInput = new Scanner(System.in);
		
		// Create the menu layout using print statements
		System.out.println("=== Main Menu ===");
		System.out.println("1. Start Game");
		System.out.println("2. Load Game");
		System.out.println("3. Settings");
		System.out.println("4. Exit");
		
		// Ask user for input
		System.out.print("Enter your choice (1-4): ");
		int choice = userInput.nextInt(); // int input
		
		// Evaluate user input using If-Else statements
		if (choice == 1) {
			System.out.println("\nYou selected Option 1: Start Game");
		} 
		else if (choice == 2) {
			System.out.println("\nYou selected Option 2: Load Game");
		} 
		else if (choice == 3) {
			System.out.println("\nYou selected Option 3: Settings");
		} 
		else if (choice == 4) {
			System.out.println("\nYou selected Option 4: Exit");
		} 
		else {
			// Error statement for invalid inputs
			System.out.println("\nInvalid choice. Please try again.");
		}
		
		// Close the Scanner object after using it
		userInput.close();
	}

}
