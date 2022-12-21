class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        helper("",0,0,ans,n);
        return ans;
    }
    public void helper(String str,int open,int close,List<String>list,int n)
    {
       // System.out.println(str);
        if(str.length()==n*2)
        {
          list.add(str);
            return;
        }
        if(open<n)
        {
            
            helper(str+'(',open+1,close,list,n);
        }
        if(close<open)
        {
           
            helper(str+')',open,close+1,list,n);
        }
       
    }
}