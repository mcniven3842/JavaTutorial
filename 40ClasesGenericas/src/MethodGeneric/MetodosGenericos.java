package MethodGeneric;

import java.util.GregorianCalendar;

public class MetodosGenericos {

	/** Se puede definir metodos genericos **/
	/** se pueden generar metodos genercios en cualquier clase aunque esta no sea generica **/
	public static void main(String[] args) {
		/** declara un areglo con elemetnos String **/
		String nombres[] = {"Jose","Maria","Pikachu","Loquillo"};		
		String elementos = misMatrices.getElementos(nombres);
		/** se puede escribir la misma instruccion de tra forma **/
		/** se define el tipo de dato a enviar al metodo genericos **/
		/** en etse caso String, aunque el compilador ya lo reconcoe por lo cual **/
		/** no es oblitatorio escribirlo **/
		/**
		 String elementos = misMatrices.<String>getElementos(nombres);
		**/
		System.out.println(elementos);
		
		/** se define un array de objetos **/
		Empleado listaEmpleados[]={new Empleado("Ana",40,2500),
								  new Empleado("Juan",25,2500),
								  new Empleado("Isabel",35,2500),
								  new Empleado("Pedro",45,2500)
		};
		System.out.println(misMatrices.getElementos(listaEmpleados));
		
		/** ahora se implementa el metodo get menor **/
		/** en el caso de string puede ejecutar sin problemas **/
		/** pero no se puede en el caso de objetos porque estos no implemetan la infertace comparable **/
		System.out.println(misMatrices.getMenor(nombres));
		
		GregorianCalendar fechas[] = {new GregorianCalendar(2020,07,15),
				new GregorianCalendar(2002,07,15),
				new GregorianCalendar(2018,07,15)};
		System.out.println(misMatrices.getMenor(fechas));
	}

}
/** en esta clase se indicara la longiud de un array que le sea suministrado **/
class misMatrices{
	
	public static <T> String getElementos(T[]a) {
		return "el array tiene "+ a.length + " elementos";
	}
	
/** metodo generico en el cual se indica el elemento menor del array **/
	public static <T extends Comparable> T getMenor(T[]a) {
		if(a==null||a.length==0) {
			return null;
		}
		T elementoMenor = a[0];
		for(int i=1;i<a.length;i++) {
			if(elementoMenor.compareTo(a[i])>0) {
				elementoMenor=a[i];
			}
				
		}
		return elementoMenor;
	}
}
