package JavaType;

public class JavaTypes {
	public static void main(String[] args) {
		//###################
		// Integer Types
		//###################	
		//The byte data type can store whole numbers from -128 to 127. 
			byte myNum1 = 100;
		//Short
		//The short data type can store whole numbers from -32768 to 32767
			short myNum2 = 5000;
		//Int
		//The int data type can store whole numbers from -2147483648 to 2147483647.
			int myNum3 = 100000;
		//Long
		//The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
		//This is used when int is not large enough to store the value. Note that you should end the value with an "L"
			long myNum4 = 15000000000L;

		//#########################
		// Floating Point Types
		//########################
		//The float and double data types can store fractional numbers. 
		//Note that you should end the value with an "f" for floats and "d" for doubles:
			float myNum5 = 5.75f;	
			double myNum6 = 19.99d;
		//The precision of a floating point value indicates how many digits the value can have after the decimal point. 
		//The precision of float is only six or seven decimal digits, while double variables have a precision of about 15 digits. 
		//Therefore it is safer to use double for most calculations.
			
		//A floating point number can also be a scientific number with an "e" to indicate the power of 10:
			float f1 = 35e3f;
			double d1 = 12E4d;
			
		//##########################
		// Boolean Types
		//##########################
		//A boolean data type is declared with the boolean keyword and can only take the values true or false:
			boolean isJavaFun = true;
			boolean isFishTasty = false;
			
		//###########################
		// character
		//###########################
		//The char data type is used to store a single character. 
		//The character must be surrounded by single quotes, like 'A' or 'c'
			char myGrade = 'B';
		
		//###########################
		// Strings
		//###########################
		//The String data type is used to store a sequence of characters (text). 
		//String values must be surrounded by double quotes
			String greeting = "Hello World";
	}

}
