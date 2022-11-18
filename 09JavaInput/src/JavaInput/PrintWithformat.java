package JavaInput;
import javax.swing.*;
import java.lang.Math;
public class PrintWithformat {

	public static void main(String[] args) {
		//#############################
		// Print with format
		//############################# 
		double x = 10000.0;
		System.out.println(x/3);
		System.out.printf("%1.2f", x/3);
		
		//ejemplo de salida usando print sin salto de linea


		String num1=JOptionPane.showInputDialog("Introduce the number");
		double num2 = Double.parseDouble(num1);
		System.out.print("La raiw de "+ num2 + " es ");
		System.out.printf("%1.2f", (num2));
	}

}
