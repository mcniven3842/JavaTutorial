package herencia;

/* En este caso la clase estudiante heredara caracteristica de la clase persona */
/*en este caso la clase padre o usperclase es persona */
/* en este caso la clase hija o subclase es estudiante*/

public class estudiante extends persona{

	/*Se declara las variables que se requieren, como se hereda de persona */
	/* no se debe declara ni nombre, apellido ni edad */
	/*solo las variables que seran adcionales a esta subclase */
	private int codigoEstudiante;
	private float notaFinal;
	
	/*SE DECLARA EL CONSTRCUTOR */
	/* debe contener las varibales de la clase padre y las variables nuevas creadas en esta subclase */
	
	public estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
		/* Las variables que son heradas ya fueron inicialidas en el constrcutor de la clase padre*/
		/* para invocarlas en este constrcutor se hace uso de la palabra super*/
		super(nombre, apellido, edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	
	/* Se declaran metodos */
	public void mostrarDatos() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellido: "+ getApellido());
		System.out.println("Edad: "+ getEdad());
		System.out.println("Codigo de estudiante: "+ codigoEstudiante);
		System.out.println("Nota final: "+ notaFinal);
	}

}
