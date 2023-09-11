class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int len = 0;
        
        //Two pointer method
        while(left<right){
            
            //idea is to find the min height from both and then use it to calculate area repeatedly
            len = right - left;
            if(height[left] < height[right]){ 
                max = Math.max(max, height[left]*len);
                left++;
            }else{
                max = Math.max(max, height[right]*len);
                right--;
            }
        }
        return  max;
    }
}