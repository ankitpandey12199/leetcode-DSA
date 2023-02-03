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
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=sc.nextInt();
                
            }
            Solution obj=new Solution();
            int res=obj.minimumEnergy(arr,N);
            System.out.println(res);
            
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    public int minimumEnergy(int arr[],int N){
        return mostOptimised(arr);
    }
    public int recur(int arr[],int index)
    {
        if(index>=arr.length-1)return 0;
        int pick=Integer.MAX_VALUE,pickNext=Integer.MAX_VALUE;
        if(index+1<arr.length)
         pick= Math.abs(arr[index]-arr[index+1])+recur(arr,index+1);
        if(index+2<arr.length) 
         pickNext=Math.abs(arr[index]-arr[index+2])+recur(arr,index+2);
        return Math.min(pick,pickNext);
    }
    public int memo(int arr[],int index,int []dp)
    {
        if(index>=arr.length-1)return 0;
        if(dp[index]!=0)return dp[index];
        int pick=Integer.MAX_VALUE,pickNext=Integer.MAX_VALUE;
        if(index+1<arr.length)
         pick= Math.abs(arr[index]-arr[index+1])+memo(arr,index+1,dp);
        if(index+2<arr.length) 
         pickNext=Math.abs(arr[index]-arr[index+2])+memo(arr,index+2,dp);
        return dp[index]=Math.min(pick,pickNext);
    }
    public int tabulation(int arr[],int dp[])
    {   for(int index=arr.length-1;index>=0;index--){  
        if(index==arr.length-1)
        {
        dp[index]= 0;
        continue;
        }
        int pick=Integer.MAX_VALUE,pickNext=Integer.MAX_VALUE;
        if(index+1<arr.length)
         pick= Math.abs(arr[index]-arr[index+1])+memo(arr,index+1,dp);
        if(index+2<arr.length) 
         pickNext=Math.abs(arr[index]-arr[index+2])+memo(arr,index+2,dp);
         dp[index]=Math.min(pick,pickNext);
       }
       return dp[0];
    }
    public int mostOptimised(int arr[])
    {
        int last=0,lastSecond=0;
        for(int i=1;i<arr.length;i++)
        {
            int ps=Math.abs(arr[i]-arr[i-1])+last;
            int fs=Integer.MAX_VALUE;
            if(i>1)
            {
                fs=lastSecond+Math.abs(arr[i]-arr[i-2]);
            }
            int curr=Math.min(ps,fs);
            lastSecond=last;
            last=curr;
        }
        return last;
    }
}