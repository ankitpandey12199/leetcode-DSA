//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{


    static Boolean isSubsetSum(int N, int arr[], int sum){
        return tabulation(arr,sum);
    }
    public static boolean recur(int arr[],int idx,int sum)
    {
        if(sum==0)return true;
        if(idx==arr.length)return true;
        boolean pick=recur(arr,idx+1,sum-arr[idx]);
        boolean notPick=recur(arr,idx+1,sum);
        return pick||notPick;
    }
    public static int memorisation(int arr[],int idx,int sum,int dp[][])
    {
        if(sum==0)
        return dp[sum][idx]=1;
        if(idx==arr.length || sum<0)return -1;
        if(dp[sum][idx]!=0)return dp[sum][idx];
        int pick=memorisation(arr,idx+1,sum-arr[idx],dp);
        int notPick=memorisation(arr,idx+1,sum,dp);
        if(pick==1 ||notPick==1)
        {
            dp[sum][idx]=1;
        }
        else dp[sum][idx]=-1;
        return dp[sum][idx];
    }
    public static boolean tabulation(int arr[],int k)
    {
       boolean prev[]= new boolean[k+1];
    int n=arr.length;
    prev[0] = true;
    
    if(arr[0]<=k)
        prev[arr[0]] = true;
    
    for(int ind = 1; ind<n; ind++){
        boolean cur[]=new boolean[k+1];
        cur[0] = true;
        for(int target= 1; target<=k; target++){
            boolean notTaken = prev[target];
    
            boolean taken = false;
                if(arr[ind]<=target)
                    taken = prev[target-arr[ind]];
        
            cur[target]= notTaken||taken;
        }
        prev=cur;
      
    }
    
    return prev[k];
    }
}