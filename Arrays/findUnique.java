import java.util.Arrays;
import java.util.Scanner;

public class findUnique {
    
    public static void main(String[] args) {
        
        int arr[];
        arr = new int[10];
        int n=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements for array: ");
        n = s.nextInt();
        for(int i=0;i<n;i++ )
        {
            arr[i] = s.nextInt();
        }
            int res = arr[0];
            for (int i = 1; i <arr.length; i++)
                res = res ^ arr[i];
            System.out.println(res);
                
            
    }
}
