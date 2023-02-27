class Solution {
    public int singleNumber(int[] nums) {
        
        //Set Integer> set = new HashSet<>();
        Arrays.sort(nums);
        if(nums.length == 1){
            return nums[0];
        }
        if(nums[0] != nums[1]){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }

        int start = 0;
        int end = nums.length-1;
        int mid =0;
        while(start<=end){
            
            mid = start + (end - start)/2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!= nums[mid+1]){
                return nums[mid];
            }
            else if(mid%2==0)
            {
               if(mid!=nums.length-1 && nums[mid]==nums[mid+1])
               start=mid+2;
               else
               end=mid-2;
            }
            else
            {
                if(nums[mid]==nums[mid-1])
                start=mid+1;
                else
                end=mid-1;
            }
        }
        return nums[mid];
}
}