class Solution {
    static final int INT_SIZE = 32;
    public int singleNumber(int[] nums) {
        
        int res = 0;
        int sum, x;
        for(int i=0;i<INT_SIZE;i++){
            sum = 0;
            x = (1 << i);
            for(int j=0;j<nums.length;j++){
                if((nums[j] & x)!= 0){
                    sum++;
                }
            }
            
            if((sum%3) != 0){
                res |= x;
            }
        }
        return res;
    }
}