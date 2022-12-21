class Solution {
    public int splitArray(int[] arr, int days) {
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
    public boolean isPossible(int arr[],int capcity,int days)
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
}