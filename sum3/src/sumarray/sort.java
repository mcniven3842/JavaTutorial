package sumarray;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		int[] arr = {-1,2,-3,4,5,6,-7,8,9};
		move(arr);
		for(int e:arr)
			System.out.println(e+" ");
		
	}
	
	public static void move(int[]arr) {
		Arrays.sort(arr);
	}
}