class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        for(int a:nums)
        {
          if(min>a)
              min=a;
        }
        return min;
    }
}