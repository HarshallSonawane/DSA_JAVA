import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class EncodingMessage{
	public static void main (String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String s = sc.next();
            char[] c = s.toCharArray();
            for(int j=0;j<n;j=j+2){
                if(j==n-1){
                    c[j]=c[j];
                }
                else{
                    char a = c[j];
                    c[j] = c[j+1];
                    c[j+1]= a;
                }
            }
            for(int j=0;j<n;j++){
                c[j]= (char)('z'+'a' - c[j]);
                System.out.println((char)('z'+'a' - c[j]));
            }

            System.out.println(new String(c));
        }
	}
}
