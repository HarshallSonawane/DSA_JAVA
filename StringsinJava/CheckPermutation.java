package StringsinJava;

public class CheckPermutation {
    public static void main(String[] args) {
        
        String str1 = "abcde";
        String str2="dcbae";
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.length()==str2.length()){
            for(int j=0;j<str2.length();j++)
            {
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
        }
        }
        if(count==str1.length()){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
