package day10.discussion;

import java.util.Scanner;

public class ATMPinEntry {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int correctPin = 123456; // Renamed to clearly distinguish from user input
        int enteredPin;
        
        // Using do-while avoids duplicating the prompt and input logic
        do {
            System.out.print("Enter your PIN: ");
            enteredPin = input.nextInt();
            
            if (enteredPin != correctPin) {
                System.out.println("Incorrect PIN! Try again.\n");
            }
        } while (enteredPin != correctPin);
        
        System.out.println("Access Granted!");
        input.close(); 
    }
}
