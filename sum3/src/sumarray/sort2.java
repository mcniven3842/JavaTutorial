package sumarray;
import java.io.*;
public class sort2 {

	public static void main(String[] args) {
		int arr[]= {-1,2,-3,4,5,6,-7,8,9};
		int n = arr.length;
		organiza(arr,n);
		imprimir(arr,n);

	}
	
	static void organiza(int arr[], int n) {
		int j=0, temp;
		for(int i=0;i<n;i++) {
			if(arr[i]<0) {
				if(i!=j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
				j++;
			}
		}
	}
	
	static void imprimir(int[]arr, int n) {
		for(int i =0; i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	

}
