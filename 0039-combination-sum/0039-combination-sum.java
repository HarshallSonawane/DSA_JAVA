class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
    
public static void helper(int i, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> result){
        
        if(i == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(result));
            }
            return;
        }
    
        if(arr[i]<=target){
            
            result.add(arr[i]);
            helper(i,arr,target-arr[i],ans,result);
            result.remove(result.size()-1);
        }  
        helper(i+1, arr,target, ans,result);
    }
}