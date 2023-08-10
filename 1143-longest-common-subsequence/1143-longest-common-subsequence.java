class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        
        
        //                                                          STORAGE
        return helper(s1, s2, s1.length()-1, s2.length()-1, new Integer[s1.length()][s2.length()]);
    }
    
    public int helper(String s1, String s2, int i, int j, Integer[][] dp){
        
        
        if(i == -1 || j == -1){
            return 0;
        }
        
        
        // REDUCE
        if(dp[i][j] != null){
            return dp[i][j];
        }
        
        int take = 0;
        if(s1.charAt(i) == s2.charAt(j)){
            take = 1 + helper(s1,s2,i-1,j-1,dp);
        }
        int dontTake = Math.max(helper(s1,s2,i,j-1,dp), helper(s1,s2,i-1,j,dp)); 
        
        
        //STORE
        // dp[i][j] = Math.max(take,dontTake);
        // return dp[i][j];
        return dp[i][j] = Math.max(take,dontTake);
    }
}