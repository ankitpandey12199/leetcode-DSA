class Solution {
    public int maxArea(int[] arr) {
        int beg=0,end=arr.length-1;
        int max=0,min,curr;
        while(beg<end)
        {  
        if(arr[beg]<arr[end])
        {
            min=arr[beg];
        }
         else
         {
             min=arr[end];
         }
           curr=(end-beg)*min;
           if(max<curr)
           {
               max=curr;
           }
            if(arr[beg]==min)
                beg++;
             else 
               end--;
        }
        return max;
    }
}