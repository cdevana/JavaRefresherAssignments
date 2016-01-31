package session3;

public class Roots {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double number = Double.parseDouble(args[0]);
		
		// Print square root of args[0]
		System.out.println("Square root of number " + number + " is " + Math.sqrt(number));		
		
		//Print cube root of args[0]
		System.out.println("Cube root of number " + number + " is " + Math.cbrt(number));
		
		/* Output for input "9"
			Square root of number 9.0 is 3.0
			Cube root of number 9.0 is 2.080083823051904
		 */

	}

}
