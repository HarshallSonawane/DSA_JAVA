class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        generateSubsets(1, n, k, new ArrayList<>(), ans);
        return ans;
    }
    
    public void generateSubsets(int start, int n, int k , List<Integer> curr, List<List<Integer>> ans){
        
        if(curr.size() == k){
            ans.add(new ArrayList<>(curr));
            return;
        }
        
        for(int i = start;i<=n;i++){
            
            curr.add(i);
            generateSubsets(i+1, n, k, curr, ans);
            curr.remove(curr.size() - 1);
        }
    }
}