package HerenGeneric;

public class Empleado {


	public Empleado(String nombre, int edad, double salario) {
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos() {
		return "el empleado se llama: "+this.nombre
				+ "tiene "+edad+" años"
				+" y un salario de: "+ salario;
	}
	private String nombre;
	private int edad;
	private double salario;
}
