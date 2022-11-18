package sumarray;

public class encontrarTripleta {

	

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
