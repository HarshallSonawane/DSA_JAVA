package Recursion;

import java.util.Scanner;

public class countDigits {
    
    public static int countDigits(int n){

        if(n/10==0){
            return 1;
        }
        int count = countDigits(n/10);
        int finalCount = 1+count;
        return finalCount;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = countDigits(n);
        System.out.println(count);
    }
}
