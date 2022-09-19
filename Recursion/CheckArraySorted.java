package Recursion;

public class CheckArraySorted {
    
    public static boolean checksorted(int[] arr){

        boolean ans;
        if(arr.length<=1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        int[] smallprblm = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallprblm[i-1] = arr[i];
        }
    
        boolean smallans = checksorted(smallprblm);
        return smallans;
    } 

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        boolean ans = checksorted(arr);
        System.out.println(ans);
    }
}
