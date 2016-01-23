package assignments;

public class PrintValues {

	public static void main(String[] args) {
		final int x = 5, y = 10;
		final int a = x + y * 2;
		final int b = x - y + 2;
		final int c =  (x + y) * 2;
		final int d = y % x;
		
		System.out.println ("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
		
		/* Output:
		  	a = 25
			b = -3
			c = 30
			d = 0
		 */
	}

}
