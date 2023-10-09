class Solution {
    public int[] searchRange(int[] arr, int target) {
        
        int ans[] = {-1,-1};
        int start = firstAndLastOccurence(arr, target, true);
        int last = firstAndLastOccurence(arr, target, false);
        ans[0] = start;
        ans[1] = last;
        return ans;
    }

    public int firstAndLastOccurence(int[] arr, int target, boolean isFirst){
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while(left<=right){
    
            int mid = left + (right - left)/2 ;
            
            if(arr[mid] == target){ 
                
                ans = mid;
                if(isFirst){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }

            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        
        return ans;
    }
}