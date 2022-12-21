class Solution {
    
    public List<String> generateParenthesis(int n) {
        char  arr[]=new char [n*2];
        List<String>list=new ArrayList<>();
        helper(arr,0,n,0,0,list);
            return  list;
    }
    void helper(char arr[],int index,int n,int open,int close,List<String>list)
    {
        if(open>n || close > n || open<close )
            return ;
        if(index==n*2)
        {
            list.add(String.valueOf(arr));
            return;
        }
        arr[index]='(';
        helper(arr,index+1,n,open+1,close,list);
        arr[index]=')';
        helper(arr,index+1,n,open,close+1,list);     
    }
}