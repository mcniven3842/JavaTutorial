package runnableSincrhonized;

public class principal implements Runnable{

	private static int cont=0;
	private static Object object = new Object();
	
	@Override
	public void run() {
		
			synchronized(object) {
				for(int i=0;i<20000;i++) {
				cont++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
// ejemplo de como usar hilos con la interfaz runneable		
//		Runnable runnable = new principal();
//		Thread hilo1 = new Thread(runnable);
//		hilo1.start();
//		try{
//			hilo1.join();
//		}catch(Exception ex) {}
		Runtime runtime = Runtime.getRuntime();
		int nNucleos = runtime.availableProcessors();
		
		Thread[] hilos = new Thread[nNucleos];
		for(int i=0;i<hilos.length;i++) {
//			opcion 1 para lanzar hilos
//			hilos[i]= new Thread(new principal());
//			hilos[i].start();
//			Opcion 2			
			Runnable runnable = new principal();
			hilos[i]= new Thread(runnable);
			hilos[i].start();
		}
		
		for(int i=0;i<hilos.length;i++) {
			try {
				hilos[i].join();
			}catch(Exception ex) {}
		}
		System.out.println("contador:"+cont);
	}
	
}
