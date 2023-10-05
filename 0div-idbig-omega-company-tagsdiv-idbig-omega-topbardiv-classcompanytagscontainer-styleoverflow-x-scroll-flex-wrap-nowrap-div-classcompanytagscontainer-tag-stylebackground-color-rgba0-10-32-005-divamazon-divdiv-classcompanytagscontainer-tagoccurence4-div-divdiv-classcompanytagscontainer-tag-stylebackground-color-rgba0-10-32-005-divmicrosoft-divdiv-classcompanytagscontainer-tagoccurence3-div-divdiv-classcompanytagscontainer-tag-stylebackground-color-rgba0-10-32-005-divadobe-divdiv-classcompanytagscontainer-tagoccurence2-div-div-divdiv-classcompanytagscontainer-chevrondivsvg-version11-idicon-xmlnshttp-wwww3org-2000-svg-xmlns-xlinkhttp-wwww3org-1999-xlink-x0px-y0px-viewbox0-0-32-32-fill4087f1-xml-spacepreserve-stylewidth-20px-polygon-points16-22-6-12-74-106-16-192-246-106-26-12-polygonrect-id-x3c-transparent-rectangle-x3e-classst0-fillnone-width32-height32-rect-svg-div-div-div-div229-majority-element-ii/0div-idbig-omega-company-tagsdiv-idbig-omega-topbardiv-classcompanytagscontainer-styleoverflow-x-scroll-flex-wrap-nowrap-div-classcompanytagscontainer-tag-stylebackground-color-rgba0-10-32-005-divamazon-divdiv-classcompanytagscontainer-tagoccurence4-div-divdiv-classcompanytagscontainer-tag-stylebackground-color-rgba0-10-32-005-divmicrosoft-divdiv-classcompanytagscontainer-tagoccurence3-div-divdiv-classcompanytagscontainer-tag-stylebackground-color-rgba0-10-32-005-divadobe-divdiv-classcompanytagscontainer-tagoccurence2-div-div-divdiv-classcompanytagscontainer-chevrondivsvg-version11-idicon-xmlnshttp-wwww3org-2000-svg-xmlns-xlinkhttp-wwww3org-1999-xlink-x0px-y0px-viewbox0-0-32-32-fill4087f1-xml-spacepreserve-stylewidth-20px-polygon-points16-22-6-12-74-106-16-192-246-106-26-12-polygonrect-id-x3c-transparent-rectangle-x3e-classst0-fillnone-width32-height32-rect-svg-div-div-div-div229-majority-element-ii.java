class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();
        int length = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int thresHold = length/3;

        for(int i=0;i<length;i++){
            if(mp.containsKey(nums[i])){
                mp.put(nums[i],mp.get(nums[i])+1);
            }else{
                mp.put(nums[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : mp.entrySet()){

            if(entry.getValue() > thresHold){
                ans.add(entry.getKey());
            }
        }
        return ans;
    }
}