package SearchingAndSorting;

public class BubbleSort {
    
    public static void Bubblesort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j = i + 1;j < arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {6,9,4,10,67,1};
        Bubblesort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}

