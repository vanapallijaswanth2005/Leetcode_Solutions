class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy=prices[0];
        int sell=0;
        for(int i=1;i<n;i++)
        {
            if(prices[i]<buy)
            {
                buy=prices[i];
            }
            else if(prices[i]-buy>sell)
            {
                sell=prices[i]-buy;
            }
        }
        return sell;
    }
}