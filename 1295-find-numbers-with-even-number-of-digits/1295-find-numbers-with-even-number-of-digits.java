class Solution {
    public int findNumbers(int[] nums) {
        
        int count = 0;
        int finalCount =0;
        for(int num : nums){
            while(num>0){
                ++count;
                num = num/10;
            }
            if(count%2 == 0){
                ++finalCount;
            }
            count=0;
        }
        //System.out.println(count);
        
        //System.out.println(finalCount);
        return finalCount;
    }
}