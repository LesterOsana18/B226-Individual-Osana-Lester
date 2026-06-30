// Activity 7: Single-Dimensional Array
package day11.activity;

import java.util.Scanner;

public class Activity7_Osana {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Declare a single-dimensional array of 5 integers
        int[] numbers = new int[5];
        int sum = 0;
        
        // Ask the user to input 5 numbers
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < numbers.length; i++) {
        	System.out.print("Number " + (i + 1) + ": ");
        	numbers[i] = scanner.nextInt();
        	
        	// Accumulate the sum while collecting inputs
        	sum += numbers[i];
        }
        
        // Display all the numbers entered with their index
        System.out.println("\nYou entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }
        
        // Compute and display the sum and average
        double average = (double) sum / numbers.length;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);
		
        // Stretch goal
        // Initialize highest and lowest with the first element of the array
        int highest = numbers[0];
        int lowest = numbers[0];
        
        // Loop through the array to find max and min values
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
            if (numbers[i] < lowest) {
                lowest = numbers[i];
            }
        }
        
        // Display highest and lowest numbers
        System.out.println("\n--- STRETCH GOAL ---");
        System.out.println("Highest Number = " + highest);
        System.out.println("Lowest Number = " + lowest);
        
        // Close Scanner after use
        scanner.close();
	}

}
