package Recursion;

public class BinarySearch {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,6,8,14,67,88,90};
        int target = 88;
        System.out.println(BinaryySearch(arr, target, 0, arr.length-1));

    }

    public static int BinaryySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }

        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target<arr[mid]){
            return BinaryySearch(arr, target, s, mid-1);
        }
        
        return BinaryySearch(arr, target, mid+1, e);
        
    }
}
