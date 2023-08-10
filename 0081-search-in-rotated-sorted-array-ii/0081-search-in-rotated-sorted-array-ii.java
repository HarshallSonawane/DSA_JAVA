class Solution {
    public boolean search(int[] arr, int target) {
        return BinarySearch(arr,target,0,arr.length-1);
    }
    
    public boolean BinarySearch(int arr[], int target, int left, int right){

        while(left <= right){
            int mid = left + (right - left)/2;
            if(target == arr[mid]){
                return true;
            }
            
            if (arr[left] == arr[right]){
                left++;
                continue;
            }
            
            //IS LEFT SORTED?
            if(arr[left] <= arr[mid]){
                
                //DOES TARGET LIE BETWEEN LOW AND MIDDLE
                if(arr[left] <= target && arr[mid] >= target){
                    right = mid - 1;
                }
                //TARGET LIE BETWEEN MID AND HIGH
                else{
                    left = mid + 1;
                }

            }
            //LEFT IS NOT SORTED WHICH MEANS RIGHT HALF IS SORTED
            else{
                //DOES TARGET LIE BETWEEN MIDDLE AND HIGH
                if(arr[right] >= target && arr[mid] <= target){
                    left = mid + 1;
                }
                //TARGET LIE BETWEEN LOW AND MIDDLE
                else{
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}