	package day8.discussion;

import java.util.Scanner;

public class AgeClassificationNested {

	public static void main(String[] args) {
		
		/*
	        Age: 0 - 12 -> Child
	            Age 0-5 -> Specifically, Toddler
	            Age 6-12 -> Specifically, Pre-Teen
	        Age: 13 - 19 -> Teenager
	            Age: 13-15 -> Specifically, Early Teen
	            Age: 16-19 -> Specifically, Late Teen
	        Age: 20 - 59 -> Adult
	            Age: 20-35 -> Specifically, Young Adult
	            Age: 36-59 -> Specifically, Middle-Aged
	        Age: 60 - 120 -> Senior Citizen
	            Age: 60-75 -> Specifically, Young Senior
	            Age: 76-120 -> Specifically, Elderly
	        Invalid Age -> Invalid Input
		*/
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        // Check if age is within valid range
        if (age >= 0 && age <= 120) {
            // Child: 0-12
            if (age <= 12) {
                System.out.println("You are a child");
                // Toddler: 0-5, Pre-Teen: 6-12
                if (age <= 5) {
                    System.out.println("Specifically, you are Toddler.");
                } else {
                    System.out.println("Specifically, you are Pre-Teen.");
                }

            // Teenager: 13-19
            } else if (age <= 19) {
                System.out.println("You are a teenager");
                // Early Teen: 13-15, Late Teen: 16-19
                if (age <= 15) {
                    System.out.println("Specifically, you are Early Teen.");
                } else {
                    System.out.println("Specifically, you are Late Teen.");
                }

            // Adult: 20-59
            } else if (age <= 59) {
                System.out.println("You are adult");
                // Young Adult: 20-35, Middle-Aged: 36-59
                if (age <= 35) {
                    System.out.println("Specifically, you are Young Adult.");
                } else {
                    System.out.println("Specifically, you are Middle-Aged.");
                }

            // Senior Citizen: 60-120
            } else if (age <= 120) {
                System.out.println("You are senior citizen");
                // Young Senior: 60-75, Elderly: 76-120
                if (age <= 75) {
                    System.out.println("Specifically, you are Young Senior.");
                } else {
                    System.out.println("Specifically, you are Elderly.");
                }
            }
        } else {
            // Invalid if below 0 or above 120
            System.out.println("Invalid age entered.");
        }
        
        // Code minimization
        input.close();
	}

}
