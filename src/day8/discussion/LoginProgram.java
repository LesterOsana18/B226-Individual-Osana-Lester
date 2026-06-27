package day8.discussion;

import java.util.Scanner;

public class LoginProgram {

	public static void main(String[] args) {
		// User Login Program
		
		// Predefined username and password (hardcoded for demo purposes)
        String username = "admin";
        String password = "admin123";

        // Create Scanner object to accept input from the user
        Scanner input = new Scanner(System.in);

        System.out.println("* Login *");
        System.out.print("Enter username: "); // Ask user for username
        String loginUsername = input.nextLine(); // Read user input and stores it to loginUsername variable

        System.out.print("Enter password: "); // Ask user for password
        String loginPassword = input.nextLine(); // Read user input and stores it to loginPassword variable

        // Check if both username and password match the predefined values
        if (loginUsername.equals(username) && loginPassword.equals(password)) {
            System.out.println("Login successful! Welcome, " + username);
        } else {
            System.out.println("Login Failed. Invalid username or password.");
        }

        // Close the scanner
        input.close();
	}

}
