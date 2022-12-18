class Solution {
    public int maxProfit(int[] prices) {
     int cp=Integer.MAX_VALUE,sp=0,total=0;   
     for(int a:prices)
     {
         if(a<cp)
         {
             cp=a;
         }
         else
         {
             sp=a-cp;
             cp=a;
             total+=sp;
         }
        
     }
        return total;
    }
}