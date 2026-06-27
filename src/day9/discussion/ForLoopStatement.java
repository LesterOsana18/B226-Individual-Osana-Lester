package day9.discussion;

public class ForLoopStatement {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for (int i = 20; i >= 1; i--) {
//			System.out.println(i);
//		}
		
		
		// Mini-Activity: Calculate the product of numbers from 1 to 5
		
		// Initialize the product variable
		int product = 1;
		
		// Loop from 1 to 5
		for (int i = 1; i <= 5; i++) {
			product *= i; // Shorthand for product = product * i;
		}
		
		// Print the results
		System.out.println("The product of numbers from 1 to 5 is: " + product);
	}

}
