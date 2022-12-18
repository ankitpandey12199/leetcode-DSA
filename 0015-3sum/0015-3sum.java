class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>(); 
        List<Integer>list;
        int n=arr.length;
        for(int i=0;i<n-2;i++)
        {
            int beg=i+1,end=n-1;
           
            while(beg<end)
            {
                int sum=arr[beg]+arr[end]+arr[i];
                if(sum==0)
                {
                    list=new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[beg]);
                    list.add(arr[end]);
                    ans.add(list);
                    beg++;
                }
                if(sum<0)
                {
                    while(beg<end && arr[beg]==arr[++beg]);
                }
                else
                {
                    while(beg<end && arr[end]==arr[--end]);
                }
            }
         while(i<arr.length-1 && arr[i]==arr[i+1])i++;
        }
        return ans;
    }
}