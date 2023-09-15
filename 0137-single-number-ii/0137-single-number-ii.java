class Solution {
    static final int INT_SIZE = 32;
    public int singleNumber(int[] nums) {
        
        int res = 0;
        int sum, x;
        
        // traverse through all bits
        for(int i=0;i<INT_SIZE;i++){
            sum = 0;
            
            
            x = (1 << i);
            
            for(int j=0;j<nums.length;j++){
                
                // to find out number of set bits
                if((nums[j] & x)!= 0){
                    sum++;
                }
            }
            
            //if not multiple of three, we perform OR op with result
            if((sum%3) != 0){
                res |= x;
            }
        }
        return res;
    }
}