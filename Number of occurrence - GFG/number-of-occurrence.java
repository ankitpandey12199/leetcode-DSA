//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
       int ans[]=searchRange(arr,x);
       if(ans[0]==-1)return 0;
       return ans[1]-ans[0]+1;
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        int n=nums.length;
        ans[0]=searchFirst(nums,target,n);
        if(ans[0]==-1)
            return ans;
      ans[1]=searchLast(nums,target,n);
        return ans;
    }
    int searchFirst(int arr[],int target,int n)
    {
        int beg=0,end=n-1,mid,ans=-1;
        while(beg<=end)
        {
            mid=beg+(end-beg)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                beg=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }    
        }
        return ans;
    }
       int searchLast(int arr[],int target,int n)
    {
        int beg=0,end=n-1,mid,ans=-1;
        while(beg<=end)
        {
            mid=beg+(end-beg)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                beg=mid+1;
            }
            else if(arr[mid]<target)
            {
                beg=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }    
        }
        return ans;
    }
}