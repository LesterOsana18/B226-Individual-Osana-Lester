package day15.discussion;

public class RandomNumber {

	public static void main(String[] args) {
		// Lotto Simulator
		System.out.println("Lotto Numbers: ");
		for (int i = 0; i < 6; i++) {
			int randomNumber = (int) (Math.random() * 58) + 1;
			System.out.println("[" + (i + 1) + "]: " + randomNumber);
		}
 	}
}
