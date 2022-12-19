class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
       HashMap<Integer,Integer>map=new HashMap<>();//map for storing the value and the index
        int ans[]=new int [2];
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                ans[0]=map.get(target-nums[i]);
                ans[1]=i;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}