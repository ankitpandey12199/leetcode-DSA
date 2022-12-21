class Solution {
    public int searchInsert(int[] arr, int x) {
        int floor=-1;
        int beg=0,end=arr.length-1;
        while(beg<=end)
        {
            int mid=beg+(end-beg)/2;
            if(arr[mid]==x)return mid;
            if(arr[mid]<x)
            {
                floor=mid;
                beg=mid+1;
            }
            else end=mid-1;
        }
        return floor+1;

    }
}