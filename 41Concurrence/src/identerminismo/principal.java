package identerminismo;
//indeterminismo
//cuando dos hilos escriben en una variable compartida el valor de esta es indeterminado
public class principal extends Thread{
	
	public static int cont =0;
	
	public void run() {
	//el resultado sera de un millon solo cuando todos los hilos secundarios sean ejecutados
		for(int i=0;i<1000;i++){
		//cont = 1000*1000 = 1000000
			cont++;
		}
	}
	
	public static void main(String[] args) {
		principal[] vec = new principal[1000];
		for(int i =0; i< vec.length;i++) {
			vec[i]= new principal();
			vec[i].start();
		}
		try {
			
		}catch(Exception e){}
	}

}
