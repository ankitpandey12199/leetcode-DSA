//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
            }
            Solution obj=new Solution();
            int res=obj.minimizeCost(arr,N,K);
            System.out.println(res);
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimizeCost(int arr[],int N,int K){
        int dp[]=new int[N];
        Arrays.fill(dp,-1);
        return memo(arr,0,K,dp);
    }
    public int recur(int arr[],int index,int k)
    {
        if(index>=arr.length-1)return 0;
        int min=Integer.MAX_VALUE;
        for(int i=index+1;i<=index+k ;i++)
        {   if(i<arr.length)
            min=Math.min(min,Math.abs(arr[i]-arr[index])+(recur(arr,i,k)));
        }
        return min;
    }
    public int memo(int arr[],int index,int k,int dp[])
    {
         if(index>=arr.length-1)return 0;
         if(dp[index]!=-1)return dp[index];
        int min=Integer.MAX_VALUE;
        for(int i=index+1;i<=index+k ;i++)
        {   if(i<arr.length)
            min=Math.min(min,Math.abs(arr[i]-arr[index])+(memo(arr,i,k,dp)));
        }
        return dp[index]=min;
    }
}
