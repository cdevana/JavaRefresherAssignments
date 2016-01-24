package assignment2;

public class PrintNumTriangle {

	public static void main(String[] args) {
		// Print num "triangle"
		
		for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
			for (int j = 1; j <= i; j++ )
				System.out.print(j);
			System.out.println("\n");
		}
		
		for (int i = Integer.parseInt(args[0]); i > 0; i--) {
			for (int j = 1; j <= i; j++ )
				System.out.print(j);
			System.out.println("\n");
		}
		
		/* Output for a input of 5
		 
			1

			12

			123

			1234

			12345

			12345

			1234

			123

			12

			1

		 */
	}

}
