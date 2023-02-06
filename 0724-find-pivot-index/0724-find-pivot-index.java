class Solution {
    public int pivotIndex(int[] nums) {
        
        int leftSum =0;
        int rightSum =0;
        int totalSum=0;
        
        for(int num:nums){
            totalSum+=num;
        }
        
        for(int i=0;i<nums.length;leftSum+=nums[i++]){
            
              
            if (leftSum * 2 == totalSum - nums[i])
                return i;
        }
        
        return -1;
    }
}