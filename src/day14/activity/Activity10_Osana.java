// Activity 10: Math Class
/*
 * 1. Research Phase - Each student will research the following Java Math methods:
 * - Math.abs() → absolute value
 * - Math.max() → maximum of two values
 * - Math.min() → minimum of two values
 * - Math.pow() → power (exponentiation)
 * - Math.sqrt() → square root
 * - Math.round() → round to nearest integer
 * - Math.ceil() → round up (ceiling)
 * - Math.floor() → round down (floor)
 * - Math.random() → random number between 0.0 and 1.0
 * - Math.log() → natural logarithm (base e)
 * - Math.log10() → logarithm base 10
 * - Math.exp() → exponential function (e^x)
 * - Math.sin() → sine of an angle (in radians)
 * - Math.cos() → cosine of an angle (in radians)
 * - Math.tan() → tangent of an angle (in radians)
 *
 * 2. Documentation Phase - For each method, students must write:
 * - A short description of what the method does.
 * - A simple code example that demonstrates its use.
 *
 * 3. Presentation Phase
 * - Compile all findings into a Grades Report style table or a short document.
 * - Present one method to the class, showing both the explanation and the example code.
 *
 * References:
 * - W3Schools
 */

package day14.activity;

public class Activity10_Osana {

    public static void main(String[] args) {

        System.out.println("=====================================================");
        System.out.println("||         JAVA MATH METHODS DEMONSTRATION         ||");
        System.out.println("=====================================================\n");

        // --------------------------------------------------
        // Math.abs()
        // --------------------------------------------------
        System.out.println("1. Math.abs()");
        System.out.println("Description:");
        System.out.println("Returns the absolute (positive) value of a number.");

        int bankBalance = -2500;

        System.out.println("\nExample:");
        System.out.println("Bank Balance: " + bankBalance);
        System.out.println("Absolute Value: " + Math.abs(bankBalance));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.max()
        // --------------------------------------------------
        System.out.println("2. Math.max()");
        System.out.println("Description:");
        System.out.println("Returns the larger of two values.");

        int exam1 = 89;
        int exam2 = 94;

        System.out.println("\nExample:");
        System.out.println("Exam 1 Score: " + exam1);
        System.out.println("Exam 2 Score: " + exam2);
        System.out.println("Higher Score: " + Math.max(exam1, exam2));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.min()
        // --------------------------------------------------
        System.out.println("3. Math.min()");
        System.out.println("Description:");
        System.out.println("Returns the smaller of two values.");

        int deliveryTime1 = 35;
        int deliveryTime2 = 28;

        System.out.println("\nExample:");
        System.out.println("Delivery Route A: " + deliveryTime1 + " minutes");
        System.out.println("Delivery Route B: " + deliveryTime2 + " minutes");
        System.out.println("Fastest Delivery: " + Math.min(deliveryTime1, deliveryTime2) + " minutes");

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.pow()
        // --------------------------------------------------
        System.out.println("4. Math.pow()");
        System.out.println("Description:");
        System.out.println("Raises a number to a specified power.");

        double side = 12;
        double area = Math.pow(side, 2);

        System.out.println("\nExample:");
        System.out.println("Square Side Length: " + side);
        System.out.println("Area of Square: " + area);

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.sqrt()
        // --------------------------------------------------
        System.out.println("5. Math.sqrt()");
        System.out.println("Description:");
        System.out.println("Returns the square root of a number.");

        double number = 81;

        System.out.println("\nExample:");
        System.out.println("Number: " + number);
        System.out.println("Square Root: " + Math.sqrt(number));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.round()
        // --------------------------------------------------
        System.out.println("6. Math.round()");
        System.out.println("Description:");
        System.out.println("Rounds a decimal number to the nearest whole number.");

        double productPrice = 249.75;

        System.out.println("\nExample:");
        System.out.println("Product Price: ₱" + productPrice);
        System.out.println("Rounded Price: ₱" + Math.round(productPrice));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.ceil()
        // --------------------------------------------------
        System.out.println("7. Math.ceil()");
        System.out.println("Description:");
        System.out.println("Rounds a decimal number up.");

        double boxesNeeded = 7.2;

        System.out.println("\nExample:");
        System.out.println("Boxes Needed: " + boxesNeeded);
        System.out.println("Boxes to Prepare: " + Math.ceil(boxesNeeded));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.floor()
        // --------------------------------------------------
        System.out.println("8. Math.floor()");
        System.out.println("Description:");
        System.out.println("Rounds a decimal number down.");

        double fuelRemaining = 14.95;

        System.out.println("\nExample:");
        System.out.println("Fuel Remaining: " + fuelRemaining + " liters");
        System.out.println("Whole Liters: " + Math.floor(fuelRemaining));
        
        // Additional Examples for ceil & floor
        double grade = 96.5;
        System.out.println("\nMy final grade is " + Math.ceil(grade));
        System.out.println("My final grade is " + Math.floor(grade));
        
        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.random()
        // --------------------------------------------------
        System.out.println("9. Math.random()");
        System.out.println("Description:");
        System.out.println("Generates a random number.");

        int dice = (int) (Math.random() * 6) + 1;

        System.out.println("\nExample:");
        System.out.println("Rolling a six-sided die...");
        System.out.println("Dice Result: " + dice);

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.log()
        // --------------------------------------------------
        System.out.println("10. Math.log()");
        System.out.println("Description:");
        System.out.println("Returns the natural logarithm (base e).");

        System.out.println("\nExample:");
        System.out.println("Natural Log of e: " + Math.log(Math.E));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.log10()
        // --------------------------------------------------
        System.out.println("11. Math.log10()");
        System.out.println("Description:");
        System.out.println("Returns the logarithm with base 10.");

        System.out.println("\nExample:");
        System.out.println("log10(1000) = " + Math.log10(1000));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.exp()
        // --------------------------------------------------
        System.out.println("12. Math.exp()");
        System.out.println("Description:");
        System.out.println("Returns e raised to the power of a number.");

        System.out.println("\nExample:");
        System.out.println("e² = " + Math.exp(2));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.sin()
        // --------------------------------------------------
        System.out.println("13. Math.sin()");
        System.out.println("Description:");
        System.out.println("Returns the sine of an angle in radians.");

        double angle30 = Math.toRadians(30);

        System.out.println("\nExample:");
        System.out.println("Sine of 30° = " + Math.sin(angle30));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.cos()
        // --------------------------------------------------
        System.out.println("14. Math.cos()");
        System.out.println("Description:");
        System.out.println("Returns the cosine of an angle in radians.");

        double angle60 = Math.toRadians(60);

        System.out.println("\nExample:");
        System.out.println("Cosine of 60° = " + Math.cos(angle60));

        System.out.println("\n-----------------------------------------------------\n");

        // --------------------------------------------------
        // Math.tan()
        // --------------------------------------------------
        System.out.println("15. Math.tan()");
        System.out.println("Description:");
        System.out.println("Returns the tangent of an angle in radians.");

        double angle45 = Math.toRadians(45);

        System.out.println("\nExample:");
        System.out.println("Tangent of 45° = " + Math.tan(angle45));

        System.out.println("\n======================================================");
        System.out.println("||          END OF JAVA MATH DEMONSTRATION          ||");
        System.out.println("======================================================");
    }
}