class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,ans, new ArrayList<>());
        return ans;
    } 
    public void helper(int ind,int[] nums,List<List<Integer>> ans,ArrayList<Integer> result){
     
        ans.add(new ArrayList<>(result));
        
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i] == nums[i-1]) continue;  // makes sure it is the first occurence of the element and that its not dupicate
            result.add(nums[i]);
            helper(i+1,nums,ans,result);
            result.remove(result.size()-1);
        }
    }
}