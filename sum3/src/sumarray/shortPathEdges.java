package sumarray;
import java.util.ArrayList;
import java.util.Arrays;
public class shortPathEdges {

	public static void main(String[] args) {
		int n = 4;
		 
	    // Input edges
	    ArrayList<Pair<Pair<Integer, Integer>, Integer>> ed = new ArrayList<Pair<Pair<Integer, Integer>, Integer>>(
	            Arrays.asList(
	                    new Pair<Pair<Integer, Integer>, Integer>(
	                        new Pair<Integer, Integer>(0, 1), 10),
	                    new Pair<Pair<Integer, Integer>, Integer>(
	                        new Pair<Integer, Integer>(0, 2), 3),
	                    new Pair<Pair<Integer, Integer>, Integer>(
	                        new Pair<Integer, Integer>(0, 3), 2),
	                    new Pair<Pair<Integer, Integer>, Integer>(
	                        new Pair<Integer, Integer>(1, 3), 7),
	                    new Pair<Pair<Integer, Integer>, Integer>(
	                        new Pair<Integer, Integer>(2, 3), 7)
	            )
	    );
	 
	    // Source and Destination
	    int s = 0, d = 3;
	 
	    // Number of edges in path
	    int k = 2;
	 
	    // Calling the function
	    System.out.println(smPath(s, d, ed, n, k));

	}
	static class Pair<K, V>
	{
	    K first;
	    V second;
	 
	    public Pair(K first, V second)
	    {
	        this.first = first;
	        this.second = second;
	    }
	}
	static int inf = 100000000;
	// Function to find the smallest path
	// with exactly K edges
	static int smPath(int s, int d,
	                  ArrayList<Pair<Pair<Integer, Integer>, Integer>> ed,
	                  int n, int k)
	{
	     
	    // Array to store dp
	    int[] dis = new int[n + 1];
	     
	    // Initialising the array
	    Arrays.fill(dis, inf);
	    dis[s] = 0;
	 
	    // Loop to solve DP
	    for(int i = 0; i < k; i++)
	    {
	         
	        // Initialising next state
	        int[] dis1 = new int[n + 1];
	        Arrays.fill(dis1, inf);
	 
	        // Recurrence relation
	        for(Pair<Pair<Integer, Integer>, Integer> it : ed)
	            dis1[it.first.second] = Math.min(dis1[it.first.second],
	                                             dis[it.first.first] +
	                                                 it.second);
	        for(int j = 0; j <= n; j++)
	            dis[j] = dis1[j];
	    }
	 
	    // Returning final answer
	    if (dis[d] == inf)
	        return -1;
	    else
	        return dis[d];
	}
}
