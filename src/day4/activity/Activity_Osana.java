/* Activity 1: Exploring Java Data Types and Variables in Java
 * 
 * Objective: Gain hands-on experience with different data types in Java.
 * 
 * */
package day4.activity;

public class Activity_Osana {

	public static void main(String[] args) {
		
		// Initialization of variables
		boolean isPresent = true;
		byte firstNum = 22;
		short secondNum = 300;
		int thirdNum = 30000;
		long fourthNum = 400_000_000l;
		float roomTemperature = 23.36f;
		double generalAverage = 98.125679;
		char selectedLetter = 'S';
		String courseName = "Programming (Java) NC III";
		
		// Printing out the values
		
		// Boolean data type
		System.out.println("This uses a boolean data type as an example.");
		System.out.println("Am I present in today's class? The answer is " + isPresent + ".\n");
		
		// Byte data type
		System.out.println("This uses a byte data type as an example.");
		System.out.println("I am " + firstNum + " years old.\n");
		
		// Short data type
		System.out.println("This uses a short data type as an example.");
		System.out.println("My daily allowance back in college was " + secondNum + ".\n");
		
		// Int data type 
		System.out.println("This uses an int data type as an example.");
		System.out.println("My expected salary as a fresh graduate is " + thirdNum + ".\n");
		
		// Long data type 
		System.out.println("This uses a long data type as an example.");
		System.out.println("Around the amount of " + fourthNum + " was corrupted by politicians this year.\n");
		
		// Float data type 
		System.out.println("This uses a float data type as an example.");
		System.out.println("The room temperature at the coffee shop is " + roomTemperature + ".\n");
		
		// Double data type
		System.out.println("This uses a double data type as an example.");
		System.out.println("My general average back in Senior High School was around " + generalAverage + ".\n");
		
		// Char data type
		System.out.println("This uses a char data type as an example.");
		System.out.println("My favorite letter is " + selectedLetter + ".\n");
		
		// String data type
		System.out.println("This uses a String data type as an example.");
		System.out.println("I am currently taking a course under Joysis Tech Voc Inc., which is " + courseName + ".");

	}

}
