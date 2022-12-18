class Solution {
    public int maxProfit(int[] prices) {
          int max=0;
          int min=Integer.MAX_VALUE;
        for(int a:prices)
        {
            min=Math.min(a,min);
            max=Math.max(max,a-min);
        }
        return max;
    }
}