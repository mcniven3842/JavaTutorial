package sumarray;
import java.util.*;
public class numerosSumados3 {

	public static void main(String[] args) {
        int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;
        boolean encontro = encontrarNum(A,sum,arr_size);
	}
	
	public static boolean encontrarNum (int A[], int sum, int arr_size) {
		for(int i=0; i<arr_size-2;i++) {
			HashSet <Integer> s = new HashSet<Integer>();
			int resto = sum-A[i];
			for(int j=0; j<arr_size;j++) {
				if(s.contains(resto-A[j])) {
					System.out.println("los numeros sumados son: "+ A[i] + ", " + A[j] +", " + (resto-A[j]));
					return true;
				}
				s.add(A[j]);
			}
		}
		return false;
	}
}


