class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int profit=0;
        int min=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            min=prices[i-1];
            if(prices[i]>min){
                profit+=prices[i]-min;
            }

        }
        return profit;     
    }
}