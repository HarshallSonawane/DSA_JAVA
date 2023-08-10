class Solution {
    public int lengthOfLIS(int[] nums) {
        
        int n = nums.length;
        return LIS(nums,0,-1, new int[n][n]);
    }
    
    public int LIS(int[] arr, int idx, int prevIdx, int[][] dp){
        
        if(idx == arr.length){
            return 0;
        }
        
         if(prevIdx != -1 && dp[idx][prevIdx]!=0){
            return dp[idx][prevIdx]; 
        }
        
        int factor1 = 0 + LIS(arr, idx+1, prevIdx, dp); //Not consider
        int factor2 = 0;    //consider
        
        //if its first element or it is an increasing subsequence
        if(prevIdx == -1 || arr[idx] > arr[prevIdx]){
            
        //add that count in existing count and check for further references
            factor2 = 1 + LIS(arr, idx+1, idx, dp); 
        }
        
        
        int ans = Math.max(factor1,factor2);
        if(prevIdx != -1){ 
            dp[idx][prevIdx] = ans; 
        }
        return ans;
        
    }
}