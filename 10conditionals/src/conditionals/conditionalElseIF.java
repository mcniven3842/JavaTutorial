package conditionals;

public class conditionalElseIF {

	public static void main(String[] args) {
		//############################################
		//else if
		//############################################
	    int time = 22;
	    if (time < 10) {
	      System.out.println("Good morning.");
	    } else if (time < 20) {
	      System.out.println("Good day.");
	    }  else {
	      System.out.println("Good evening.");
	    }
	}

	// Outputs "Good evening."

	//Example explained
	/* In the example above, time (22) is greater than 10, so the first condition is false.
	 The next condition, in the else if statement, is also false, 
	so we move on to the else condition since condition1 and condition2 is both false - 
	and print to the screen "Good evening".
	However, if the time was 14, our program would print "Good day." */

}
