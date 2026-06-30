package day11.discussion;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// Syntax for single dimensional array
//		int[] ages = {24, 43, 35, 18, 28, 25};
//		
//		System.out.println(ages[2]);
//		
//		String[] names = {"Michael", "Les", "Kent", "Ray", "Jeff"};
//		
//		System.out.println(names[4]);
		
		int[] ages = {24, 43, 35, 18, 28, 25};
		
		// For Loop
		System.out.println("Traversing using for loop: ");
		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		
		System.out.println("");
		
		// For-each Loop
		System.out.println("Traversing using for-each: ");
		for (int age : ages) {
			System.out.println(age);
		}
	}
}
