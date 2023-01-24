//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] arr)
    {
        int n=arr.length;
        int lis[]=new int[n];
        int lds[]=new int[n];
        for(int i=0;i<n;i++)
        {

            for (int j = 0; j < i; j++) {
                if(arr[j]<arr[i])
                {
                    lis[i]=Math.max(lis[i],lis[j]);
                }
               
            }
             lis[i]++;
        }
        for(int i=n-1;i>=0;i--)
        {

            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[i])
                {
                    lds[i]=Math.max(lds[i],lds[j]);
                }
            }
            lds[i]++;
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
           max=Math.max(lis[i]+lds[i],max);
        }
        return max-1;
    }
}