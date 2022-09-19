package Recursion;

import java.util.Scanner;

public class Exponent {

    public static int findExponent(int b,int exp){
        if(exp==0){
            return 1;
        }
        else{
        return (b*(findExponent(b,exp-1)));
        }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base number: ");
        int b = s.nextInt();
        System.out.println("Enter exponent number: ");
        int exp = s.nextInt();
        int ans = findExponent(b,exp);
        System.out.println(ans);
    }
}
