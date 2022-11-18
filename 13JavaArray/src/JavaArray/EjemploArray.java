package JavaArray;

public class EjemploArray {

	public static void main(String[] args) {
		//#########################
		//Example array
		//#########################
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars[0]);
		// Outputs Volvo
		
		//#########################
		//Example array
		//#########################
		//To change the value of a specific element, refer to the index number:
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		cars1[0] = "Opel";
		System.out.println(cars1[0]);
		// Now outputs Opel instead of Volvo
		
		//#########################
		// array length
		//#########################
		String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars2.length);
		// Outputs 4
		
	}

}
