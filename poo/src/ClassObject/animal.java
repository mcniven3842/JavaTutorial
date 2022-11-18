package ClassObject;

public class animal {
	/* Cualquier atributo que sea definido con objetc podra ser inicializado */
	/* con cualquier valos sin importar el tipo */
		Object nombre;

	/* Constrcutor */
	public animal (Object nom) {
		nombre = nom;
	}
	
	@Override
	public String toString () {
		return "Nombre: "+ nombre;
	}
}
