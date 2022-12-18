class Solution {
     int pos[]=new int[100000];
        int neg[]=new int[100000];
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
       
        int i=0,j=0;
       for(int a:nums)
       {
           if(a<0)
           {
               neg[i++]=a;
           }
           else
           {
               pos[j++]=a;
           }
       }
        i=0;j=0;
        for(int a=0;a<n;a++)
        {
            if(a%2==0)
            {
                nums[a]=pos[j++];
            }
            else
            {
                nums[a]=neg[i++];
            }
        }
        return nums;
    }
}