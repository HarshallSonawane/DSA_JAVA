class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        int len = 0;
        
        //Two pointer method
        while(left<right){
            
            //idea is to find the min height from both and then use it to calculate area repeatedly
            if(height[left] < height[right]){
                len = right - left;
                max = Math.max(max, height[left]*len);
                left++;
            }else{
                len = right - left;
                max = Math.max(max, height[right]*len);
                right--;
            }
        }
        return  max;
    }
}