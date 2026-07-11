// Activity 14: User Account Registration
// Encapsulation & User Input
package day21.activity;

import java.util.Scanner;

public class Main {
	
	// Create a global Scanner object for user input
	static Scanner input = new Scanner(System.in);
	
	// Create the UserAccount object
	static UserAccount userAccount;
	
	// Main method
	public static void main(String[] args) {
		
		// Prompt user for their details
		inputUserInformation();
		
		// Display the user's information
		printUserInformation();
		
		// Close the Scanner object after use
		input.close();
	}
	
	// Read required user input and prevent empty values
	public static String readInput(String prompt) {
		
		while (true) {
			
			System.out.print(prompt);
			String value = input.nextLine().trim();
			
			if (!value.isEmpty()) {
				return value;
			}
			
			System.out.println("\n*******************************");
	        System.out.println("This field cannot be empty.");
	        System.out.println("Please try again.");
	        System.out.println("*******************************\n");
		}
	}
	
	// Read optional user input without requiring a value
	public static String readOptionalInput(String prompt) {
		System.out.print(prompt);
		return input.nextLine().trim();
	}
	
	// Create a method to validate user's email
	public static String validateUserEmail() {

	    while (true) {

	        System.out.print("Enter Email: ");
	        String email = input.nextLine().trim();

	        if (email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
	            return email;
	        }
	        
        	System.out.println("\n*******************************");
	        System.out.println("Invalid email format.");
	        System.out.println("Please try again.");
			System.out.println("*******************************\n");
			
	    }

	}
	
	// Create a method to validate user's password
	public static String validateUserPassword() {

	    while (true) {

	        System.out.print("Enter Password: ");
	        String password = input.nextLine().trim();
	        
	        // Set conditions for a valid password format
	        if (password.length() >= 8 &&
	                password.matches(".*\\d.*") &&
	                password.matches(".*[^a-zA-Z0-9].*")) {

	            return password;

	        }
	        
			System.out.println("\n*******************************");
	        System.out.println("Password must:");
	        System.out.println("- contain at least 8 characters");
	        System.out.println("- contain at least one number");
	        System.out.println("- contain at least one special character");
			System.out.println("*******************************\n");

	    }

	}
	
	// Create a method to prompt user for the required information
	public static void inputUserInformation() {
		// Print the header of the program
		System.out.println("*******************************");
	    System.out.println("*  User Account Registration  *");
	    System.out.println("*******************************\n");
	    
	    String firstName = readInput("Enter First Name: ");
	    String middleName = readOptionalInput("Enter Middle Name (Optional): ");
	    String lastName = readInput("Enter Last Name: ");
	    String address = readInput("Enter Address: ");
	    String email = validateUserEmail();
	    String password = validateUserPassword();
	    
	    userAccount = new UserAccount(
	    		firstName,
	    		middleName,
	    		lastName,
	    		address,
	    		email,
	    		password);
	}
	
	// Create a method to display the user information
	public static void printUserInformation() {
		
		String fullName;
		
	    System.out.println("\n--- User Account Created ---");
	    
	    if (userAccount.getMiddleName().isBlank()) {
	    	
	    	fullName = userAccount.getFirstName() + " " + userAccount.getLastName();
	    	
	    } else {
	    	
	    	fullName = userAccount.getFirstName() 
	    			+ " "
	    			+ userAccount.getMiddleName()
	    			+ " "
	    			+ userAccount.getLastName();
	    }
	    
	    System.out.println("Full Name: " + fullName);
	    
	    System.out.println("Address: " + userAccount.getAddress());

	    System.out.println("Email: " + userAccount.getEmail());

	}
}
