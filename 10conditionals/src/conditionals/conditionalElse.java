package conditionals;

public class conditionalElse {

	public static void main(String[] args) {

		//############################################
		//else
		//############################################
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
		// Outputs "Good evening."
		/* Example explained
		In the example above, time (20) is greater than 18, so the condition is false. 
		Because of this, we move on to the else condition and print to the screen "Good evening". 
		If the time was less than 18, the program would print "Good day". */

	}

}
