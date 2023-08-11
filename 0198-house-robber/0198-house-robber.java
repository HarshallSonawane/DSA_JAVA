class Solution {
    public int rob(int[] nums) {
        
        int[] dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return helper(nums, 0, dp);
    }
    
    public int helper(int[] arr, int ind, int[] dp){
        
        if(ind == arr.length-1){
            return dp[ind] = arr[ind];
        }
      
        if(ind>=arr.length){
            return 0;
        }
        
        if(dp[ind]!=-1){
            return dp[ind];
        }
        
        int f1 = arr[ind] + helper(arr, ind+2, dp);
        int f2 = helper(arr,ind+1,dp);
        dp[ind] = Math.max(f1,f2);
        return dp[ind];
    }
}
    
    //  int evenAns=0;
    //     int oddAns = 0;
    //     if(arr.length%2 == 0){
    //         for(int i=0;i<arr.length-1;i+=2){
    //             evenAns += arr[i];
    //         }
    //         for(int i=1;i<arr.length;i+=2){
    //             oddAns += arr[i];
    //         }
    //     }else{
    //         for(int i=0;i<arr.length;i+=2){
    //             evenAns += arr[i];
    //         }
    //         for(int i=1;i<arr.length;i+=2){
    //             oddAns += arr[i];
    //         }
    //     }
    //     return Math.max(evenAns,oddAns);
    // }