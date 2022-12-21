class Solution {
    public int search(int[] arr, int target) {
        int beg=0,end=arr.length-1,mid;
        while(beg<=end)
        {
            mid=beg+(end-beg)/2;
              if(arr[mid]==target )
                    return mid;
            if(arr[beg]<=arr[mid] )
            {
                if(arr[beg]<=target && arr[mid]>=target)
                {
                    end=mid-1;
                }
                else 
                {
                    beg=mid+1;
                }
            }
            else
            {
              
               if(arr[mid]<=target && arr[end]>=target)
                {
                    beg=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}