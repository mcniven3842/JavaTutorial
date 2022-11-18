package ClassMethods;

public class MethodObject {
	  // Create a fullThrottle() method
	  public void fullThrottle() {
	    System.out.println("The car is going as fast as it can!");
	  }

	  // Create a speed() method and add a parameter
	  public void speed(int maxSpeed) {
	    System.out.println("Max speed is: " + maxSpeed);
	  }
	public static void main(String[] args) {
		MethodObject myCar = new MethodObject();     // Create a myCar object
		myCar.fullThrottle();      // Call the fullThrottle() method
		myCar.speed(200);          // Call the speed() method
	}

}
