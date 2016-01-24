package assignment2;

public class IfElseStatement {

	public static void main(String[] args) {
		// Take 1 input and output a string
		
		String vote = "You are eligible to vote";
		String noVote = "You are not eligible to vote";
		final int age = 18;
		
		System.out.println("Input age is " + args[0]);
		
		if (Integer.parseInt(args[0]) >= age)
			System.out.println(vote);
		else
			System.out.println(noVote);
		
		/* Output:
		 		Input age is 16
				You are not eligible to vote

				Input age is 80
				You are eligible to vote
		 */

	}

}
