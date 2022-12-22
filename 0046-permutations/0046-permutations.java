class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        helper(nums,list,0,nums.length);
        return list;
    }
    public void helper(int arr[],List<List<Integer>>ans,int index,int n)
        
    {  
        if(index==n){
             List<Integer>list=new ArrayList<Integer>();
       for(int a:arr)
       {
           list.add(a);
       }
      ans.add(list);
        return;
    }
      
       
        
        for(int i=index;i<n;i++)
        {    
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

            helper(arr,ans,index+1,n);
             
            temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;

        }
    }
}