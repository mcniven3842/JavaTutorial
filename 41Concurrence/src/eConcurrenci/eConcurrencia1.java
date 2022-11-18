package eConcurrenci;

public class eConcurrencia1 extends Thread {
	private int id;
	
	public eConcurrencia1(int id) {
		this.id = id;
	}
	public void run() {
		System.out.println("Soy el hilo"+id);
	}
	public static void main (String[] Args) {
		eConcurrencia1[] vec = new eConcurrencia1[5];
		for(int i=0; i<vec.length;i++)
		{
			vec[i]= new eConcurrencia1(i+1);
		}
		for(int i=0; i<vec.length;i++)
		{
			vec[i].start();
		}
		/** 
		 * se ejecuta un try catch con el cual se logra que el hilo pricipal se ejecute despues de ejecutarse el hilo
		 * que se selecciona con el metodo join, no necexariamente se ejecuta despues del hilo seleccionado
		 * solo se garantiza que lo ejecute un tiempo despues.
		 * **/
		try {
			vec[2].join();
		}
		catch(Exception ex) {}
		System.out.println("Soy el hilo principal");
	}
	
	
}
