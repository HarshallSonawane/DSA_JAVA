class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int e = piles[0];
        
        for(int i=0;i<piles.length;i++){
            e=Math.max(e,piles[i]);
        }
        while(s<e){
            int mid=s+(e-s)/2;
            
            if(isCorrect(mid,piles,h)){
                e=mid;
            }
            else
                s=mid+1;
        }
        return s;
    }
    
    public boolean isCorrect(int maxpiles,int[] piles,int h){
        
        int hours=0;
        for(int i:piles){
            int time=i/maxpiles;
            hours+=time;
            if(i%maxpiles!=0){
                hours++;
            } 
        }
        
        if(hours<=h){
            return true;
        } 
        return false;
    }
}