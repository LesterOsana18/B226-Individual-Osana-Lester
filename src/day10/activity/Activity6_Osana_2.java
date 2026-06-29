package day10.activity;

public class Activity6_Osana_2 {

	public static void main(String[] args) {
		// Outer loop controls which multiplication table is being printed (e.g., 1 to 10)
        for (int tableNumber = 1; tableNumber <= 10; tableNumber++) {
            
            System.out.println("Multiplication Table of " + tableNumber);
            
            // Inner loop controls the multiplier (1 to 10) for the current table
            for (int i = 1; i <= 10; i++) {
                System.out.println(tableNumber + " * " + i + " = " + (tableNumber * i));
            }
            
            // Prints a blank line between tables for clean formatting
            System.out.println();
        }
	}

}
