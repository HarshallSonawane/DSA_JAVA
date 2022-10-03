package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] a = {4,5,3,2,1};
        selectionSort(a,a.length,0,0);
        System.out.println(Arrays.toString(a));
       
    }


    public static void selectionSort(int[] a,int i,int j,int max){

        if(i==0){
            return;
        }

        if(j<i){
            if(a[j]>a[max]){
                selectionSort(a, i, j+1, j);
            }else{
                selectionSort(a, i, j+1, max);
            }
        }
        else{
            int temp = a[max];
            a[max] = a[i-1];
            a[i-1] = temp;
            
            selectionSort(a, i-1, 0, 0);
        }
        }
}
