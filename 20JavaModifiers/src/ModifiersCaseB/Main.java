package ModifiersCaseB;
//Example
//An example to demonstrate the differences between static and public methods:
public class Main {

	public static void main(String[] args) {
	    myStaticMethod(); // Call the static method
	    Main myObj = new Main(); // Create an object of MyClass
	    myObj.myPublicMethod(); // Call the public method

	}
	  // Static method
	  static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }
}
