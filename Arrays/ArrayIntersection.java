import java.util.Scanner;

public class ArrayIntersection {
    
    public void acceptArray(int arr[],int n)
    {

          Scanner sc = new Scanner(System.in);  
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
    }
    /* 
    public void print()
    {
        this.arr = arr;
        for(int i =0;i<n-1;i++)
        {
            System.out.println(arr[i]);
        }
    }*/

    public static void main(String[] args) {
        
       
        int n=0,m=0;
        System.out.println("Enter size for first Array:");
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println("Enter size for second Array:");
        m = s.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[m];
     

        ArrayIntersection obj = new ArrayIntersection();
        System.out.println("Enter elements for first array:");
        obj.acceptArray(arr1,n);
        System.out.println("Enter elements for first array:");
        obj.acceptArray(arr2,m);
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                if(arr1[i]==arr2[j])
                {
                    System.out.println(arr1[i]);;
                }
            }
        }
        
    }
}
