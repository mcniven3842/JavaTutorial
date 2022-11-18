package sol1Indeterminismo;

import java.util.Random;
public class principal extends Thread{
	private static int tam=8;
	private static int[] vec = new int[tam];
	private int ini, fin;
	
	public principal(int ini, int fin) {
		this.ini=ini;
		this.fin=fin;
	}
	
	public void run() {
		for(int i=ini;i<fin;i++) {
			vec[i]*=10;
		}
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random(System.nanoTime());
		for(int i=0;i<vec.length;i++) {
			vec[i] = rand.nextInt(10);
		}
		
		principal h1 = new principal(0,4);
		principal h2 = new principal(4,8);
		
		h1.start();
		h2.start();
		
		try {
			h1.join();
			h2.join();
		}catch(Exception ex) {
			
		}
		
		for(int i=0;i<vec.length;i++) {
			System.out.println(vec[i]+"");
		}
	}
}
