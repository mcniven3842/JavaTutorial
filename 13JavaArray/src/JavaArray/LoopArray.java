package JavaArray;

public class LoopArray {

	public static void main(String[] args) {
		
		//Loop Array
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}
		
		//loop for each array
		//The following example outputs all elements in the cars array, using a "for-each" loop:
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		for (String i : cars1) {
		  System.out.println(i);
		}
		/* The example above can be read like this: for each String element (called i - as in index) in cars,print out the value of i.
		 * If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, 
		 * it does not require a counter (using the length property), and it is more readable.
		 */
	}

}
