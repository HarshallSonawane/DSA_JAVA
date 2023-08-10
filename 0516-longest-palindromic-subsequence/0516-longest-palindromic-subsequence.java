class Solution {
    public int longestPalindromeSubseq(String s1) {
        
        // String s2 = "";
        // for(int i=s1.length()-1;i>=0;i--){
        //     s2 = s2+s1.charAt(i);
        // }
        
        return helper(s1,0,s1.length()-1,new Integer[s1.length()][s1.length()]);
    }
    
    public int helper(String s1, int i, int j, Integer[][] dp){
        
        if(i > j){
            return 0;
        }
        
        if(i == j){
            return 1;
        }
        
        if(dp[i][j] != null){
            return dp[i][j];
        }
        
        int take = 0;
        if(s1.charAt(i) == s1.charAt(j)){
            take = 2 + helper(s1,i+1,j-1,dp);
        }
        int dontTake = Math.max(helper(s1,i,j-1,dp), helper(s1,i+1,j,dp));
        
        
        return dp[i][j] = Math.max(take, dontTake);
         
    }
}