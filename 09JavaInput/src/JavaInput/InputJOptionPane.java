package JavaInput;
import javax.swing.*;
import java.util.*;
public class InputJOptionPane {

	public static void main(String[] args) {
		//#############################
		// JOptionPane
		//#############################



		String Nombre_usuario1 = JOptionPane.showInputDialog("Introduce your name");
		//the JOptionPane method only retrieves data of String type
		String Age = JOptionPane.showInputDialog("Introduce your age");
		//being of String type, it will not add 1 to the value of the age, but will concatenate it.
		System.out.println("Hello "+ Nombre_usuario1 +". The next year your age will be "+ (Age +1) + "years.");
		//often after obtaining data with this method it is necessary to make a casting.
		int age1 = Integer.parseInt(Age);
		System.out.println("Hello "+ Nombre_usuario1 +". The next year your age will be "+ (age1 +1) + "years." );

	}

}
