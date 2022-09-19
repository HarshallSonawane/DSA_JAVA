package Recursion;

public class CheckNumInArray {
    
    public static boolean checkNum(int[] arr,int num){

        boolean flag=false;
        if(arr.length<=1 && arr[0]!=num){
            return false;
        }
        int[] smallprblm = new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallprblm[i-1] = arr[i];
        }
        boolean smallans = checkNum(smallprblm, num);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                flag = true;
            }
        }
        if(flag){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int key = 8;
        System.out.println(checkNum(a, key));
    }
}

