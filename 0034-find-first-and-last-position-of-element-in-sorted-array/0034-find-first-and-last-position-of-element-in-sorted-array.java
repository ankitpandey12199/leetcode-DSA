class Solution {
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

