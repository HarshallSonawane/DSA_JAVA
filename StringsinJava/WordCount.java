package StringsinJava;

public class WordCount {
    
    public static int wordCount(String s)
    {
        int wordcount = 0;
        int i=0;
        while( i<s.length())
        {
        if(s.charAt(i)== ' ' || s.charAt(i)== '\n')
        {
            ++wordcount;
        }
        i++;
        }
    return wordcount+1;
    }
    public static void main(String[] args) {
        
        String s = "This is a String";
        int finalcount = wordCount(s);
        System.out.println(finalcount);
    }
}
