class Solution {
    public int maxProfit(int[] prices) {
        
        int lsf = Integer.MAX_VALUE;
        int totalProfit = 0;
        int pist = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(totalProfit < pist){
                totalProfit = pist;
            }
        }
        return totalProfit;
        
    }
}