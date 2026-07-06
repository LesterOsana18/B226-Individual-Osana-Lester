// Activity 12: Java Methods (Return Type, Algorithm, & Problem-Solving)
package day16.activity;

public class Activity12_Osana {
	
	public static void main(String[] args) {
		System.out.println("================================================");
		System.out.println("||               Testing Methods              ||");
		System.out.println("================================================\n");
		
		// 1. Odd or Even
		System.out.println("------------------------------------------------");
		oddEven(18);
		System.out.println("------------------------------------------------");
		
		// 2. Print name 50 times
		printName("Lester");
		System.out.println("------------------------------------------------");
		
		// 3. Square Root
		System.out.println("The square root of 64 is " + squareRoot(64));
		System.out.println("------------------------------------------------");
		
		// 4. Power
		System.out.println("2 to the power of 5 is " + power(2, 5));
		System.out.println("------------------------------------------------");
		
		// 5. Random Number
		System.out.print("Random Number (1-100): ");
		randomNumber();
		System.out.println("------------------------------------------------");
		
		// 6. Area of a Circle
		System.out.println("Area of Circle with radius 5: " + areaOfCircle(5));
		System.out.println("------------------------------------------------");
		
		// 7. Voter Status
		voterStatus(19, true);
		System.out.println("------------------------------------------------");
		
		// 8. Word Length
		System.out.println("Length of 'Java': " + wordLength("Java"));
		System.out.println("------------------------------------------------");
		
		// 9. Reverse Word
		printReverse("Programming");
		System.out.println("------------------------------------------------");
		
		// 10. Full Name and Age Details
		details("Lester Osana", 22);
		System.out.println("------------------------------------------------");
		
	}
	
	// 1. Create a method to identify if a number is odd or even
	public static void oddEven(int number) {
		if (number % 2 == 0) {
			System.out.println(number + " is Even");
		} else {
			System.out.println(number + " is Odd");
		}
	}
	
	// 2. Create a method to print your name 50 times
	public static void printName(String name) {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + ". Hi, " + name + "!");
		}
	}
	
	// 3. Create a method to get the square root of a certain variable
	public static double squareRoot(int number) {
		return Math.sqrt(number);
	}
	
	// 4. Create a method to get the power of a number using base and exponent
	public static double power(int base, int exponent) {
		return Math.pow(base, exponent);
	}
	
	// 5. Create a method to print a random number between 1 and 100
	public static void randomNumber() {
		int numRange = (int)(Math.random() * 100) + 1;
		System.out.println(numRange);
	}
	
	// 6. Create a method to get the area of a circle using the given radius
	public static double areaOfCircle(double radius) {
		return Math.PI * radius * radius; // Formula: π * r^2
	}
	
	// 7. Create a method to identify if a person is a voter or not
	public static void voterStatus(int age, boolean registered) {
	    if (age >= 18 && registered) { // Note: you can just write 'registered' instead of 'registered == true'
	        System.out.println("You are a qualified voter.");
	    } else if (age >= 18 && !registered) {
	        System.out.println("You are old enough, but you need to register to vote.");
	    } else {
	        System.out.println("You are too young to vote.");
	    }
	}
	
	// 8. Create a method to get the length of a certain word
	public static int wordLength(String word) {
		return word.length();
	}
	
	// 9. Create a method to print a certain word in reverse order
	public static void printReverse(String word) {
		String reversed = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reversed += word.charAt(i);
		}
		System.out.println("Reversed word: " + reversed);
	}
	
	// 10. Create a method to print your full name and age
	public static void details(String name, int age) {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I am " + age + " years old.");
	}
} 
