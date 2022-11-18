package waitNotifiall;
import java.util.Random;

public class principal implements Runnable{

	private int id;
	private static Random cerrojo = new Random();
	private int cont=0;
	
	public principal() {
		this.id=id;
	}
	
	@Override
	public void run() {
		synchronized(cerrojo) {
			System.out.println("Hola soy el hilo: "+id);
			cont++;
		}
	}
	
	
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int nNucleos = runtime.availableProcessors();
		
		Thread[] hilos = new Thread[nNucleos];
		
		for(int i=0;i<nNucleos;i++) {
			Runnable runnable = new principal();
			hilos[i]= new Thread(runnable);
			hilos[i].start();
		}
		for(int i=0;i<hilos.length;i++) {
			try {
				hilos[i].join();
			}catch(Exception ex) {}
		}
		System.out.println("Hola soy el hilo principal");
	}

}
