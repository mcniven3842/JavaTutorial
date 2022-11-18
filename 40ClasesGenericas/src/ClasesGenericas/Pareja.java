package ClasesGenericas;

/** se declara una clase generica **/
/** el parametro <T> indica que puede recibir datos de cualquier tipo **/
/** por convencion se usan las letras T, U y K **/
public class Pareja <T>{
	private T primero;
	
	/** constructor **/
	public Pareja() {
		primero=null;
	}
	/** metodo setter **/
	public void setPrimero (T nuevoValor) {
		primero = nuevoValor;
	}
	/** metodo getter **/
	public T getPrimero() {
		return primero;
	}
	
}
