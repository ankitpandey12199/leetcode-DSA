class Solution {
    public int waysToSplitArray(int[] nums) {
        long leftSum=0,rightSum=0;
        int count=0;
        for(int a:nums)rightSum+=a;
        for(int i=0;i<nums.length-1;i++)
        {
            leftSum+=nums[i];
            rightSum-=nums[i];
            if(leftSum>=rightSum)
                count++;
        }
        return count;
    }
}