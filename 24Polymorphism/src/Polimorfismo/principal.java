package Polimorfismo;

public class principal {

	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0]= new Vehiculo("GH67","Ferrari","A89");
		misVehiculos[1]= new vehiculoTurismo(4,"GH32","Audi","P14");
		misVehiculos[2]= new vehiculoDeportivo(500,"GH15","Ferrari","Kj8");
		misVehiculos[3]= new vehiculoFurgoneta(1000,"GH10","Toyota","abc");
		
		for(Vehiculo vehiculo: misVehiculos) {
			System.out.println(vehiculo.mostrarDatos());
		}
	}
}
