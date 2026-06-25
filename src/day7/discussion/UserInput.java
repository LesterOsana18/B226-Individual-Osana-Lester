package day7.discussion;

import java.util.*;

public class UserInput {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name = input.nextLine(); // String input

		System.out.print("Enter age: ");
		int age = input.nextInt(); // int input
		
		System.out.print("Enter salary: ");
		double salary = input.nextDouble(); // double input
		
		// Print the input of user
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.printf("Salary: %,.0f", salary);
		
		input.close();
	}

}
