import java.util.Scanner;

public class SwapAlternate {
    public static void main(String[] args) {
        
        int[] arr = new int[10];  
        int n,temp=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Arrays elements");
        n = s.nextInt();
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
           
            arr[i]=s.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
            
        }
    }
}
