class Solution {
    public int singleNonDuplicate(int[] arr) {
     
        int first=0,last=1;
        int beg=0,end=arr.length,mid;
        while(beg<=end)
        {
            mid=beg+(end-beg)/2;
            if(mid!=arr.length-1 && arr[mid]==arr[mid+1])
            {
                first=mid;
                last=mid+1;
            }
            else if(mid!=0 && arr[mid]==arr[mid-1])
            {
                last=mid;
                first=mid-1;
            }
            else return arr[mid];
         
            if(first%2==0)
                beg=mid+1;
            else end=mid-1;
        }
        return -1;
      
    }
}