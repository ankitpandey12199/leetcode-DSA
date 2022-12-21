class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int right[]=new int[n];
        int sum=0;
        for(int i=n-1;i>=0;i--)
        {
            right[i]=sum;
            sum+=nums[i];
        }
         sum=0;
        for(int i=0;i<n;i++)
        {
            if(sum==right[i])
                return i;
            sum+=nums[i];
        }
        return -1;
    }
}