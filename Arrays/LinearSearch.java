import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[])
    {
        int i=0;int key=0;
        System.out.println("Enter key to search: ");
        Scanner s = new Scanner(System.in);
        key = s.nextInt();
        int arr[] = {2,3,46,7,8,9};
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]==key)
            {
                System.out.println(i);
            }
        }
    }
}
