class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums,ans,new ArrayList<>());
        return ans;
    }
    
    public void helper(int ind, int[] arr,List<List<Integer>> ans,ArrayList<Integer> result){
        
      
        ans.add(new ArrayList<>(result));
    
        
        for(int i=ind;i<arr.length;i++){
             
            result.add(arr[i]);
            helper(i+1,arr,ans,result);
            result.remove(result.size()-1);
        }
       
        
    }
}