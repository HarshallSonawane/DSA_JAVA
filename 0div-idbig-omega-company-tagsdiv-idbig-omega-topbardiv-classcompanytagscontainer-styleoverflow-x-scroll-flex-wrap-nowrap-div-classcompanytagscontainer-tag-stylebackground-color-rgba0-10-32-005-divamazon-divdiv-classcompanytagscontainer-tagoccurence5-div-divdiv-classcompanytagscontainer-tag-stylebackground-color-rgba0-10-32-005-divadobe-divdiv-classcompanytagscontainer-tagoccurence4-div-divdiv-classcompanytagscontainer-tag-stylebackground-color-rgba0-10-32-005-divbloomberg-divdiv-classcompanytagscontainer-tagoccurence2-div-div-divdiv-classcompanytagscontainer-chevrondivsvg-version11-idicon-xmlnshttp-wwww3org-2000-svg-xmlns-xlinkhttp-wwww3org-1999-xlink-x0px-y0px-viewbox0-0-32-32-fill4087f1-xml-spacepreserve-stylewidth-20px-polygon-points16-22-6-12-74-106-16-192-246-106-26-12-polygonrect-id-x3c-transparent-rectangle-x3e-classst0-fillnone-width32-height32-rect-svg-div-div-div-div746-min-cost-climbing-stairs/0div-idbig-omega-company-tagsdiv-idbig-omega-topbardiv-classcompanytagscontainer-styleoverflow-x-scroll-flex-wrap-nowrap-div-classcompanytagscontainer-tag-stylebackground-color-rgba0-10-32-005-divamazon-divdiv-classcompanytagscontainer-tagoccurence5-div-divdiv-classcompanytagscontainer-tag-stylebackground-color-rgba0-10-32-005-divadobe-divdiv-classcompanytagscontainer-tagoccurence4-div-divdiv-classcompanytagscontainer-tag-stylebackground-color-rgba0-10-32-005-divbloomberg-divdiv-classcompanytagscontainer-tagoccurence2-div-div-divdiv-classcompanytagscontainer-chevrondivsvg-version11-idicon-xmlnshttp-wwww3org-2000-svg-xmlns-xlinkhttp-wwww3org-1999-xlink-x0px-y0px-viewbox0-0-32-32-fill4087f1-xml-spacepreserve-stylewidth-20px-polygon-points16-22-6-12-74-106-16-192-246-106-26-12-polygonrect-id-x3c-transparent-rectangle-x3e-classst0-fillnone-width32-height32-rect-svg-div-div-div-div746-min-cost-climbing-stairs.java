class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int n = cost.length;
        int[] dp = new int[n];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2;i<dp.length;i++){
            dp[i] = Math.min(dp[i-1],dp[i-2]) + cost[i];
        }
        return Math.min(dp[n-1], dp[n-2]);  
    }
    
//MEMOIZATION   
    
// return helper(cost, cost.length, new int[cost.length+1]);
    
//     public int helper(int[] arr, int n, int[] dp){
        
//         if(n == 1){return arr[0];}
//         if(n == 2){return arr[0]+arr[1];}
        
//         if(dp[n]!=0){return dp[n];}
        
//         int f1 = helper(arr,n-1,dp);
//         int f2 = helper(arr,n-2,dp);
//         int ans = Math.min(f1,f2) + arr[n-1];
//         dp[n] = ans;
//         return ans;
        
//     }
    
}