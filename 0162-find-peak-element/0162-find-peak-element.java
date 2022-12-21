class Solution {
    public int findPeakElement(int[] arr) {
        int n=arr.length;
         int beg=0,end=n-1;
        int mid=0;
        while(beg<end)
        {
            mid=beg+(end-beg)/2;
            if(arr[mid]<arr[mid+1])
                beg=mid+1;
            else end=mid; 
        }
        return beg;
    }
}