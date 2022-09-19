import java.util.Scanner;

public class RotateArray {

    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7};
        
        int key=0,i=0;
        System.out.println("Enter Index for key: ");
        Scanner s = new Scanner(System.in);
        key=s.nextInt();
        for(i=key;i<a.length;i++)
        {
            System.out.println(a[i]);  
        }
        for(i=0;i<key;i++)
        {
            System.out.println(a[i]);  
        }
    }
    
}
