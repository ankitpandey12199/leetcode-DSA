class Solution {
    public int findMin(int[] arr) {
          int beg=0,end=arr.length-1,mid;
        if(arr[beg]<arr[end])return arr[beg];
        while(beg<end)
        {
            mid=beg+(end-beg)/2;
            if(arr[end]<arr[mid])
            {
                beg=mid+1;
            }
            else if(arr[end]>arr[mid])
            {
                end=mid;
            }
            else 
                end--;
        }
     return arr[end];
    }
}