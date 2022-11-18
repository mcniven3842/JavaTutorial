package Polimorfismo;

public class vehiculoTurismo extends Vehiculo{
	private int nPuertas;
	
	public vehiculoTurismo(int nPuertas ,String matricula, String marca,String modelo) {
		super(matricula,marca,modelo);
		this.nPuertas=nPuertas;
	}

	public int getnPuertas() {
		return nPuertas;
	}

	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}
	
	@Override
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\n Marca: "+marca+"\n Modelo: "+modelo+"\n nPuertas: "+nPuertas;
	}

}
