package sumarray;

public class tripleta {

	public static void main(String[] args) {
	
		encontrarTripleta tripleta = new encontrarTripleta();
		//int A[] = {1,4,45,6,10,8};
		int A[] = {7,12,3,1,2,-6,5,-8,6};
		int sum= 0;
		int tam = A.length;
		tripleta.encontrarTripleta(A,tam,sum);
	}
	
	public boolean encontrarTripleta(int A[], int tam, int sum) {
		int l,r;
		for(int i =0;i<tam-2;i++) {
			for(int j=0;j<tam-1;j++) {
				for(int k =0;k<tam;k++) {
					if(A[i]+A[j]+A[k]==sum) {
						System.out.println("la tripleta es: "+A[i]+", "+A[j]+", "+A[k]);
					}
				}
			}
		}
		return false;
	}


}
