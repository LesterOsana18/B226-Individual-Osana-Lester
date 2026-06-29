package day10.discussion;

import java.util.Scanner;

public class InfiniteLoop {

    public static void main(String[] args) {
        // When to use Do-While: if you must execute the loop at least once
        String color = "Black";
        do {
            System.out.println(color);
        } while (color.equals("White"));
        
        // Syntax for do-while loop (Menu Example)
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Main Menu ===");
            System.out.println("    [1] Start Game");
            System.out.println("    [2] Load Game");
            System.out.println("    [3] Settings");
            System.out.println("    [4] Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
        } while (choice != 4); // Keep looping until user chooses Exit

        input.close(); // Close the Scanner to free resources
        
        /*
         * Common Real-World Uses of Do-While:
         * - Menu-driven programs
         * - User input validation
         * - Repetitive tasks with guaranteed first run (e.g., "Do you want to continue?")
         */
    }
}
