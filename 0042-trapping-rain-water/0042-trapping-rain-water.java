class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int [n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            left[i]=max;
        }
        max=0;
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            right[i]=max;
        }
        int count=0,waterLevel;
        for(int i=0;i<n;i++)
        {
            waterLevel=Math.min(left[i],right[i]);
            if(waterLevel>arr[i])count+=waterLevel-arr[i];
        }
         return count;   
    }
}