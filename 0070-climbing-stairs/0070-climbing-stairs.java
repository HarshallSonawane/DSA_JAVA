class Solution {
    public int climbStairs(int n) {
        return helper(n, new int[n+1]);
    }

    public int helper(int n, int[] dp){
        
        if(n ==0){return 1;}
        if(n < 0){return 0;}
        
        if(dp[n]!=0){
            return dp[n];
        }
        
        int ans = helper(n-1,dp) + helper(n-2,dp);
        dp[n] = ans;
        return ans;
    }
}