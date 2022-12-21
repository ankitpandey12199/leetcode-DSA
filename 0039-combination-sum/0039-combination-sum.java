class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>list=new ArrayList<>();
        helper(list,new ArrayList<>(),target,0,candidates);
        return list;
    }
    public void helper(List<List<Integer>>ans,List<Integer>list,int target,int index,int arr[]){
       
        if(index==arr.length || target<0)
            return ;
        if(target==0)
        {
            ans.add(new ArrayList<>(list));
            return ;
        }
        if(arr[index]<=target)
        {
            list.add(arr[index]);
            helper(ans,list,target-arr[index],index,arr);
            list.remove(list.size()-1);
        }
            helper(ans,list,target,index+1,arr);

    }
}