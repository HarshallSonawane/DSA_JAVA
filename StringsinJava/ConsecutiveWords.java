package StringsinJava;

public class ConsecutiveWords {
    
    public static void Checkwords(String str)
    {
        int i=0;
        int j=0;
        for(i=0;i<=str.length();i++)
        {
            for(j=0;j<str.length();j++)
            {
                System.out.println(str.substring(i,j+1));
            }
        }
    }

    public static void main(String[] args) {
        
        String str = "xyz";
        Checkwords(str);
    }
}
