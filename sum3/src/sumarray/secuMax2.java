package sumarray;
import java.util.*;
public class secuMax2 {

	public static void main(String[] args) {
	    int[] firstArr = { 3, 5, 1, 8 };
	    int[] secondArr = { 3, 3, 5, 3, 8 };
	    System.out.print(LCS(firstArr, secondArr));
	}
	
	// Function to find the Longest Common
	// Subsequence between the two arrays
	static int LCS(int[] firstArr,int[] secondArr)
	{
	 
	    // Maps elements of firstArr[]
	    // to their respective indices
	    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
	 
	    // Traverse the array firstArr[]
	    for (int i = 0; i < firstArr.length; i++)
	    {
	        mp.put(firstArr[i], i + 1); 
	    }
	 
	    // Stores the indices of common elements
	    // between firstArr[] and secondArr[]
	    Vector<Integer> tempArr = new Vector<Integer>();
	 
	    // Traverse the array secondArr[]
	    for (int i = 0; i < secondArr.length; i++)
	    {
	 
	        // If current element exists in the Map
	        if (mp.containsKey(secondArr[i]))
	        {
	            tempArr.add(mp.get(secondArr[i]));
	        }
	    }
	 
	    // Stores lIS from tempArr[]
	    Vector<Integer> tail = new Vector<Integer>();
	    tail.add(tempArr.get(0));
	 
	    for (int i = 1; i < tempArr.size(); i++)
	    {
	        if (tempArr.get(i) > tail.lastElement())
	            tail.add(tempArr.get(i));
	        else if (tempArr.get(i) < tail.get(0))
	            tail.add(0, tempArr.get(i));     
	    }
	    return (int)tail.size();
	}

}
