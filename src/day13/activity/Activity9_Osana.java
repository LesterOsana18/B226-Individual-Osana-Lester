// Activity 9: String Class
/* 1. Research Phase - Each student will research the following Java String methods:
 * 		- contains()
		- endsWith()
		- startsWith()
		- indexOf()
		- isEmpty()
		- trim()
		- replace()
		- toCharArray()
		- nextLine().charAt()
		- valueOf()
		
 * 2. Documentation Phase - For each method, students must write:
		- A short description of what the method does.
		- The method’s syntax.
		- A simple code example that demonstrates its use.
		
 * 3. Presentation Phase
 		- Compile all findings into a Grades Report style table or a short document.
		- Present one method to the class, showing both the explanation and the example code.
		
 * 4. Stretch Goal - After completing the above:
 		- Write a Java program that performs the following tasks using the given string: String country = "Philippines";  
 		- Display the first and last character of the string.
		- Count and display how many times the character "P/p" appears in the string.
		- Count and display the total number of vowels (a, e, i, o, u) in the string.

* References:
* - W3Schools
* - GeeksforGeeks
* Information about Java String methods was referenced from these resources.	
 * */
package day13.activity;

import java.util.Scanner;

public class Activity9_Osana {

	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		// After accomplishing the Research Phase, we will proceed with the Documentation Phase
		System.out.println("===========================================");
        System.out.println("||   JAVA STRING METHODS DEMONSTRATION   ||");
        System.out.println("===========================================\n");

        // Declare a few sample String variables that will be used for the documentation
        String text = "Hello Philippines";
        String empty = "";
        String spacedText = "   Java Programming   ";
        
        // ----- contains() -----
        System.out.println("1. contains()");
        System.out.println("Description: Checks whether a string contains a specified sequence of characters.");
        System.out.println("Syntax: string.contains(\"text\")");

        System.out.print("Example: ");
        System.out.println("Does \"" + text + "\" contain \"Phil\"?");
        System.out.println("Result: " + text.contains("Phil"));
        
        System.out.println();
        
        // ----- endsWith() -----
        System.out.println("2. endsWith()");
        System.out.println("Description: Checks whether a string ends with the specified suffix.");
        System.out.println("Syntax: string.endsWith(\"suffix\")");

        System.out.println("Example:");
        System.out.println("Result: " + text.endsWith("ippines"));

        System.out.println();
        
        // ----- startsWith() -----
        System.out.println("3. startsWith()");
        System.out.println("Description: Checks whether a string starts with the specified prefix.");
        System.out.println("Syntax: string.startsWith(\"prefix\")");

        System.out.println("Example:");
        System.out.println("Result: " + text.startsWith("Hello"));

        System.out.println();
        
        // ----- indexOf() -----
        System.out.println("4. indexOf()");
        System.out.println("Description: Returns the position of the first occurrence of a character or string.");
        System.out.println("Syntax: string.indexOf(\"text\")");

        System.out.println("Example:");
        System.out.println("Index of \"Phil\": " + text.indexOf("Phil"));

        System.out.println();
        
        // ----- isEmpty() -----
        System.out.println("5. isEmpty()");
        System.out.println("Description: Checks whether the string is empty.");
        System.out.println("Syntax: string.isEmpty()");

        System.out.println("Example:");
        System.out.println("Result: " + empty.isEmpty());

        System.out.println();
        
        // ----- trim() -----
        System.out.println("6. trim()");
        System.out.println("Description: Removes leading and trailing spaces.");
        System.out.println("Syntax: string.trim()");

        System.out.println("Example:");
        System.out.println("Before: \"" + spacedText + "\"");
        System.out.println("After : \"" + spacedText.trim() + "\"");

        System.out.println();
        
        // ----- replace() -----
        System.out.println("7. replace()");
        System.out.println("Description: Replaces characters or substrings.");
        System.out.println("Syntax: string.replace(oldChar, newChar)");

        System.out.println("Example:");
        System.out.println(text.replace("Philippines", "World"));

        System.out.println();
        
        // ----- toCharArray() -----
        System.out.println("8. toCharArray()");
        System.out.println("Description: Converts a string into a character array.");
        System.out.println("Syntax: string.toCharArray()");

        char[] letters = text.toCharArray();

        System.out.println("Example:");
        for (char c : letters) {
            System.out.print(c + " ");
        }

        System.out.println("\n");
        
        // ----- nextLine().charAt() -----
        System.out.println("9. nextLine().charAt()");
        System.out.println("Description: Reads a line from the user and gets a character at a specific position.");
        System.out.println("Syntax: scanner.nextLine().charAt(index)");
        
        String userInput = "";
        char firstLetter = ' ';
        
        // Do-while loop to ensure user will not type an empty string
        do {
        	System.out.print("Enter a word: ");
        	userInput = input.nextLine(); // 1. Capture the input INSIDE the loop
        	
        	if (!userInput.isEmpty()) { // 2. Validate input
        		firstLetter = userInput.charAt(0); // 3. Safely extract the character
                System.out.println("First character: " + firstLetter);
        	} else {
        		System.out.println("Invalid input. Please do not leave it blank!\n");
        	}
        } while (userInput.isEmpty()); // 4. Loop again if they gave you nothing

        System.out.println();
        
        // ----- valueOf() -----
        System.out.println("10. valueOf()");
        System.out.println("Description: Converts another data type into a String.");
        System.out.println("Syntax: String.valueOf(value)");

        int number = 100;

        String converted = String.valueOf(number);

        System.out.println("Example:");
        System.out.println("Integer: " + number);
        System.out.println("Converted String: " + converted);
        
        // ----- Stretch Goal -----
        System.out.println("\n============================================");
        System.out.println("||              STRETCH GOAL              ||");
        System.out.println("============================================\n");
        
        // - Write a Java program that performs the following tasks using the given string: String country = "Philippines";
        String country = "Philippines";
        
		// - Display the first and last character of the string.
        // First Letter
        char first = country.charAt(0);
        
        // Last letter
        char last = country.charAt(country.length() - 1);
        
        // Print out the results
        System.out.println("Country: " + country);
        System.out.println("First Letter: " + first);
        System.out.println("Last Letter: " + last);
        
		// - Count and display how many times the character "P/p" appears in the string.
        // Count P/p
        int pCount = 0;
        
		// - Count and display the total number of vowels (a, e, i, o, u) in the string.
        // Count vowels
        int vowelCount = 0;
        
        // For loop to count the required characters
        for (int i = 0; i < country.length(); i++) {
        	
        	char ch = country.charAt(i);
        	
        	// Count P/p
        	if (ch == 'P' || ch == 'p') {
        		pCount++;
        	}
        	
        	// Convert to lowercase for easier vowel checking 
        	ch = Character.toLowerCase(ch);
        	
        	// Count vowels
        	if ( ch == 'a' ||
        		 ch == 'e' ||
        		 ch == 'i' ||
        		 ch == 'o' ||
        		 ch == 'u') {
        		 
        		 vowelCount++;
        	}
        }
        
        // Display the results
        System.out.println("Number of P/p: " + pCount);
        System.out.println("Number of vowels: " + vowelCount);
        
        // Close Scanner after use
        input.close();
	}

}
