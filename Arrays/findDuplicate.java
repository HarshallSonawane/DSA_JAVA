import java.util.Arrays;
import java.util.Scanner;

public class findDuplicate {
    
    
    public static void main(String[] args) {
        
        int n=0;
        int arr[] = {0 ,2 ,1 ,3 ,1};
        Arrays.sort(arr);
        System.out.println("Sorted Array is:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                n = arr[i];
            }
        }
        System.out.println("Duplicate Element is: " +n);









        // Scanner s = new Scanner(System.in);
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter size of the array: ");
        //n = s.nextInt();
        //for(int i=0;i<n-1;i++)
        //{
         //   arr[i]=sc.nextInt();
       // }
        
        //for(int i=0;i<n-1;i++)
       // {
        //    System.out.println(arr[i]);
       // }
        
    }
}
