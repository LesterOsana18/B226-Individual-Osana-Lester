package day21.discussion;

public class Main {

	public static void main(String[] args) {
		Ballpen ballpen = new Ballpen();
		
		// Provide value for each variable
		ballpen.setBrand("Pilot");
		ballpen.setColor("Black");
		ballpen.setPrice(15);
		ballpen.setPointSize(0.5);
		
		// Print out each attribute
		System.out.println(ballpen.getBrand());;
		System.out.println(ballpen.getColor());;
		
		System.out.println(ballpen.getPrice());
		System.out.println(ballpen.getPointSize());
	}

}
