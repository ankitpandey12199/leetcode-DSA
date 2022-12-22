class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
          List<List<Integer>>list=new ArrayList<>();
        boolean arr[]=new boolean[nums.length];
        helper(nums,new ArrayList<>(),list,0,arr);
        return list;
    }
    public void helper(int arr[],List<Integer>list,List<List<Integer>>ans,int index,boolean visited[])
        
    {  
        if(index==arr.length){
        ans.add(new ArrayList<Integer>(list));
        return;
    }
        for(int i=0;i<arr.length;i++)
        {  
            if(!visited[i])
            { 
            visited[i]=true;
            list.add(arr[i]);
            helper(arr,list,ans,index+1,visited);
            list.remove(list.size()-1);
            visited[i]=false;
            while(i<arr.length-1 && arr[i]==arr[i+1])i++;    
            }
        }
    }
}