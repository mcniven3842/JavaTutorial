package Arraylist;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
	
//		Empleado listadoEmpleado[] = new Empleado[3];
//		listadoEmpleado[0] = new Empleado("Ana",45,2500);
//		listadoEmpleado[1] = new Empleado("Chucho",25,3500);
//		listadoEmpleado[2] = new Empleado("Pedro",40,2500);
		
		ArrayList <Empleado> listadoEmpleado = new ArrayList <Empleado>();
		listadoEmpleado.add(new Empleado("Ana",45,2500));
		listadoEmpleado.add(new Empleado("Chucho",25,3500));
		listadoEmpleado.add(new Empleado("Pedro",40,2500));
		listadoEmpleado.add(new Empleado("Luis",40,2500));
		listadoEmpleado.add(new Empleado("Laura",40,2500));
		/** Para definir un objeto en una ubicacion especifica del arralist**/
		/** en este caso ubica en la posicion 2 **/
		listadoEmpleado.set(1,new Empleado("Laura",40,2500));
		listadoEmpleado.trimToSize();
		for(Empleado e:listadoEmpleado) {
			System.out.println(e.dameDatos());
		}
		/** metodo get para obtener un dato en especifico **/
		/** en este caso se llama a la posicion 5 **/
		System.out.println(listadoEmpleado.get(4).dameDatos());
		
		/** traspasar datos de aaraylist a un array de datos primitivos **/
		Empleado arrayEmpleados[]=new Empleado[listadoEmpleado.size()];
		listadoEmpleado.toArray(arrayEmpleados);
	}

}

class Empleado{
	
	private String nombre;
	private int edad;
	double salario;
	//Constrcutor
	public Empleado(String nombre,int edad, double salario)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	//metodos
	public String dameDatos() {
		return "Nombre empleado: "+nombre+" edad: "+edad+" Salario: "+salario;
	}
}