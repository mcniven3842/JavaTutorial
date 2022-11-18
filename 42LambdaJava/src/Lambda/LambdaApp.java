package Lambda;
import java.util.*;

public class LambdaApp {
	
	public void ordenar() {
		List<String> lista = new ArrayList<>();
		lista.add("Caballo");
		lista.add("Perro");
		lista.add("Gato");
		lista.add("Abeja");
		
		/**Se hace uso del metodo comparator para poder organizar los elementos del array **/
		/** se deja cpmantariado para mosttar que el metodo tradicional represnetas mas lineas de codigo **/
		/** que en comparacion al uso de expresiones lambda **/
		/** el elemento se define como un arreglo /**
//		Collections.sort(lista, new Comparator<String>() {
//
//			@Override
//			public int compare(String obj1, String obj2) {
//				
//				return obj1.compareTo(obj2);
//			}
//			
//		});
		/** Se hara el ordenaiento implementado lambdas, se escribira menos codigo **/
		Collections.sort(lista,(String P1, String P2)-> P1.compareTo(P2));
		
		for(String elemento:lista) {
			System.out.println(elemento);
		}
	}
	
	/** Ejemplo 2 de Lambda**/
	public void calcular() {
		Operacion operacion = (double x, double y) -> (x+y)/2;
		System.out.println(operacion.calcularPromedio(2, 3));
	}
	public static void main(String [] Args)
	{
		LambdaApp App = new LambdaApp();
		App.ordenar();
		App.calcular();
	}

}
