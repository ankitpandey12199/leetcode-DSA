class Solution {
    public int[] twoSum(int[] nums, int target) {
        int beg=0,end=nums.length-1;
       while(beg<end)
       {
           int sum=nums[beg]+nums[end];
           if(sum==target)
           {
               return new int []{beg+1,end+1};
           }
           else if(sum<target)
           {
               beg++;
           }
           else 
           {
               end--;
           }
       }
        return null;
    }
}