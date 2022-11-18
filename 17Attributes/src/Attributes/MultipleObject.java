package Attributes;

public class MultipleObject {
	int x = 5;
	public static void main(String[] args) {
		MultipleObject myObj1 = new MultipleObject();  // Object 1
		MultipleObject myObj2 = new MultipleObject();  // Object 2
	    myObj2.x = 25;
	    System.out.println(myObj1.x);  // Outputs 5
	    System.out.println(myObj2.x);  // Outputs 25
	}

}
