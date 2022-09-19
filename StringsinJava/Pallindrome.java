package StringsinJava;

public class Pallindrome {
    
    public static boolean checkString(String s1,String s2)
    {
        int i=0;
        int j=0;
        int flag =0;
        while(i<s1.length() && j<s2.length())
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                flag = 1;
            }
            i++;
            j++;
        }
        if(flag==1)
            return true;
        else    
            return false;
    }

    public static void main(String[] args) {
        
        String s1 = "mom";
        String s2 = "cat";
        boolean status = checkString(s1,s2);
        System.out.println(status);
    }
}
