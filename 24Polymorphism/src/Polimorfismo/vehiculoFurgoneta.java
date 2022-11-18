package Polimorfismo;

public class vehiculoFurgoneta extends Vehiculo{
	private int carga;
	
	public vehiculoFurgoneta(int cilindraje ,String matricula, String marca,String modelo) {
		super(matricula,marca,modelo);
		this.carga=cilindraje;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo+"\n carga: "+carga;
	}
}
