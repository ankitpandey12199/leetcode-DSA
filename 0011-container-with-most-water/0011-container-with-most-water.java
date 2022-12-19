class Solution {
    public int maxArea(int[] arr) {
        int beg=0,end=arr.length-1;
        int max=0;
        while(beg<end)
        {   int min=Math.min(arr[beg],arr[end]);
            int curr=(end-beg)*min;
            max=Math.max(max,curr);
            if(arr[beg]==min)
                beg++;
             else 
               end--;
        }
        return max;
    }
}