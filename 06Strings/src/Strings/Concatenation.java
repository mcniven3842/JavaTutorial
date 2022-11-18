package Strings;

public class Concatenation {

	public static void main(String[] args) {
		//###############################
		// Concatenation
		//###############################

		// the are 2 ways for concatenate 2 Strings 

		//first way, implement the + sign
		String firstName = "John";
		String lastName = "Doe";
		System.out.println(firstName + " " + lastName);

		//Second way implement the method concatenate
		String firstName1 = "John ";
		String lastName1 = "Doe";
		System.out.println(firstName1.concat(lastName1));

		//If you add two numbers, the result will be a number:
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);

		//If you add two strings, the result will be a string concatenation:    
		String a = "10";
		String b = "20";
		String c = a + b;
		System.out.println(c);

		//If you add a number and a string, the result will be a string concatenation:
		String d = "10";
		int e = 20;
		String f = d + e;  // z will be 1020 (a String)
		System.out.println(f);

	}

}
