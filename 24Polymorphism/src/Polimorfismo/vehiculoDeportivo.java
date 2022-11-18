package Polimorfismo;

public class vehiculoDeportivo extends Vehiculo{
	private int cilindraje;
	
	public vehiculoDeportivo(int cilindraje ,String matricula, String marca,String modelo) {
		super(matricula,marca,modelo);
		this.cilindraje=cilindraje;
	}


	
	public int getCilindraje() {
		return cilindraje;
	}



	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}



	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo+"\n cilindraje: "+cilindraje;
	}

}
