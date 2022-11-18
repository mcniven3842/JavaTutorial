package conditionals;

public class Switchdefault {

	public static void main(String[] args) {
		//############################################
		//default
		//############################################
		int day = 4;
		switch (day) {
		  case 6:
		    System.out.println("Today is Saturday");
		    break;
		  case 7:
		    System.out.println("Today is Sunday");
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		// Outputs "Looking forward to the Weekend"
	}

}
