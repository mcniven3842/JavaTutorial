package variables;

public class variableFinal {

	public static void main(String[] args) {
		//in this case an error is generated since an attempt is made to modify a variable that is defined as final
		final int myNum = 15;
		//myNum = 20;  // will generate an error: cannot assign a value to a final variable

	}

}
