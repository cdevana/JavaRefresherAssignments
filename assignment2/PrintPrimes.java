package assignment2;

public class PrintPrimes {

	public static boolean isDivisible(int num1) {
		//Check if the number is divisible by any other number
		boolean isPrime = true;
		for (int j = 2; j < num1; j++) {
			if (isPrime) {
				if (num1 % j == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		// Print all prime numbers between 1 and 100
		for (int i = 1; i < 100; i++) {
			boolean isPrime = isDivisible(i); //Check if number is prime or not
			if (isPrime) //If prime, print the number
				System.out.print(i + " ");
		}
	}
	
	/* Output
	 * 1 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
	 */
}