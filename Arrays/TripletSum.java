
import java.util.Scanner;

public class TripletSum {

    public static void main(String args[])
    {
        int arr[] = {1 ,2, 3, 4 ,5, 6, 7 };
        int sum=0,count=0;
        Scanner s = new Scanner(System.in);
        sum = s.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=i+2;k<arr.length;k++)
                {
                    if((arr[i]+arr[j]+arr[j])==sum)
                    {
                        count++;
                   }
            }
            }
        }
        System.out.println(count);
    }
}