class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit =0;
        int n = prices.length;
        for(int i=1; i<n; i++){
             if(buy<prices[i]){
                profit = Math.max(prices[i]-buy,profit);
             }
             else{
                buy=prices[i];
             }
        }
            return profit;
    }
    
}