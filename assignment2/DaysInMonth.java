package assignment2;

public class DaysInMonth {

	public static int numberOfDays(final String month) {
		int days = 0;
		
		//Covert input string case to lower case in order to eliminate case issues
		
		switch (month.toLowerCase()) {
		case "january" : days = 31;
		case "february" : days = 28;
		case "march" : days = 31;
		case "april" : days = 30;
		case "may" : days = 31;
		case "june" : days = 30;
		case "july" : days = 31;
		case "august" : days = 30;
		case "september" : days = 30;
		case "november" : days = 30;
		case "december" : days = 31;
		}
		
		return days;
	}
	
	public static void main(String[] args) {
		
		/*
		 * Assumption: It is not a leap year and so February will always print 28 days.
		 * 
		 */
		System.out.println(numberOfDays("March"));
		
		/* Output
		 * 31
		 */

	}

}
