//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
       return shipWithinDays(A,M);
    }
      public static int shipWithinDays(int[] arr, int days) {
          if(arr.length<days)return -1;
        int beg=0;
        int end=0,mid;
        for(int a:arr)
        {
            end+=a;
        }
        int ans=end;
        while(beg<=end)
        {
            mid=beg+(end-beg)/2;
            if(isPossible(arr,mid,days))
            {
                ans=mid;
                end=mid-1;
            }
            else beg=mid+1;
        }
        return ans;
    }
    public static boolean isPossible(int arr[],int capcity,int days)
    {
     int sum=0,day=1;
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>capcity)
                    return false;
            if(arr[i]+sum>capcity)
            {
                sum=0;
                day++;
            }
            sum+=arr[i];
        }
        return day<=days;
    }
};