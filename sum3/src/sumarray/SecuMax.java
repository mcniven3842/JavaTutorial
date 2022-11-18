package sumarray;
import java.io.*;
import java.util.*;
public class SecuMax {

	public static void main(String[] args) {
        int arr[] = { 8, 5, 4, 8, 4 };
        int N = arr.length;
        longestSequence(arr, N);
	}
	
    static void longestSequence(int arr[], int N)
    {
        if (N == 0) {
            System.out.println(0);
            return;
        }
         Arrays.sort(arr);
 
        // Stores the maximum length
        int maxLen = 1;
        int len = 1;
 
        // Traverse the array
        for (int i = 1; i < N; i++) {
            if (arr[i] == arr[i - 1]
                || arr[i] == arr[i - 1] + 1) {
                len++;
                maxLen = Math.max(maxLen, len);
            }
            else {
                len = 1;
            }
        }
        System.out.println(maxLen);
    }

}
