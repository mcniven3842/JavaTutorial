// En este ejemplo se utilizara un vector para lanzar los hilos
package concurrence2;

public class principal extends Thread{
	
	private int id;
	
	public principal(int id) {
		this.id=id;
	}
	public void Run () {
		System.out.println("Soy el hilo: "+id);
	}
	
	public static void main(String[] args) {
		
		principal [] vec  = new principal[5];
		for (int i=0; i< vec.length; i++){
			vec[i] = new principal(i+1);
		}
		
		for (int i=0; i< vec.length; i++) {
			vec[i].start();
		}
		// lanzado un hilo uno por uno de los vectores
		// vec[0].start();
		System.out.println("Soy el hilo principal ");
	}

}
