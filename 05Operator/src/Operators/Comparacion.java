package Operators;

public class Comparacion {

	public static void main(String[] args) {
	    int x;
	    int y;
	    
	    x = 5;
	    y = 3;
	    System.out.println(x == y); // returns false because 5 is not equal to 3
	    System.out.println(x != y); // returns true because 5 is not equal to 3
	    System.out.println(x > y); // returns true because 5 is greater than 3
	    System.out.println(x < y); // returns false because 5 is not less than 3
	    System.out.println(x >= y); // returns true because 5 is greater, or equal, to 3
	    System.out.println(x <= y); // returns false because 5 is neither less than or equal to 3
	}

}
