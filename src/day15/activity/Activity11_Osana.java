// Activity 11: Lotto Generator - Remove All Duplicate Numbers
package day15.activity;

public class Activity11_Osana {

	public static void main(String[] args) {
		// Lotto Simulator
		System.out.println("============================================");
		System.out.println("||         LOTTO NUMBER GENERATOR         ||");
		System.out.println("============================================\n");
		System.out.println("Lotto Numbers (1-58): ");
		
		// Array to store the 6 unique numbers
		int[] uniqueNumbers = new int[6];
		
		// Counter to keep track of how many valid numbers we have stored
		int count = 0;
		
		// Continue this process until you have exactly 6 unique numbers
		while (count < 6) {
			
			// Generate a random number from 1 to 58
			int randomNumber = (int) (Math.random() * 58) + 1;
			
			// Flag to keep track of whether the number already exists
			boolean isDuplicate = false;
			
			// Logic to check if the newly generated number already exists among previous numbers
			for (int i = 0; i < count; i++) {
				if (uniqueNumbers[i] == randomNumber) {
					isDuplicate = true; // Found a duplicate!
					break;              // Stop checking the rest of the array
				}
			}
			
			// If the number is unique, add it to our array and display it
			if (!isDuplicate) {
				uniqueNumbers[count] = randomNumber;
				System.out.println("[" + (count + 1) + "]: " + randomNumber);
				count++; // Move to the next slot only when a unique number is saved
			}
			// If it's a duplicate, the loop naturally runs again without incrementing count
		}
	}

}
