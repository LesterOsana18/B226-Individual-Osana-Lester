package day10.activity;

import java.util.Scanner;

public class Activity6_Osana_1 {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for input
        System.out.print("Enter the multiplication table you want to display: ");
        int tableNumber = input.nextInt();
        
        System.out.println("\nMultiplication Table of " + tableNumber);
        
        // Display the selected multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
        }
        
        // Close the Scanner after use
        input.close();
	}
}
