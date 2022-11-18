package Iterator;
import java.util.*;

public class Iteradores {
	
	
	public static void main(String[] args) {
	
		ArrayList <Afiliados> listadoAfiliados = new ArrayList <Afiliados>();
		listadoAfiliados.add(new Afiliados("Flor",45,2500));
		listadoAfiliados.add(new Afiliados("Isa",45,2500));
		listadoAfiliados.add(new Afiliados("Natalia",45,2500));
		listadoAfiliados.add(new Afiliados("Carlos",45,2500));
		listadoAfiliados.add(new Afiliados("Pedro",45,2500));
		listadoAfiliados.add(new Afiliados("Lucas",45,2500));
		
		Iterator<Afiliados>mi_iterador = listadoAfiliados.iterator();
		while(mi_iterador.hasNext()) {
			System.out.println(mi_iterador.next().dameDatosA());
		}
	}
	

}

class Afiliados{
	private String nombre;
	private int edad;
	double salario;
	//Constrcutor
	public Afiliados(String nombre,int edad, double salario)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	//metodos
	public String dameDatosA() {
		return "Nombre empleado: "+nombre+" edad: "+edad+" Salario: "+salario;
	}
}