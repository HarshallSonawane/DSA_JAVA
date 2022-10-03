package Recursion;

import java.util.Arrays;

public class BubbleSort {
    
    public static void main(String[] args) {
        
        int[] a = {4,5,3,2,1};
        bubbleSort(a,a.length-1,0);
        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] a, int i,int j){

        if(i==0){
            return;
        }
        if(j<i){
            if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
            }
            bubbleSort(a, i, j+1);
        }
        else{
            bubbleSort(a,i-1,0);
        }
    }
}
