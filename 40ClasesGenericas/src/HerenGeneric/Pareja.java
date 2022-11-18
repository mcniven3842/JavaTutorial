package HerenGeneric;

/** se declara una clase generica **/
/** el parametro <T> indica que puede recibir datos de cualquier tipo **/
/** por convencion se usan las letras T, U y K **/
public class Pareja <T>{	
	/** constructor **/
	public Pareja() {
		primero=null;
	}
	/**para solucionar el problema de heredar se crea un nuevo metodo **/
	public static void imprimirTrabajador(Pareja<Empleado> p) {
		Empleado primero=p.getPrimero();
		System.out.println(primero);
	}
	/** metodo setter **/
	public void setPrimero (T nuevoValor) {
		primero = nuevoValor;
	}
	/** metodo getter **/
	public T getPrimero() {
		return primero;
	}
	private T primero;
}
