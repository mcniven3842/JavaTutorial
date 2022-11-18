package ClasesGenericas;

public class UsoPareja {

	public static void main(String[] args) {
		/** se instancia una **/
		/** en el primer caso se define con un parametro tipo string **/
		Pareja<String> una = new Pareja<String>();
		una.setPrimero("Juana");
		System.out.println(una.getPrimero());
		
		/** se declara una segunda instancia denominado otra **/
		/** se define un parametro tipo persona **/
		/** en este segundo caso se hace uso de la clase persona que aparece abajo **/
		Persona pers1 = new Persona("Ana");
		Pareja <Persona> otra= new Pareja<Persona>();
		otra.setPrimero(pers1);
		String ss = "hello" + otra.getPrimero();
		System.out.println(otra.getPrimero());
	}
	
}

class Persona {
	public Persona(String nombre) {
		this.nombre=nombre;
	}
	private String nombre;

	/** para convetir en string la variable que se devuelve **/
	
	public String toString() {
		return nombre;
	}
	
	
	
}