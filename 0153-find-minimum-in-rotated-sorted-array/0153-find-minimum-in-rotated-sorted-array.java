class Solution {
    public int findMin(int[] arr) {
          
          int beg=0,end=arr.length-1,mid,ans=arr[0];
        while(beg<end)
        {
            mid=beg+(end-beg)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return arr[mid+1];
            else if(mid>beg && arr[mid]<arr[mid-1])
                return arr[mid];
            if(arr[beg]>arr[mid])
                end=mid-1;
            else beg=mid+1;
        }
     return ans;
    }
  
}