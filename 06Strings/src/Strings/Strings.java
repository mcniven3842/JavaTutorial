package Strings;

public class Strings {

	public static void main(String[] args) {
	//###################################
	//  String
	//###################################

	//Create a variable of type String and assign it a value
	String greeting = "Hello";

	//###################################
	//  METHODS
	//###################################

	//The length of a string can be found with the length() method
	String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	System.out.println("The length of the txt string is: " + txt.length());

	//There are many string methods available, for example toUpperCase() and toLowerCase()
	String txt1 = "Hello World";
	System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
	System.out.println(txt1.toLowerCase());   // Outputs "hello world"

	//The indexOf() method returns the index (the position) of the first occurrence 
	//of a specified text in a string (including whitespace):
	String txt2 = "Please locate where 'locate' occurs!";
	System.out.println(txt2.indexOf("locate")); // Outputs 7

	}

}
