class Solution {
    public int longestConsecutive(int[] nums) {
       if(nums.length==0)return 0;
        TreeSet<Integer>set=new TreeSet<>();
        for(int a:nums)
        {
            set.add(a);
        }
        int index=0;
        for(int a:set)
        {
            nums[index++]=a;
        }
       int   max=1,
        curr=1;
        for(int i=1;i<set.size();i++)
        {
            if(nums[i]-1==nums[i-1])
            {
                curr++;
            }
            else
            {
                if(max<curr)
                {
                    max=curr;
                }
                curr=1;
            }
        }
         if(max<curr)
                {
                    max=curr;
                }
        return max;
    }
}