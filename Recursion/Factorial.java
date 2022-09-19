package Recursion;

import java.util.Scanner;

public class Factorial {
    

    public static int factorial(int num){
        if(num==0){return 1;}
        return num* factorial(num-1);
    }
    public static void main(String[] args) {
        
        System.out.println("Enter Number to find factorial off: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int ans = factorial(num);
        System.out.println(ans);
        
    }
}
