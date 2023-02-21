//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java
//User function Template for Java

class Solution
{
	public static int minIteration(int N, int M, int x, int y){
		int first = Math.abs(x-1-0)+Math.abs(y-1-0);
		int second = Math.abs(x-N)+Math.abs(y-1-0);
		int third = Math.abs(x-1-0)+Math.abs(y-M);
		int fourth = Math.abs(x-N)+Math.abs(y-M);
		return Math.max(first,Math.max(second,Math.max(third,fourth)));
	}
}

//{ Driver Code Starts.

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
        	String input[]=read.readLine().trim().split(" ");
            int N = Integer.parseInt(input[0]);
            int M=Integer.parseInt(input[1]);
           	input=read.readLine().trim().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            Solution ob = new Solution();
            System.out.println(ob.minIteration(N, M, x, y));
        }
        
    }
}
// } Driver Code Ends