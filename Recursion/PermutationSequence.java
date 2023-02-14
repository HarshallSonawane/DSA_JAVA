package Recursion;

import java.util.ArrayList;


public class PermutationSequence {
    
    public static void main(String[] args) {
        
        ArrayList<String> ans = permutations("", "abc");
        System.out.println("Permutations: " +ans);
        System.out.println("No. of Permutations: " +permutationsCount("", "abc"));
    }


    static ArrayList<String> permutations(String p,String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<=p.length();i++){

            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            ans.addAll(permutations(first + ch + second, up.substring(1)));
        }

        return ans;
    }


    static int permutationsCount(String p,String up){

        if(up.isEmpty()){
            return 1;
        }

        char ch = up.charAt(0);
        int count = 0;

        for(int i=0;i<=p.length();i++){

            String first = p.substring(0,i);
            String second = p.substring(i,p.length());
            count = count + (permutationsCount(first + ch + second, up.substring(1)));
        }

        return count;
    }
} 
