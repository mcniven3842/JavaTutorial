package numHilosDinamico;
import java.util.Random;


public class principal extends Thread{
	private static int tam =4;
	private static int [][]matriz = new int [tam][tam];
	private int inicio, fin;
	
	public principal(int inicio,int fin) {
		this.inicio = inicio;
		this.fin = fin;
	}
	
	public void run() {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz [i][j] *=10;
			}
		}
	}
	public static void main(String[] args) {
		//####################################################
		// obtiene informacion del computador
		Runtime runtime = Runtime.getRuntime();
		// se definira cuantos nucleso tiene l computador
		int nNucleos = runtime.availableProcessors();
		System.out.println("numero nucleos:"+nNucleos);
		
		//###################################################
		Random ran = new Random (System.nanoTime());
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz [i][j]= ran.nextInt(10);
			}
		}
		
		Thread[] hilos = new Thread[nNucleos];
		int rango = tam/nNucleos;
		int start =0;
		int finish = rango;
		
		for(int i=0;i<nNucleos;i++) {
			if(i!=nNucleos-1) {
				hilos[i]= new principal(start, finish);
				hilos[i].start();
				start = finish;
				finish +=rango;
			}
			else {
				hilos[i]= new principal(start, tam);
				hilos[i].start();				
			}
		}

		// coturrinta para hacer garatizar que se ejecuten todos los hilos
		for (int i=0;i<nNucleos;i++) {
			try {
				hilos[i].join();
			}catch(Exception e) {}
		}

		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz [i][j]+" ");
			}
			System.out.println(" ");
		}
	}
	
}
