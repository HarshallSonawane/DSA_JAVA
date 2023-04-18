class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans = new ArrayList<>();
        int max=0;
        int length = candies.length;
        for(int i=0;i<length;i++){
            
            if(candies[i] > max){
                max = candies[i];
            }
        }
        
        for(int j=0;j<length;j++){
            
            if(candies[j] + extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        
        return ans;
    }
}