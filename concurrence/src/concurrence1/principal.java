//ParA LANZAR HILOS DE HACE DESDE OBJETOS QUE HEREDAN D ELA CLASE THREAD
// Para crear hilos se generan objetos que heredan de Thread
// start() se lanzan los hilos
// los hilos no se ejecutan cuando se lanzan
// no sabemos el orden de ejecucion de los hilos
package concurrence1;
import java.util.*;
public class principal extends Thread {
	private int id;
	
	public principal(int id) {
		this.id=id;
	}
	
	public void run() {
		System.out.println("soy el hilo:"+id);
	}
	
	public static void main(String[] args) {
		principal h1= new principal(1);
		principal h2= new principal(2);
		principal h3= new principal(3);
		
		h1.start(); // se crea un nuevo hilo
		h2.start();
		h3.start();
		
		System.out.println("soy el hilo principal");
	}

}
