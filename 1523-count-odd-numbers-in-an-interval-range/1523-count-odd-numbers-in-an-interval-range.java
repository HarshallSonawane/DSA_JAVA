class Solution {
    public int countOdds(int low, int high) {
        
        int total = high - low;
        if(high%2 != 0 || low%2 != 0){
            return (total/2)+1;
        }
        return total/2;
    }
}