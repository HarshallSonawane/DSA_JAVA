class Solution {
    private void helper(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        if(target == 0) {
            ans.add(new ArrayList<>(ds)); 
            return; 
        }
        
        for(int i = ind; i < arr.length;i++) {
            if(i > ind && arr[i] == arr[i-1]) continue; 
            if(arr[i]>target) break; 
            
            ds.add(arr[i]); 
            helper(i+1, arr, target - arr[i], ans, ds); 
            ds.remove(ds.size() - 1); 
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates); 
        helper(0, candidates, target, ans, new ArrayList<>()); 
        return ans; 
    }
}
/*
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    
    public void helper(int i, int[] arr, int target,List<List<Integer>> ans, List<Integer> result){
        
        if(target == 0){
            ans.add(new ArrayList<>(result));
            return;
        }
            
        for(int j=i;j<arr.length;j++){
            
            if(j > i && arr[j] == arr[j-1])continue;
            if(arr[j]>target)break;
            
            result.add(arr[j]);
            helper(j+1,arr,target-arr[j],ans,result);
            result.remove(result.size()-1);
           
        }
        
    }
}
*/