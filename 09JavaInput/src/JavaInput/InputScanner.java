package JavaInput;
import java.util.*;
public class InputScanner {

	public static void main(String[] args) {
		//#############################
		// SCANNER
		//#############################
		//use of the scanner method for variable entry*

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce your name");
		String nombre_usuario = entrada.nextLine();
		System.out.println("Introduce your age");
		int edad = entrada.nextInt();
		System.out.println("Hello "+ nombre_usuario +". The next year your age will be "+ (edad+1) + "years." );

	}

}
