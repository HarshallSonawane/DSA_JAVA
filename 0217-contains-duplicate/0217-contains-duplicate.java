import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        boolean ans=false;
        int check=nums[0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        for(int i=0;i<nums.length-1;i++){
            
            if(nums[i]==nums[i+1]){
                ans = true;
            }
        }
        return ans;
    }
}