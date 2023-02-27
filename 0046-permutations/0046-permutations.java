class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
       List<List<Integer>> ans = new ArrayList<>();
       ArrayList<Integer> ds = new ArrayList<>();
       boolean[] count = new boolean[nums.length];
       helper(nums,ans,ds,count);
       return ans;
    
    }
    
    public List<List<Integer>> helper(int[] nums, List<List<Integer>> ans,ArrayList<Integer> ds,boolean[] count){
     
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return ans;
        }
        
        for(int i=0;i<nums.length;i++){
            if(!count[i]){
                count[i] = true;
                ds.add(nums[i]);
                helper(nums,ans,ds,count);
                ds.remove(ds.size()-1);
                count[i] = false;
            }
        }
        return ans;
    }
}
    