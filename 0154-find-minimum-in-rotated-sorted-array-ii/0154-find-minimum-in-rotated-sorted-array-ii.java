class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int a:nums)
        {
            min=Math.min(a,min);
        }
        return min;
    }
}