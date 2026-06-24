// Activity 3: Java Logical and Ternary Operators
package day6.activity;

public class Activity3_Osana {

	public static void main(String[] args) {
		// Is the person allowed to enter the event?
		int age = 20;
		boolean hasValidID = true;
		
		// Evaluate if the person is allowed to enter the event
		String personAllowed = (age >= 18 && hasValidID) 
				? "Access Granted" 
				: "Permission Denied";
		
		System.out.println(personAllowed); // Print result 
		
		// Are there classes today?
		boolean isWeekend = true;
		boolean isHoliday = false;
		
		// Check if there are classes today 
		String status = (isWeekend || isHoliday) 
				? "No Classes Today" 
				: "We Have Class Today";
		
		System.out.println(status); // Print result
		
		// Did the student pass or fail?
		int score = 85;
		
		// Evaluate the grade of the student
		String scoreResult = score >= 75 ? "Passed" : "Failed";
		System.out.println(scoreResult); // Print result
		
		// What is the larger number?
		int num1 = 10;
		int num2 = 25;
		
		// Find the larger number
		int max = (num1 > num2) ? num1 : num2;
		System.out.println("The larger number is: " + max); // Print result
		
		// Bonus Goal: Odd or Even Number?
		int num = 18;
		
		// Check whether the given number is even or odd
		String result = (num % 2 == 0) ? "Even" : "Odd";
		System.out.println(result); // Print result
		
	}

}
