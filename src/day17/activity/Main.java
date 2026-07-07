// Activity 13: Intro to Object-Oriented Programming (OOP)
package day17.activity;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Create a Scanner object for user input
		Scanner input = new Scanner(System.in);
		
		// Create an array that can store three Laptop objects
		Laptop[] laptops = new Laptop[3];
		
		// Instantiate each Laptop object in the array
		for (int i = 0; i < laptops.length; i++) {
			laptops[i] = new Laptop();
		}
		
		// Tracks which laptop is currently being filled with user input
		int laptopCount = 0;
		
		// Collect information for all three laptops
		do {
			if (laptopCount == 0) {
				System.out.println("Laptop #" + (laptopCount + 1));
			} else {
				System.out.println("\n-------------------------------------------\n");
				System.out.println("Laptop #" + (laptopCount + 1));
			}
			
			System.out.print("Brand: ");
			laptops[laptopCount].brand = input.nextLine();
			
			System.out.print("Build: ");
			laptops[laptopCount].build = input.nextLine();
			
			System.out.print("Color: ");
			laptops[laptopCount].color = input.nextLine();
			
			System.out.print("RAM: ");
			laptops[laptopCount].memory = input.nextInt();
			input.nextLine(); // Consume the newline left by nextInt()
			
			System.out.print("Size: ");
			laptops[laptopCount].size = input.nextInt();
			input.nextLine(); // Consume the newline left by nextInt()
			
			laptopCount++;
			
		} while (laptopCount < laptops.length);
		
		System.out.println("\n-------------------------------------------");
		
		// Display the specifications of each Laptop object
		for (int i = 0; i < laptops.length; i++) {

		    System.out.println("\n===========================");
		    System.out.println("Laptop #" + (i + 1));
		    System.out.println("===========================");

		    laptops[i].displayInfo();
		}
		
		System.out.println("\n-------------------------------------------");
		
		// Let the user choose which laptop to interact with
		int selectedLaptop;
		
		// Repeat until the user selects a valid laptop number
		do {
			System.out.print("\nChoose Laptop (1-3): ");
			selectedLaptop = input.nextInt();
		} while (selectedLaptop < 1 || selectedLaptop > laptops.length);
		
		// Store the chosen Laptop object for easier access
		Laptop selected = laptops[selectedLaptop - 1];
		
		// Stores the user's selected action from the menu
		int menuChoice;
		
		// Continue showing the menu until the user chooses to exit
		do {
			System.out.println("\n-------------------------------------------");
			System.out.println("What do you want to do today?");
			System.out.println("[1] Study\n[2] Watch\n[3] Game\n[4] Work\n[5] Exit");
			System.out.print("Select your choice: ");
			menuChoice = input.nextInt();
			System.out.println("-------------------------------------------\n");
			
			// Execute the selected behavior of the chosen Laptop object
			switch (menuChoice) {
			case 1:
				selected.study();
				break;
			case 2: 
				selected.watch();
				break;
			case 3: 
				selected.game();
				break;
			case 4: 
				selected.work();
				break;
			case 5:
				System.out.println("Exiting program...");
				System.out.println("Thank you!");
				break;
			default: 
				System.out.println("Error detected. Invalid input.");
			}
		} while (menuChoice != 5);
		
		// Close the Scanner to free system resources
		input.close();
	}
}
