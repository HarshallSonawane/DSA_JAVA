import java.util.ArrayList;
import java.util.Scanner;

public class PushZeroesToEnd {
    
    public static void main(String[] args) {
        
        int a[]={1,3,40,0,0,2,0,0,56};
       
        ArrayList<Integer> arrli  = new ArrayList<Integer>();
        //Scanner s = new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            {
                arrli.add(a[i]);
            }
        }
        
            System.out.println(arrli);
        

        
    }}
