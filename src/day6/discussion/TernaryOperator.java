package day6.discussion;

public class TernaryOperator {

	public static void main(String[] args) {
//		int num = 1;
//		
//		String result = (num > 0) ? "Positive" : "Negative";
//		System.out.println(result);
//		
//		float temp = 38.5f;
//		
//		String tempResult = temp >= 38.5 ? "Positive" : "Negative";
//		System.out.println(tempResult);
		
//		// Neutral, Positive, or Negative
//		int num = -1;
//		
//		String result = (num == 0) ? "Neutral"
//				: (num > 0) ? "Positive"
//				: (num > 100) ? "Number is greater than 100"
//				: "Negative";
//		
//		System.out.println(result);
		
		
		// Check temperature for fever
		float temp = 38.5f;
		
		if (temp >= 38.5) {
			System.out.println("Fever");
		} else {
			System.out.println("Normal Temp");
		}
		
	}

}
