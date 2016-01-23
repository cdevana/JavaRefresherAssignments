package assignments;

public class PrintSum {

	public static int sumOfNums(final int num1, final float num2) {
		int result = num1 + (int) num2;
		return result;
	}
	
	public static void main(String[] args) {
		// Call sumOfNums
		final int num1 = 8;
		final float num2 = 8;
		System.out.println(sumOfNums(num1, num2));
		
		/* Output:
		 	16
		 */
	}

}
