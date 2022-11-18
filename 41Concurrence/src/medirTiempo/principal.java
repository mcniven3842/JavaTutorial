package medirTiempo;
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
		Random ran = new Random (System.nanoTime());
		double tiempo_inicio, tiempo_final;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				matriz [i][j]= ran.nextInt(10);
			}
		}
		
		//se medita el tiempo
		tiempo_inicio = System.nanoTime(); //hora en nanosegundos
		
		principal h1 = new principal(0,2);
		principal h2 = new principal(2,4);
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		}catch(Exception e) {}
		
		tiempo_final = System.nanoTime()-tiempo_inicio; // registra el tiempo
		System.out.println((tiempo_final/1000000)+" milisegundos");
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[0].length;j++) {
				System.out.print(matriz [i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
