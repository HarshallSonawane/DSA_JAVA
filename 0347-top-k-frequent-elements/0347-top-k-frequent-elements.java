class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int[] ans = new int[k];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = 
            new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
        
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            pq.add(e);
        }
        
        for(int i=0;i<k;i++){
            ans[i] = pq.poll().getKey();
        }
        
        return ans;
        
    }
}