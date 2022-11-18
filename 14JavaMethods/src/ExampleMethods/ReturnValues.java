package ExampleMethods;

public class ReturnValues {

	public static void main(String[] args) {
		System.out.println(myMethod(3));
	}
	
	static int myMethod(int x) {
		return 5 + x;
	}
	// Outputs 8 (5 + 3)
}
