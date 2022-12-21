class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
           List<List<Integer>>list=new ArrayList<>();
        helper(list,new ArrayList<>(),target,candidates,candidates.length,0);
        return list;
    }
     public void helper(List<List<Integer>>ans,List<Integer>list,int target,int arr[],int n,int index)
    {
        if( target<0)
            return ;
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
         int prev=-1;
        for(int i=index;i<n;i++)
        {   if(arr[i]!=prev && arr[i]<=target)
            {
            list.add(arr[i]);
            helper(ans,list,target-arr[i],arr,n,i+1);
            prev=arr[i];
            list.remove(list.size()-1);
            }
        }
       
    }
}