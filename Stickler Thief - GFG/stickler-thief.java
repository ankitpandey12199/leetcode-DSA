//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
     return tablulation(arr);
    }
    public int recur(int arr[],int index)
    {
        if(index>=arr.length)
        {
            return 0;
        }    
        int incNext=recur(arr,index+1);
        int excNext=arr[index]+recur(arr,index+2);
        return Math.max(incNext,excNext);
    }
    public int recur(int arr[],int index,int dp[])
    {
        if(index>=arr.length)
        {
            return 0;
        }    
        if(dp[index]!=0)return dp[index];
        int incNext=recur(arr,index+1,dp);
        int excNext=arr[index]+recur(arr,index+2,dp);
        dp[index]=Math.max(incNext,excNext);
        return dp[index];
    }
    public int tablulation(int arr[])
    {
        int prevInc=arr[0];
        int prevExc=0;
        for(int i=1;i<arr.length;i++)
        {
            int incMe=prevExc+arr[i];
            int excMe=Math.max(prevExc,prevInc);
            prevExc=excMe;
            prevInc=incMe;
        }
        return Math.max(prevInc,prevExc);
    }
}